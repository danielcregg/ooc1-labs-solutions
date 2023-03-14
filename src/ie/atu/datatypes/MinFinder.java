package ie.atu.datatypes;

import java.util.Scanner;

/*Write a program that prompts the user to enter two integers. 
Print the smaller of the two numbers entered. 
You�ll need to use a Scanner and a Math method.*/

public class MinFinder {

	public static void main(String[] args) {

		// Declare input reference and the variables
		Scanner input;
		int number1, number2;// minNumber;
		
		//Create input object
		input = new Scanner(System.in);
		
		// Ask for the first integer and read it in
		System.out.println("Please enter your first Integer");
		number1 = input.nextInt();

		// Ask for the second integer and read it in
		System.out.println("Please enter your second Integer");
		number2 = input.nextInt();
		
		//minNumber=Math.min(number1, number2);
		
		// Display the smaller number using the Math Library
		//System.out.print("The smaller of the number is: "+ minNumber);
		System.out.print("The smaller of the number is: ");
		System.out.println(Math.min(number1, number2));
		
		// Close the input stream
		input.close();
		
	}

}
