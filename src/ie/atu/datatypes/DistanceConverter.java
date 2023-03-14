package ie.atu.datatypes;

import java.util.Scanner;

public class DistanceConverter
{
   public static void main(String[] args)
   {
       Scanner input;
	   double yards = 0;
        
	   //Create input object
	   input = new Scanner(System.in);
	 
		// Ask for the first integer and read it in
		System.out.println("Please enter your yards");
		yards = input.nextInt();
		   
		// Declare conversion rates as constants
		// This is the improvements
		final double YARDS_TO_FEET = 3;
		final double FEET_TO_INCHES = 12;

		// Old code
		//double feet = yards * 3;
		//double inches = feet * 12;

		// New code
		double feet = yards * YARDS_TO_FEET;
		double inches = feet * FEET_TO_INCHES;

		System.out.println(yards + " yards are: " + feet + "feet");
		System.out.println(yards + " yards are: " + inches + "inches");
	   
		// Close the input stream
		input.close();
   }
}
