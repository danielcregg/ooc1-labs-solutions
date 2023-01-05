package ie.atu.examsolutions.oldLabs;

import java.util.Scanner;

public class factorial {

	
	
	
	
	public static void main(String[] args) {
		
		// Declare variables
		int number;
		int result;
		Scanner in;
		
		// Instantiate the scanner object
		in = new Scanner(System.in);
		
		///Prompt the user to enter the number to calculate the factorial of.
		System.out.println("Please Enter the number you wish to calculate the factorial of");
		
		// Read in the number
		number = in.nextInt();
		
		// Call the factorial method and store the answer in the result variable
		result = calcFactorial(number);

		// Display the result
		System.out.println("The factorial of "+number+" is "+result);
		
		// Close Scanner Object
		in.close();
	}

	
	
	
	
	
	// Method to calculate the factorial of a number
	// Return the factorial as a int
	private static int calcFactorial(int number) {
		// If the number is 0 or 1 then return 1 to the method that called it.
		// https://zero-factorial.com/whatis.html
		if(number<=1) {
			return 1;
		
		// Else return the result of number multiples by the answer of factorial of number-1
		// the return statement will wait for factorial(number-1) to give an answer before completing.
		} else {
			// for number = 3
			// 3 * calcFactorial(2) = 3 * (2 * calcFactorial(1)) = 3 * 2 * 1 = 6
			// http://stackoverflow.com/questions/8183426/factorial-using-recursion-in-java
			return number * calcFactorial(number - 1);	
		}
	}





}
	