
public class Ticket {
	
	private flight fl;
	private seat seat;
	
	public Ticket( ) {
		
	}
	
	public void setSeats(seat s) {
		seat = s;
	}
	public void setflight(flight f) {
		fl = f;
	}
	public void printTicket() {
		seat.returnSeatCord();
		System.out.println(" flight: "+ fl);
	}
	public flight returnFlight() {
		return fl;
	}
}
