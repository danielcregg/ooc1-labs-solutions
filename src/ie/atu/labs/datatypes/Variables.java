package ie.atu.labs.datatypes;

public class Variables {

	public static void main(String[] args) {
		// Declare and initialize the eight primitive values
		boolean isAlive = true; // true or false
		byte age = 100; // -128 to 127
		short popLeitrim = 32044; // -32,768 to 32,767
		int popChina = 1412000000; // -2,147,483,648 to 2,147,483,647
		long numStarsMilkyway = 100000000000l; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float price = 1.11f; // 6 to 7 decimal digits
		double rocketFuelUsed = 11.14159265358979d; // 15 decimal digits
		char grade = 'A'; // Single character/letter

//Data Type	Size	Description
//boolean	1 bit	Stores true or false values
//byte	    1 byte	Stores whole numbers from -128 to 127
//short	    2 bytes Stores whole numbers from -32,768 to 32,767
//int	    4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	    8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	    4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
//char	    2 bytes Stores a single character/letter or ASCII values

		// Assign new values to all primitive variables
		isAlive = false;
		age = 22;
		popLeitrim = 32045;
		popChina = popChina + 2000000000;
		numStarsMilkyway = numStarsMilkyway + popLeitrim;
		grade = 'D';
		price = 2.22f;
		rocketFuelUsed = 100.14159245658978d;
		
		// Display the eight variables (Not Constants)
		System.out.println("Boolean Value: " + isAlive);
		System.out.println("Byte Value: " + age);
		System.out.println("Short Value: " + popLeitrim);
		System.out.println("Int Value: " + popChina);
		System.out.println("Long Value: " + numStarsMilkyway);
		System.out.println("Float Value: " + price);
		System.out.println("Double Value: " + rocketFuelUsed);
		System.out.println("Char Value: " + grade);

		// Declare and initialize eight primitive constant values
		final boolean godExisting = true;
		final byte numOfMonthsInYear = 12;
		final short covidDeathIreland2021 = 3452;
		final int constantIntValue = 1;
		final long constantLongValue = 10;
		final float constantFloatValue = 1.11f;
		final double pi = 3.14159265358979d;
		final char bloodType = 'A';

		System.out.println("\n"); // Create a new line for easy reading

		// Display the eight variables (Constants)
		System.out.println("Constant Boolean Value: " + godExisting);
		System.out.println("Constant Byte Value: " + numOfMonthsInYear);
		System.out.println("Constant Short Value: " + covidDeathIreland2021);
		System.out.println("Constant Int Value: " + constantIntValue);
		System.out.println("Constant Long Value: " + constantLongValue);
		System.out.println("Constant Float Value: " + constantFloatValue);
		System.out.println("Constant Double Value: " + pi);
		System.out.println("Constant Char Value: " + bloodType);

		System.out.println("\n"); // Create a new line for easy reading

		// The next line generates an error because an constant cannot be changed
		// pi = 1.22222222;
	} // End main
} // End class
