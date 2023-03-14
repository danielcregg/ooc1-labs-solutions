package ie.atu.controlflow.loops;

import java.util.Scanner;

public class DoWhileSum {

	public static void main(String[] args) {

		double number, sum = 0.0;
		
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Enter a decimal point number: ");
			number = input.nextDouble();
			sum += number;
		} while (number != 0.0);

		System.out.println("Sum = " + sum);
		
		// Close scanner
		input.close();

	} // End main
} // End class
