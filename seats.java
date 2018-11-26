public class seats {		
			// the seats class is the collection of seats on the plane
			private plane plane;
			private int r;
			private int c;
			private seat[][] availSeats;
			private boolean seatCheck = false;

			
			public seats(plane p) {
				plane = p;
				 r = plane.getRows();
				 c = plane.getColl();
				availSeats = new seat[r][c];
				// Constructor for the seats class
				 
			}
			
			public void generateSeats(){ 
				for(int i = 0; i<r;i++) {
					for(int t = 0; t<c;t++){
						availSeats[i][t]= new seat();					
						if(Math.random()*2>=1)
						availSeats[i][t].takeseat();
						else availSeats[i][t].emptyseat();
						//randomly generates a set of seats based on the size of the plane 
					}
				}
			}
			public void displaySeats() {
				System.out.print(" ");
				for (int k=0;k<c;k++) {
					System.out.print(k+1);
				}
				System.out.println();
				for(int i = 0; i<r;i++) {
					System.out.print(i+1);
					for(int t = 0; t<c;t++){
						if(availSeats[i][t].checkStatus()==true)System.out.print("o");
						else if (availSeats[i][t].checkStatus()==false)System.out.print("x");
							}
					/*
					 * Prints out the seats looking something like below
					 *  123456
					 * 1xoxoxo
					 * 2xoxoxo					 * 
					 * 3ooxxox
					 * 4xxxxxo
					 * 5xoxxox
					 * x's represent the taken seats and o's represent the open seats
					 */
					System.out.println();
					}

			
			}
			public void reserveSeat(int x , int y) {
				if (availSeats[y-1][x-1].checkStatus()==false) {
						System.out.println("Seat is taken.");
						System.out.println("Choose another seat");}
				else if (availSeats[y-1][x-1].checkStatus()==true) {
					availSeats[y-1][x-1].takeseat();
					seatCheck =true;
				}
					
			}
			//sets a seat to be taken the minuses are to translate
			//it to be easier for the user to enter their seat number
			public seat getSeat(int x, int y) {
			return availSeats[x-1][y-1];
			}
			public boolean checkSeat() {
				return seatCheck;
			}
}
			