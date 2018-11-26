public class plane {
	    // A Constraint and a Variable
		private String model;
		private int coll;
		private int rows;
		private int seats;
		private double costMod;
		
		// Constructor
		public plane(String m,int c, int r,double cM)
		{
			model = m;
			coll = c;
			rows = r;
			seats = coll * rows;
			costMod = cM;
		}
		
		// Getters
		public int getRows()
		{
			return rows;
		}
		
		public int getColl()
		{
			return coll;
		}
		public int getSeats()
		{
			return seats;
		}
		public String toString()
		{
			return "The " + model+" has "+ seats+" seats";
		}
		public double getCostMod() {
			return costMod;
		}
		
}


