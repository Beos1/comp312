
public class seat {
	private boolean taken;
	private int x;
	private int y;
	
	public seat() {
	
	}
	public seat(int m, int t) {
		x = m;
		y = t;
		
	}
	
	public void takeseat() {
		taken = true;
	}
	public void emptyseat() {
		taken = false;
	}
	public boolean checkStatus() {
		return taken;
	}
	public void returnSeatCord() {
		System.out.print("Your seat is row "+(x+1)+" seat "+(y+1));
	}
}
