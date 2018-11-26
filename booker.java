import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.*;
public class booker extends JPanel{
	static JPanel mainPane;
    final static boolean MULTICOLORED = false;

    private static void createAndShowGUI() {
    	destination[] dest = new destination[4];
    	departure[] depart = new departure[4];
    	dest[0] = new destination("New York", 300);
    	dest[1] = new destination("Vancover", 100);
    	dest[2] = new destination("Toronto", 250);
    	dest[3] = new destination("Seattle", 150);
//    	destPanel = new DPanel("Destination", dest);
    	// List of Destinations
    	depart[0] = new departure("New York", 300);
    	depart[2]= new departure("Vancover", 100);
    	depart[3] = new departure("Toronto", 250);
    	depart[4] = new departure("Seattle", 150);
    	
    	JFrame frame = new JFrame("Flight Booker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        mainPane = new JPanel();
        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
        if (MULTICOLORED) {
            mainPane.setOpaque(true);
            mainPane.setBackground(new Color(255, 0, 0));
        }
        mainPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        mainPane.add(Box.createRigidArea(new Dimension(0, 5)));
       // mainPane.add(destPanel);
        mainPane.add(Box.createRigidArea(new Dimension(0, 5)));
        //mainPane.add(departPanel);
        mainPane.add(Box.createGlue());
            }
    public static void book() {
    	int Selector;
    	String destChoice = null;
    	String departChoice = null;
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.println("v1 class Asign test");
    	destination DestNewYork = new destination("New York", 300);
    	destination DestVancover = new destination("Vancover", 100);
    	destination DestToronto = new destination("Toronto", 250);
    	destination DestSeattle = new destination("Seattle", 150);
    	// List of Destinations
    	departure DepartNewYork = new departure("New York", 300);
    	departure DepartVancover = new departure("Vancover", 100);
    	departure DepartToronto = new departure("Toronto", 250);
    	departure DepartSeattle = new departure("Seattle", 150);
    	// List of Departures
    	plane p1 = new plane("747", 5,12,.8);
    	plane p2 = new plane("747", 5,7,1);
    	plane p3 = new plane("747", 5,7,1.2);
    	plane p4 = new plane("747", 5,7,1.5);
    	//plane options
    	
    	flight s2tp1 = new flight(DestToronto, DepartSeattle, "a1",p1);
    	flight s2tp2 = new flight(DestToronto, DepartSeattle, "a2",p2);
    	flight s2tp3 = new flight(DestToronto, DepartSeattle, "b77",p3);
    	flight s2tp4 = new flight(DestToronto, DepartSeattle, "a132",p4);
    	flight s2np1 = new flight(DestNewYork, DepartSeattle, "d1",p1);
    	flight s2np2 = new flight(DestNewYork, DepartSeattle, "s21",p2);
    	flight s2np3 = new flight(DestNewYork, DepartSeattle, "f21",p3);
    	flight s2np4 = new flight(DestNewYork, DepartSeattle, "y61",p4);
    	flight s2vp1 = new flight(DestVancover, DepartSeattle, "d23",p1);
    	flight s2vp2 = new flight(DestVancover, DepartSeattle, "t24",p2);
    	flight s2vp3 = new flight(DestVancover, DepartSeattle, "k98",p3);
    	flight s2vp4 = new flight(DestVancover, DepartSeattle, "c23",p4);
    	flight v2sp1 = new flight(DestSeattle, DepartVancover, "d55",p1);
    	flight v2sp2 = new flight(DestSeattle, DepartVancover, "hg12",p2);
    	flight v2sp3 = new flight(DestSeattle, DepartVancover, "vy6",p3);
    	flight v2sp4 = new flight(DestSeattle, DepartVancover, "s12",p4);
    	flight v2np1 = new flight(DestNewYork, DepartVancover, "c61",p1);
    	flight v2np2 = new flight(DestNewYork, DepartVancover, "k75",p2);
    	flight v2np3 = new flight(DestNewYork, DepartVancover, "x35",p3);
    	flight v2np4 = new flight(DestNewYork, DepartVancover, "j65",p4);
    	flight v2tp1 = new flight(DestToronto, DepartVancover, "127",p1);
    	flight v2tp2 = new flight(DestToronto, DepartVancover, "b516",p2);
    	flight v2tp3 = new flight(DestToronto, DepartVancover, "st123",p3);
    	flight v2tp4 = new flight(DestToronto, DepartVancover, "lo98",p4);
    	flight t2np1 = new flight(DestNewYork, DepartToronto, "pol7",p1);
    	flight t2np2 = new flight(DestNewYork, DepartToronto, "24y1",p2);
    	flight t2np3 = new flight(DestNewYork, DepartToronto, "h6y1",p3);
    	flight t2np4 = new flight(DestNewYork, DepartToronto, "da21",p4);
    	flight t2sp1 = new flight(DestSeattle, DepartToronto, "bt56",p1);
    	flight t2sp2 = new flight(DestSeattle, DepartToronto, "po87",p2);
    	flight t2sp3 = new flight(DestSeattle, DepartToronto, "aq11",p3);
    	flight t2sp4 = new flight(DestSeattle, DepartToronto, "oot96",p4);
    	flight t2vp4 = new flight(DestVancover, DepartToronto, "mm98",p1);
    	flight t2vp1 = new flight(DestVancover, DepartToronto, "ss08",p2);
    	flight t2vp2 = new flight(DestVancover, DepartToronto, "ww04",p3);
    	flight t2vp3 = new flight(DestVancover, DepartToronto, "sm64",p4);
    	flight n2sp1 = new flight(DestSeattle, DepartNewYork, "ss03",p1);
    	flight n2sp2 = new flight(DestSeattle, DepartNewYork, "br12",p2);
    	flight n2sp3 = new flight(DestSeattle, DepartNewYork, "as81",p3);
    	flight n2sp4 = new flight(DestSeattle, DepartNewYork, "po6",p4);
    	flight n2tp1 = new flight(DestToronto, DepartNewYork, "zfg1",p1);
    	flight n2tp2 = new flight(DestToronto, DepartNewYork, "ggx12",p2);
    	flight n2tp3 = new flight(DestToronto, DepartNewYork, "sdp12",p3);
    	flight n2tp4 = new flight(DestToronto, DepartNewYork, "r17",p4);
    	flight n2vp1 = new flight(DestVancover, DepartNewYork, "tf2",p1);
    	flight n2vp2 = new flight(DestVancover, DepartNewYork, "osrs1",p2);
    	flight n2vp3 = new flight(DestVancover, DepartNewYork, "as712",p3);
    	flight n2vp4 = new flight(DestVancover, DepartNewYork, "mon312",p4);
    	flight[] allFlights = {s2tp1, s2tp2, s2tp3, s2tp4,
    						   s2np1, s2np2, s2np3, s2np4,
    						   s2vp1, s2vp2 ,s2vp3, s2vp4,
    						   v2sp1, v2sp2, v2sp3, v2sp4,
    						   v2np1, v2np2, v2np3, v2np4,
    						   v2tp1, v2tp2, v2tp3, v2tp4,
    						   t2np1, t2np2, t2np3, t2np4,
    						   t2sp1, t2sp2, t2sp3, t2sp4,
    						   t2vp1, t2vp2, t2vp3, t2vp4,
    						   n2sp1, n2sp2, n2sp3, n2sp4,
    						   n2tp1, n2tp2, n2tp3, n2tp4,
    						   n2vp1, n2vp2, n2vp3, n2vp4};
    	//List of flights name based on departure location then destination location,and plane
    	
    	System.out.println("Select your Destintaion: (1. Vancover  2. Toronto  3. New York 4. Seattle");
    	Selector = keyboard.nextInt();
    	if (Selector == 1) {
    		destChoice="Vancover";
    		departChoice="Vancover";
    	}
    	else if(Selector ==2 ) {
    		destChoice="Toronto";
    		departChoice="Toronto";
    	}
    	else if(Selector ==3) {
    		destChoice="New York";
    		departChoice="New York";
    	}
    	else if(Selector ==4) {
    		destChoice = "Seattle";
    		departChoice = "Seattle";
    	}
    	//gives the user options for which city they want to go to
    	while(destChoice == departChoice) {
    	System.out.println("Select a diffrent city for Departure: (1. Vancover 2. Toronto  3. New York 4. Seattle");
    	Selector = keyboard.nextInt();
    	if (Selector == 1) {
    		departChoice="Vancover";
    		
    	}
    	else if(Selector ==2 ) {
    		departChoice="Toronto";
    	}
    	else if(Selector ==3) {
    		departChoice="New York";
    	}
    	else if(Selector ==4) {
    		departChoice = "Seattle";
    	}
    	}
    	// chose the city they are departing from 
    	System.out.println("Chose a flight");
    	int i = 0; 
    	flight[] chosenflights;
    	for(flight f:allFlights) {
    		if(destChoice == f.getDest()) {
    			if(departChoice == f.getDepart()) {
    				System.out.print(i);
    				System.out.println(f);
    				i++;
    				
    				
    			}
    		}
    	}
    	//prints out all flight that match the depature and destination citys
    	chosenflights = new flight[i];
    	i=0;
    	for(flight f:allFlights) {
    		if(destChoice == f.getDest()) {
    			if(departChoice == f.getDepart()) {
    				chosenflights[i]=f;
    				i++;
    				
    				
    			}
    		}
    	}
    	//assigns all values to an array to be selected from 
    	System.out.print("Chose a flight from above(number): ");
    	Selector = keyboard.nextInt();
    	while(Selector != 1&&Selector != 2&&Selector !=3&&Selector != 4) {
    		System.out.print("Chose a flight from above(number): ");
    		Selector = keyboard.nextInt();
    	}
    	// it the flight is out or range it will re ask what flight you want
    	Ticket t1 = new Ticket();
    	t1.setflight(chosenflights[Selector]);
    	// allows the user to select a flight and assigns that flight to the ticket
    	seats s1 = new seats(t1.returnFlight().getPlane());
    	s1.generateSeats();
    	//randomly creates a set of seats and if they are available or not
    	s1.displaySeats();
    	// displays the generated seats
    	System.out.print("Select a Seat(X): ");
    	int x,y;
    	x=keyboard.nextInt();
    	System.out.print("Seat(Y): ");
    	y=keyboard.nextInt();
    	while(s1.checkSeat()==false) {
    	s1.reserveSeat(x, y);
    	s1.displaySeats();
    	if(s1.checkSeat()==false) {
    		System.out.print("Select a Seat(X): ");
    		x=keyboard.nextInt();
    		System.out.print("Seat(Y): ");
    		y=keyboard.nextInt();
    	}
    	}
    	//asks the user to select a seat then removes it from the pool of available seats
    	paymentInfo pI1 = new paymentInfo();
    	payment pay1 = new payment(pI1,123);
    	//creates payment information and the individual payment 
    	//while(pay1.pVarify()==false) {
    		//to do loops if payment in not able to be verified till it can be or the user exits
    	//}
    	if (pay1.pVarify()==true) {
    		System.out.println("Payment Varified");
    	}
    	t1.setSeats(s1.getSeat(x, y));
    	t1.printTicket();
    	// creates a ticket for the user 
    }
    
    
	public static void main(String[] args)
	{   destination DestNewYork = new destination("New York", 300);
    	destination DestVancover = new destination("Vancover", 100);
    	destination DestToronto = new destination("Toronto", 250);
    	destination DestSeattle = new destination("Seattle", 150);
    	// List of Destinations
    	departure DepartNewYork = new departure("New York", 300);
    	departure DepartVancover = new departure("Vancover", 100);
    	departure DepartToronto = new departure("Toronto", 250);
    	departure DepartSeattle = new departure("Seattle", 150);
    	// List of Departures
    	plane p1 = new plane("747", 5,7,.8);
    	plane p2 = new plane("747", 5,7,1);
    	plane p3 = new plane("747", 5,7,1.2);
    	plane p4 = new plane("747", 5,7,1.5);
    	//plane options
    	
    	flight s2tp1 = new flight(DestToronto, DepartSeattle, "a1",p1);
    	flight s2tp2 = new flight(DestToronto, DepartSeattle, "a2",p2);
    	flight s2tp3 = new flight(DestToronto, DepartSeattle, "b77",p3);
    	flight s2tp4 = new flight(DestToronto, DepartSeattle, "a132",p4);
    	flight s2np1 = new flight(DestNewYork, DepartSeattle, "d1",p1);
    	flight s2np2 = new flight(DestNewYork, DepartSeattle, "s21",p2);
    	flight s2np3 = new flight(DestNewYork, DepartSeattle, "f21",p3);
    	flight s2np4 = new flight(DestNewYork, DepartSeattle, "y61",p4);
    	flight s2vp1 = new flight(DestVancover, DepartSeattle, "d23",p1);
    	flight s2vp2 = new flight(DestVancover, DepartSeattle, "t24",p2);
    	flight s2vp3 = new flight(DestVancover, DepartSeattle, "k98",p3);
    	flight s2vp4 = new flight(DestVancover, DepartSeattle, "c23",p4);
    	flight v2sp1 = new flight(DestSeattle, DepartVancover, "d55",p1);
    	flight v2sp2 = new flight(DestSeattle, DepartVancover, "hg12",p2);
    	flight v2sp3 = new flight(DestSeattle, DepartVancover, "vy6",p3);
    	flight v2sp4 = new flight(DestSeattle, DepartVancover, "s12",p4);
    	flight v2np1 = new flight(DestNewYork, DepartVancover, "c61",p1);
    	flight v2np2 = new flight(DestNewYork, DepartVancover, "k75",p2);
    	flight v2np3 = new flight(DestNewYork, DepartVancover, "x35",p3);
    	flight v2np4 = new flight(DestNewYork, DepartVancover, "j65",p4);
    	flight v2tp1 = new flight(DestToronto, DepartVancover, "127",p1);
    	flight v2tp2 = new flight(DestToronto, DepartVancover, "b516",p2);
    	flight v2tp3 = new flight(DestToronto, DepartVancover, "st123",p3);
    	flight v2tp4 = new flight(DestToronto, DepartVancover, "lo98",p4);
    	flight t2np1 = new flight(DestNewYork, DepartToronto, "pol7",p1);
    	flight t2np2 = new flight(DestNewYork, DepartToronto, "24y1",p2);
    	flight t2np3 = new flight(DestNewYork, DepartToronto, "h6y1",p3);
    	flight t2np4 = new flight(DestNewYork, DepartToronto, "da21",p4);
    	flight t2sp1 = new flight(DestSeattle, DepartToronto, "bt56",p1);
    	flight t2sp2 = new flight(DestSeattle, DepartToronto, "po87",p2);
    	flight t2sp3 = new flight(DestSeattle, DepartToronto, "aq11",p3);
    	flight t2sp4 = new flight(DestSeattle, DepartToronto, "oot96",p4);
    	flight t2vp4 = new flight(DestVancover, DepartToronto, "mm98",p1);
    	flight t2vp1 = new flight(DestVancover, DepartToronto, "ss08",p2);
    	flight t2vp2 = new flight(DestVancover, DepartToronto, "ww04",p3);
    	flight t2vp3 = new flight(DestVancover, DepartToronto, "sm64",p4);
    	flight n2sp1 = new flight(DestSeattle, DepartNewYork, "ss03",p1);
    	flight n2sp2 = new flight(DestSeattle, DepartNewYork, "br12",p2);
    	flight n2sp3 = new flight(DestSeattle, DepartNewYork, "as81",p3);
    	flight n2sp4 = new flight(DestSeattle, DepartNewYork, "po6",p4);
    	flight n2tp1 = new flight(DestToronto, DepartNewYork, "zfg1",p1);
    	flight n2tp2 = new flight(DestToronto, DepartNewYork, "ggx12",p2);
    	flight n2tp3 = new flight(DestToronto, DepartNewYork, "sdp12",p3);
    	flight n2tp4 = new flight(DestToronto, DepartNewYork, "r17",p4);
    	flight n2vp1 = new flight(DestVancover, DepartNewYork, "tf2",p1);
    	flight n2vp2 = new flight(DestVancover, DepartNewYork, "osrs1",p2);
    	flight n2vp3 = new flight(DestVancover, DepartNewYork, "as712",p3);
    	flight n2vp4 = new flight(DestVancover, DepartNewYork, "mon312",p4);
    	flight[] allFlights = {s2tp1, s2tp2, s2tp3, s2tp4,
    						   s2np1, s2np2, s2np3, s2np4,
    						   s2vp1, s2vp2 ,s2vp3, s2vp4,
    						   v2sp1, v2sp2, v2sp3, v2sp4,
    						   v2np1, v2np2, v2np3, v2np4,
    						   v2tp1, v2tp2, v2tp3, v2tp4,
    						   t2np1, t2np2, t2np3, t2np4,
    						   t2sp1, t2sp2, t2sp3, t2sp4,
    						   t2vp1, t2vp2, t2vp3, t2vp4,
    						   n2sp1, n2sp2, n2sp3, n2sp4,
    						   n2tp1, n2tp2, n2tp3, n2tp4,
    						   n2vp1, n2vp2, n2vp3, n2vp4};
    	int t = 0;
	JFrame frame = new JFrame("Booker");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainPanel panel = new mainPanel(allFlights, t);
	frame.getContentPane().add(panel);
	frame.pack();
	frame.setVisible(true);	
}
	}
