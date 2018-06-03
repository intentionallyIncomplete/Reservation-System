package ReservationSystem;

import java.util.ArrayList;

/*
 * <h4>Class Description:</h4>
 * <p>
 * This class is responsible for creating reservable items
 * that are maintained in a list with data at each "reserved", or occupied
 * index.
 * 
 * Class is abstract and will have methods overridden in derived
 * classes. Class does not require constructor.
 * </p>
 * 
 * */
public class ReservableItem extends Reservation{

	/*Class variables*/
	private final int TOTAL_RESERVATIONS_PER_TABLE = 10;
	public String nameID;
	public int numSeatsAvailable;
	ArrayList<Reservation> reservableItems = new ArrayList<Reservation>(10);

	/*Class methods*/

	/*
	 * <h4>Description:</h4>
	 * <p>abstract getter method for returning the name of the party
	 * who booked the reservation.
	 * </p>
	 * */
	public String getId() {
		return nameID;
	}

	/*
	 * <h4>Method Description:</h4>
	 * <p>
	 * 
	 * </p>
	 * */
	public int getNumSeats() {
		return numSeatsAvailable;
	}

	/*
	 * <h4>Method Description:</h4>
	 * <p>
	 * 
	 * </p>
	 * 
	 * */
	public ArrayList<Reservation> getReservation() {
		return reservableItems;
	}
	
	/*
	 * 
	 * */
	public void makeListOfTables(Table aTable) {
		for(int i=0;i<reservableItems.size();i++) {
			reservableItems.add(aTable);
			System.out.println(aTable.toString() + "|| added to list");
		}
	}
}
