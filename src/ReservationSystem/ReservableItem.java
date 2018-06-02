package ReservationSystem;


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
abstract class ReservableItem extends Reservation{
	
	/*Class variables*/
	private final int TOTAL_RESERVATIONS_PER_TABLE = 10;
	private String nameID;
	Reservation[] listOfReservedTables = new Reservation[TOTAL_RESERVATIONS_PER_TABLE];
	
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
	 * <h4>Description:</h4>
	 * <p>Abstract method for getting the level of fitness
	 * for a reservation request.
	 * </p>
	 * 
	 * */
//	public abstract int getFitnessValue(Reservation res) {
//		
//	}
	
	/*
	 * <h4>Description</h4>
	 * <p>This is an abstract method that will take in an object
	 * of the Scanner class after it has been separated by the split method.
	 * </p>
	 * 
	 * */
	private void addTable(Table aTable) {
		for(int i=0;i<TOTAL_RESERVATIONS_PER_TABLE;i++) {
			listOfReservedTables[i] = 
		}
	}
	
	/*
	 * 
	 * 
	 * */
	
}
