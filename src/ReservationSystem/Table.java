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
	//private int numberOfSeatsAvailable;
	//private String nameOfPartyOnReservation;
	private String newLine;

	/*
	 * <p>This is the "default" constructor that takes in a line from the tableFile document.
	 * The line is split and each part of the line is assigned to a value in the String
	 * array that's created and used only when a Table is created.
	 * </p>
	 * 
	 * @param Scanner inFile --> a line from the data file
	 * */
	public Table(Scanner inFile) {
		this.newLine = inFile.nextLine();
		/* Split the line and parse the new array to two elements.
		 * The first element is the String for the name
		 * and the other is the seat capacity for
		 * each table found in the file.
		 * */
		String[] splitLine = newLine.trim().split("\\s+");
		//this.nameOfPartyOnReservation = splitLine[0];
		//this.numberOfSeatsAvailable = Integer.parseInt(splitLine[1]);
		nameID = splitLine[0];
		numSeatsAvailable = Integer.parseInt(splitLine[1]);
		
		/* <p>Uncomment for debugging. 
		 * Simply checks that the line was split properly and 
		 * values are assigned to the right variable.</p>
		 * */
//		System.out.println("ID: " + nameOfPartyOnReservation);
//		System.out.println("Number of Seats Available: " + numberOfSeatsAvailable);
		
	}

	/*
	 * <h4>Method Description:</h4>
	 * <p>
	 * This is a simple getter for the number of seats available. 
	 * </p>
	 * */
	public int getNumSeats() {
		return numSeatsAvailable;
	}
	
	public String getId() {
		return nameID;
	}
}