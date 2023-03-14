package ie.atu.datatypes;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		int a;
		int b;
 
		Scanner in = new Scanner(System.in);
 
		System.out.println("Enter your first integer:");
		a = in.nextInt();
		System.out.println("You entered " + a);
 
		System.out.println("Enter your second integer:");
		b = in.nextInt();
		System.out.println("You entered " + b);   
		
		//System.out.println("Smallest number = " + Math.min(a, b));
		
		// Print the largest number between a and b
		System.out.println("Largest number between " + a + " and " + b + " = " + Math.max(a, b));
		
		// Print the smallest number between a and b
		System.out.println("Smallest number between " + a + " and " + b + " = " + Math.min(a, b));
		
		in.close(); // Close Scanner
		System.out.println("\nGoodbye"); 
	}	
}