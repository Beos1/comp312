
public class order {

	private Ticket t1;
	private int orderNum;
	private flight fly;
	private payment pay;
	private double total;
	private paymentInfo pi;
	public order(int o1 , Ticket t, paymentInfo p1) {
		orderNum = o1;
		pi = p1;
		t1 = t;
		}
	public double getTotal() {
		total = fly.getTotal();
		return total;
	}
	public void doThePay(){
		pay.pVarify();
	}
	public int returnOrdnum() {
		return orderNum;
	}
}
