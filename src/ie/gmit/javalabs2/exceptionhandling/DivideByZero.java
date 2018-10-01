package ie.gmit.javalabs2.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;


public class DivideByZero {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in); // Create scanner object
		int numerator = 0;
		int denominator = 0;

		// Get numerator
		System.out.print("Please enter an integer numerator: ");     
		try {  
			numerator = userInput.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.printf( "\nException: %s\n", inputMismatchException );                                    
			System.out.println("Please enter an integer.\n");
			System.exit(-1); // Kill program
		}
		
		// Get denominator
		System.out.print("Please enter an integer denominator: ");
		try {
			denominator = userInput.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.err.printf( "\nException: %s\n", inputMismatchException );                                    
			System.out.println("Please enter an integer.\n");
			System.exit(-1); // Kill program
		}
		
		// Print Result
		try {
			System.out.println("\nResult: " + numerator/denominator);
		} catch(ArithmeticException e) {
			System.out.println("\nThere was an Arithmetic Error!");
			System.out.println("Please check your input numbers!");
			System.out.println( "Exception: " + e );
			
		}
		userInput.close(); // Close Scanner object
	} // end main
} // end class DivideByZero

