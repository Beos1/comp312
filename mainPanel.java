import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class mainPanel extends JPanel{
	private flight[] fDB;
	private JButton Book, Cancel, lookup,destdepart,flybutton,paybutton,paybutton2,paybutton3;
	private JButton[][] seatbutton;
	private JComboBox destlist,deplist,flightlist,paylist;
	private seat[][] availseats; 
	private int r,c,x;
	private Ticket[] tiks;
	private order ord;
	
	public mainPanel(flight[] allFlights, int z ) {
		int tic_cap = 50;
		Ticket[] tiks = new Ticket[tic_cap];
		int x=z;
		tiks[x] = new Ticket();
		flight[] fDB = allFlights;
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(250,300));
		Book = new JButton("Book a Flight");
		Book.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					Book.setVisible(false);
					Cancel.setVisible(false);
					lookup.setVisible(false);
					String [] location = {"Vancover", "Toronto", "New York", "Seattle"};
					JComboBox destlist= new JComboBox(location);
					JComboBox deplist= new JComboBox(location);
					JLabel destText = new JLabel("Destination");
					JLabel depText = new JLabel("Departure");
					destdepart = new JButton("Continue");
					JLabel ddwarn = new JLabel("Destination and departure locaions have to be diffrent.");
					destdepart.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(destlist.getSelectedIndex()==deplist.getSelectedIndex()) {
								ddwarn.setVisible(true);
						
							}
							else {
								destlist.setVisible(false);
								deplist.setVisible(false);
								destText.setVisible(false);
								depText.setVisible(false);
								destdepart.setVisible(false);
								ddwarn.setVisible(false);
					
								flight[] chosenflights;
								flight[] flightchoices;
								String destChoice = location[destlist.getSelectedIndex()];
								String departChoice=location[deplist.getSelectedIndex()];
								int i=0;
								for(flight f:fDB) {
									if(destChoice == f.getDest()) {
										if(departChoice == f.getDepart()) {
											i++;
			    				
										}
									}
								}
								flight[] choseFlight = new flight[i];
								String[] fch = new String[i];
								i = 0;
								for(flight f:fDB) {
									if(destChoice == f.getDest()) {
										if(departChoice == f.getDepart()) {
			    				
											fch[i]=f.toString();
											choseFlight[i]=f;
											i++;
										}
			    			
									}
								}
								JComboBox flightlist= new JComboBox(fch);
								flybutton = new JButton("Continue");
								JLabel flightText = new JLabel("Choose a flight");

								flybutton.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											flightText.setVisible(false);
											flightlist.setVisible(false);
											flybutton.setVisible(false);
											flight chosenflight = choseFlight[flightlist.getSelectedIndex()];
											tiks[x].setflight(chosenflight);
											int r = chosenflight.getPlane().getRows();
											int c = chosenflight.getPlane().getColl();
											int goodseats = 0;
											availseats = new seat[r][c];
											for(int i = 0; i<r;i++) {
												for(int t = 0; t<c;t++){
													availseats[i][t]= new seat(i,t);					
													if(Math.random()*2>=1) 
														availseats[i][t].takeseat();
													
													else availseats[i][t].emptyseat();
									//randomly generates a set of seats based on the size of the plane 
												}
								
											}
											JButton[][] seatbutton= new JButton[r][c];
												JLabel seatText = new JLabel("Choose a seat(red seats are taken).");
												JLabel takenTrueText = new JLabel("That seat is taken.");
												add(seatText);
												for(int i = 0; i<r;i++) {
													for(int t = 0; t<c;t++){
														if(availseats[i][t].checkStatus()==true) {
															
															seat chosenseat = availseats[i][t];
															seatbutton[i][t] = new JButton("o");
															seatbutton[i][t].setBackground(Color.green);
															seatbutton[i][t].addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	for(int i = 0; i<r;i++) {
																		for(int t = 0; t<c;t++){
																			seatbutton[i][t].setVisible(false);	
																		}
																	}
												
																	tiks[x].setSeats(chosenseat);
																	seatText.setVisible(false);
																	takenTrueText.setVisible(false);
																	JLabel payText = new JLabel("How would you like to pay for your ticket.");
																	String [] payTypeOptions = {"Visa", "Mastercard", "Paypal"};
																	JComboBox paylist= new JComboBox(payTypeOptions);
																	paybutton = new JButton("Next");
																	paybutton.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
														
																			paylist.setVisible(false);
																			paybutton.setVisible(false);
																			payText.setVisible(false);
																			if((paylist.getSelectedIndex()==0)||(paylist.getSelectedIndex()==1)) {
																				if(paylist.getSelectedIndex()==0) {
																					String paytype = "Visa";
																				}
																				else if (paylist.getSelectedIndex()==1) {
																					String paytype = "Mastercard";
																				}
															
																				JTextField ccnum = new JTextField("Card Number");
																				JTextField ccvari = new JTextField("Varification Number");
																				JTextField ccexp = new JTextField("Expiration date");
																				paybutton2 = new JButton("Next");
																				paybutton2.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent e) {
																						String payType;
																						if(paylist.getSelectedIndex()==1) { payType = "Visa";}
																						else {
																							payType = "Mastercard";
																						}
																						paymentInfo PI = new paymentInfo(payType, ccnum.getText(),ccvari.getText(),ccexp.getText());
																						remove(ccnum);
																						remove(ccvari);
																						remove(ccexp);
																						remove(paybutton2);
																						ord = new order(x, tiks[x], PI);
																						JLabel ornum = new JLabel("Your Order Number is: "+x);
																						add(ornum);
																						JFrame frame = new JFrame("Booker");
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
																						mainPanel panel = new mainPanel(allFlights, x);
																						frame.pack();
																						frame.setVisible(true);	
																	
																					}
																				});
																				add(ccnum);
																				add(ccvari);
																				add(ccexp);
																				add(paybutton2);
															
																			}
																			else if(paylist.getSelectedIndex()==2);{
																				JTextField ppname = new JTextField("paypal Username");
																				JTextField pppass = new JTextField("paypal password");
																				paybutton3 = new JButton("Next");
																				paybutton3.addActionListener(new ActionListener() {
																					public void actionPerformed(ActionEvent e) {
																						paymentInfo PI = new paymentInfo(ppname.getSelectedText(),pppass.getSelectedText());
																						remove(ppname);
																						remove(pppass);
																						remove(paybutton3);
																						ord = new order(x, tiks[x], PI);
																						JLabel ornum = new JLabel("Your Order Number is: "+x);
																						add(ornum);

																						
																						
																					}
																				});
																				tiks[x].printTicket();
																				add(ppname);
																				add(pppass);
																				add(paybutton3);
																				if((paylist.getSelectedIndex()==0)||(paylist.getSelectedIndex()==1)) {
																					ppname.setVisible(false);
																					pppass.setVisible(false);
																					paybutton3.setVisible(false);
																				}
																			}
														
																		}
																	});
																	add(payText);
																	add(paylist);
																	add(paybutton);
																}
															});
															add(seatbutton[i][t]);
														}
														else {
															seatbutton[i][t] = new JButton("x");
															seatbutton[i][t].setBackground(Color.red);
															seatbutton[i][t].addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	add(takenTrueText);
																}
															});
															add(seatbutton[i][t]);
														}
													}
												}
										}

								});
								add(flightText);
								add(flightlist);
								add(flybutton);
							}
						}
					});
					destlist.setSelectedIndex(0);
					deplist.setSelectedIndex(0);
					add(destText);
					add(destlist);
					add(depText);
					add(deplist);
					add(destdepart);
					add(ddwarn);
					ddwarn.setVisible(false);
					}
			}
				);
			this.add(Book);
			Cancel = new JButton("Cancle a Flight");
			Cancel.addActionListener(new CancelListener());
			this.add(Cancel);
			lookup = new JButton("Look up your Flight");
			lookup.addActionListener(new lookupListener());
			this.add(lookup);
	
		
		
		
	}
private class CancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mainPanel.this.setBackground(Color.green);

		}
	}
	private class lookupListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			mainPanel.this.setBackground(Color.blue);

		}
	}

}
