package ie.gmit.ooc1labs.lab6iteration;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int count, num1 = 0, num2 = 1;
		
		System.out.println("How may numbers you want in the sequence:");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		scanner.close();
		
		System.out.print("Fibonacci Series of " + count + " numbers:");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");

			/*
			 * Every number after the first two is the sum of the two preceding numbers. On
			 * each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}

		 int i = 1;
		 while(i <= count)
		 {
			 System.out.print(num1+" ");
			 int sumOfPrevTwo = num1 + num2;
			 num1 = num2;
			 num2 = sumOfPrevTwo;
			 i++;
		 }

	}
}
