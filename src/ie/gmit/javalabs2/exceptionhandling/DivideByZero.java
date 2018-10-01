package ie.gmit.javalabs2.exceptionhandling;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in); // Create scanner object
		int numerator = 0;
		int denominator = 0;

		// Get numerator
		System.out.print("Please enter an integer numerator: ");
		numerator = userInput.nextInt();

		// Get denominator
		System.out.print("Please enter an integer denominator: ");
		denominator = userInput.nextInt();

		// Print Result
		System.out.println("\nResult: " + numerator/denominator);
		
		userInput.close(); // Close Scanner object
	} // end main
} // end class DivideByZero
