package ie.gmit.javalabs.oldLabs;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {

		//Declare the variables
		Scanner input;
		int year;
		
		// Initialize the Scanner object
		input = new Scanner(System.in);
		
		// Prompt the user to enter the year
		System.out.println("Please enter a year");
		// Read the users input
		year = input.nextInt();
		
		// If the year is divisible by 4 and not divisable by 100 or the year is divisible by 400
		// then it is a leap year..
		if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
			System.out.println("This is a leap year");
		else
			System.out.println("This is not a leap year");
			
		// Close the input stream
		input.close();
		
	}
	
}
