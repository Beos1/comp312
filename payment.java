
public class payment {

	private paymentInfo pI;
	// the payment info to be checked
	private boolean accdec;
	// if the payment is accepted or declined
	private int orderNum;
	// to check order status later 
	
	public payment(paymentInfo I, int oN){
		pI = I;
		orderNum = oN;
	}
	public boolean pVarify() {
	int exp = pI.getExp();
	if (exp == 0) {
		accdec=false;
		return false;
	}
	
	else {
		accdec = true;	
		return true;
	}
}
	public boolean getStatus() {
		return accdec;
	}
	public int returnNum(){
		return orderNum;
	}
}