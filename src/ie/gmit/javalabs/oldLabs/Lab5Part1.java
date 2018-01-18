package ie.gmit.javalabs.oldLabs;

import java.util.Scanner;


public class Lab5Part1 {

	public static void main(String[] args) {

				//Declare the variables
				Scanner input;
				int value;
				int count = 0;
				
				// Initialize the Scanner object
				input = new Scanner(System.in);
				
				System.out.println("This program reads in numbers, supplied by the user, until the user supplies\n"
								 + "a number that is evenly divisable by 6 or 17.\n");
				
				// Prompt the user to enter a  number
				System.out.println("Please enter a positive integer:");
				// Read the users input
				value = input.nextInt();
				
				
				//while (!input.hasNextInt()) {
			    //    System.out.println ("Error: INVALID INPUT, please try again\n");
			    //    System.out.println("Please enter a number");
			    //}
				
				
				// While value is not divisible by 6 and not divisible by 17
				while(value % 6 !=0 && value % 17 !=0)
				{
					//Increment the number of numbers read in that are outside the criteria
					count++;
					
					// Prompt the user to enter a  number
					System.out.println("Please enter your number");
					// Read the users input
					value = input.nextInt();
				}
				
				// Alert user that they have entered a sentinel value
				if (value % 6 == 0)
				{
					System.out.println(value + " is evenly divisible by 6. Calculating number of reads...");
				}
				else if (value % 17 == 0)
				{
					System.out.println(value + " is evenly divisible by 17. Calculating number of reads...");
				}
				
				System.out.println("Numbers Read = " + count);
					
				// Close the input stream
				input.close();

	}

}
