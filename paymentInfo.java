import java.util.Scanner;

public class paymentInfo {
	private String cardType;
	private double cardNum;
	private int exp;
	private int varification;
	private String ppUn;
	private String ppPw;
	
	
	public paymentInfo(String r, String t, String y, String u) {
		cardType = r;
		cardNum = Double.parseDouble(t);
		varification = Integer.parseInt(y);
		exp = Integer.parseInt(u);
	}
	public paymentInfo(String r, String t) {
	ppUn = r;
	ppPw = t;

	}
	public paymentInfo()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How would you like to pay for your ticket(1.Visa/2.MC/3.Paypal: ");
		int Selector;
		Selector = keyboard.nextInt();
		if(Selector == 1) cardType = "visa";
		else if (Selector == 2)cardType ="Mastercard";
		else if (Selector == 3)cardType = "Paypal";
		if(cardType=="Paypal") {
			System.out.print("Paypal username: ");
			ppUn=keyboard.nextLine();
			System.out.print("Paypal Password: ");
			ppPw=keyboard.nextLine();
		}
		else {
		System.out.println("enter your Card Number");
		cardNum = keyboard.nextDouble();
		System.out.println("Enter the Expiary Date");
		exp = keyboard.nextInt();
		System.out.println("Enter Varification Number");
		varification = keyboard.nextInt();
		}
		}
	
		public String getType() {
			return cardType;
		}
		
		public double getNum() {
			return cardNum;
		}
		
		public int getExp() {
			return exp;
		}
		
		public int getVar() {
			return varification;
		}
		public String toString() {
			String rs;
			if(cardType == null) {
				 rs = "Username: " + ppUn+ " Password: " +ppPw;
				
			}
			else {
				rs = "Cardtype: "+ cardType+ "cardNum: "+cardNum;
				
			}
			return rs;
		}
}
