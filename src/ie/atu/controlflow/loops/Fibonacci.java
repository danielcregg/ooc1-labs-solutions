package ie.atu.controlflow.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int count = 0, num1 = 0, num2 = 1, sumOfPrevTwo = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How may numbers you want in the sequence:");
		count = userInput.nextInt();
		
		if (count < 1 ) {
			System.out.println("Please enter a number >= 1");
			System.exit(-1);
		}
		
		System.out.print("Fibonacci Series of " + count + " numbers:\n");

//		for (int i = 1; i <= count; i++) {
//			
//			System.out.print(num1 + ",");
//
//			/*
//			 * Every number after the first two is the sum of the two preceding numbers. On
//			 * each iteration, we are assigning second number to the first number and
//			 * assigning the sum of last two numbers to the second number
//			 */
//			sumOfPrevTwo = num1 + num2;
//			num1 = num2;
//			num2 = sumOfPrevTwo;
//		}

		 int i = 1;
		 while(i <= count)
		 {
			 System.out.print(num1 + ",");
			 sumOfPrevTwo = num1 + num2;
			 num1 = num2;
			 num2 = sumOfPrevTwo;
			 i++;
		 }
		 
		 
		 // Close the scanner object
		 userInput.close();
	}
}
