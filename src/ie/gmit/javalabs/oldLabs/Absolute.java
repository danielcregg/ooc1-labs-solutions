package ie.gmit.javalabs.oldLabs;

import java.util.Scanner;


public class Absolute {
	
	public static void main(String[] args)
	   {
			// Declare variables
			Scanner input;
			float value;
			float absoluteValue;//, test;
	
			// Initialize the scanner object.
			input = new Scanner(System.in);
			
			// Ask the user to enter a number
			System.out.println("Please enter a number");
			
			// Put the user input
			value = input.nextFloat();
			
			
			//test = value = Math.abs(value);
			
			
			// The value is negative then multiple by -1 and assign to absolute value
			if(value<0)
				absoluteValue = value * -1;
			else
				absoluteValue = value;
				
			// Display absolute value
			System.out.println("The absolute value of " + value + " is " + absoluteValue);
			//System.out.println("test: The absolute value of " + value + " is " + test);
			//Close input
			input.close();
	   }
}
