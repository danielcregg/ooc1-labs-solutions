package ie.atu.controlflow.decisionmaking;

import java.util.Scanner;

public class MonthsSwitchMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the month you were born: ");
		int monthNumber;
		monthNumber = in.nextInt();
		
		String monthName = birthMonthFinder(monthNumber);
		if (monthName.equals("Invalid month.")) {
			System.out.println("You enterend an invalid month number. "
					+ "Please enter a number between 1 and 12 inclusive.");
			monthNumber = in.nextInt();
			monthName = birthMonthFinder(monthNumber);
			System.out.print("You were born in " + monthName);
		} else {
			System.out.print("You were born in " + monthName);
		}
		
		// Close Scanner object
		in.close();
	}
	
	public static String birthMonthFinder(int monthNumber) {
		
		String monthName;
		
		switch (monthNumber) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				monthName = "Invalid month.";
				break;
			}
		return monthName;
	}
	
}
