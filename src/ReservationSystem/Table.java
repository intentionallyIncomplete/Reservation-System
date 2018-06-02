package ReservationSystem;

import java.util.Scanner;

/*
 * <h4>Description:</h4>
 * <p>This class is the Table class which creates an object which describes a table in 
 * the restaurant. There is a count for the number of available seats at each table.
 * <br>
 * The class has a constructor which takes in a line from the text file "tableFile"
 * 
 * 
 * @author Ian Bryan
 * */

public class Table extends ReservableItem{

	/*Class variables*/
	private int numberOfSeatsAvailable;
	
	/*
	 * <p>This is the "default" constructor that takes in a line from the tableFile document.
	 * The necessary information is extracted from the line and assigned to
	 * a class variable for the number of seats available per table and provided to the super class.
	 * </p>
	 * 
	 * @param Scanner inFile --> a line from the data file
	 * */
	public Table(Scanner inFile) {
		
	}
	
}
