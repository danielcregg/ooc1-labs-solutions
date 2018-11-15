package ie.gmit.ooc2labs.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZero {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in); // Create scanner object
		int numerator = 0;
		int denominator = 0;
		boolean continueAsking = true; // determines if more input is needed
		
		do 
		{
			try {
				// Get numerator
				System.out.print("Please enter an integer numerator: ");     
				numerator = userInput.nextInt();
				// Get denominator
				System.out.print("Please enter an integer denominator: ");
				denominator = userInput.nextInt();
				// Print Result
				System.out.println("\nResult: " + (float) numerator/denominator);
				continueAsking = false; // input successful; end looping        
			} catch (InputMismatchException inputMisEx) {
				System.out.print("\nYou did not enter an integer: ");
				System.out.print( "Exception: " + inputMisEx );
				System.out.println("\nPlease try again!\n");
				userInput.nextLine(); // discard input so user can try again    
			} catch(ArithmeticException ae) {
				System.out.print("\nThere was an Arithmetic Error: ");
				System.out.print( "Exception: " + ae );
				System.out.println("\nPlease check your input numbers and try again!\n");
			} finally {
				userInput.close(); // Close Scanner object
			}
		} while (continueAsking);
		
	} // end main
} // end class DivideByZero

