
public class flight {
	    // A Constraint and a Variable
		private destination dest;
		private departure depart;
		private String flightID;
		private plane plane;
		double total;
		// Constructor
		public flight(destination de, departure dp, String ID, plane p)
		{
			dest = de;
			depart = dp;
			flightID = ID;
			plane = p;
			total = dest.getCost() + depart.getCost();
			total = total*plane.getCostMod();
		}
		
		// Getters
		public destination getDestenation()
		{
			return dest;
		}
		
		public departure getDeparture()
		{
			return depart;
		}
		public double getTotal(){
			return total;			
		}
		
		public String getID()
		{
			return flightID;
		}
		public String toString()
		{
			return "Flight "+ flightID +" will depart from "+depart.getDepart()+" heading towards "+dest.getDest()+" Costing $"+total ;
		}
		public plane getPlane() {
			return plane;
		}
		public String getDest() {
			return dest.getDest();
		}
		public String getDepart() {
			return depart.getDepart();
		}
}
