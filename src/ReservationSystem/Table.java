package ReservationSystem;

import java.util.Scanner;

/*
 * <h4>Description:</h4>
 * <p>This class is the Table class which creates an object which describes a table in 
 * the restaurant. There is a count for the number of available seats at each table.
 * <br>
 * The class has a constructor which takes in a line from the text file "tableFile"
 * and reads the line which is assigned to a String and an integer once
 * split using the split method of the String class.
 * The class will also return the number of seats available per table.
 * </p>
 * @author Ian Bryan
 * */

public class Table extends ReservableItem{

	/*Class variables*/
	private int numberOfSeatsAvailable;
	private String nameOfPartyOnReservation;
	private String[] splitText = new String[2];

	/*
	 * <p>This is the "default" constructor that takes in a line from the tableFile document.
	 * The necessary information is extracted from the line and assigned to
	 * a class variable for the number of seats available per table and the name of the party 
	 * who booked it.
	 * </p>
	 * 
	 * @param Scanner inFile --> a line from the data file
	 * */
	public Table(Scanner inFile) {
		//System.out.println(inFile.nextLine() + "\n--New Line--");
		
		
	}

	/*
	 * <h4>Description</h4>
	 * <p>
	 * This is a simple getter for the number of seats available. 
	 * </p>
	 * */
	public int getNumberOfSeatsAvailable() {
		return numberOfSeatsAvailable;
	}

	@Override
	void addTable(String tableCapacity) {
		// TODO Auto-generated method stub
		
	}
}