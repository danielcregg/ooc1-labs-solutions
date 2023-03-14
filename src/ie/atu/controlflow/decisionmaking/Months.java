package ie.atu.controlflow.decisionmaking;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		birthMonthFinder();
		
	} // Close Main
	
	public static void birthMonthFinder(){

		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the number of the month you were born: ");

		int monthNumber = userInput.nextInt();
		
		if (monthNumber <= 12 && monthNumber >= 1) {
			System.out.print("You were born in ");
		}
		

		if (monthNumber == 1) {
			System.out.println("January");
		} else if (monthNumber == 2) {
			System.out.println("February");
		} else if (monthNumber == 3) {
			System.out.println("March");
		} else if (monthNumber == 4) {
			System.out.println("April");
		} else if (monthNumber == 5) {
			System.out.println("May");
		} else if (monthNumber == 6) {
			System.out.println("June");
		} else if (monthNumber == 7) {
			System.out.println("July");
		} else if (monthNumber == 8) {
			System.out.println("August");
		} else if (monthNumber == 9) {
			System.out.println("September");
		} else if (monthNumber == 10) {
			System.out.println("October");
		} else if (monthNumber == 11) {
			System.out.println("November");
		} else if (monthNumber == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid month number. Please enter a number between 1 and 12 inclusive.");
		} // Close if
		
		// Close Scanner object
		userInput.close();
	}
	
} // Close Class
