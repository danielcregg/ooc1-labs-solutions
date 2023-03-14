package ie.atu.datatypes;

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
		final boolean GOD_EXISTS = true;
		final byte NUM_MONTHS_IN_YEAR = 12;
		final short COVID_DEATHS_IRELAND_2021 = 3452;
		final int NUM_YEARS_IN_DECADE = 1;
		final long NUM_YEARS_IN_MILLENIUM = 100000000l;
		final float PLANKS_CONSTANT = 6.62607015f;
		final double PI = 3.14159265358979d;
		final char BLOOD_TYPE = 'A';

		System.out.println("\n"); // Create a new line for easy reading

		// Display the eight variables (Constants)
		System.out.println("Constant Boolean Value: " + GOD_EXISTS);
		System.out.println("Constant Byte Value: " + NUM_MONTHS_IN_YEAR);
		System.out.println("Constant Short Value: " + COVID_DEATHS_IRELAND_2021);
		System.out.println("Constant Int Value: " + NUM_YEARS_IN_DECADE);
		System.out.println("Constant Long Value: " + NUM_YEARS_IN_MILLENIUM);
		System.out.println("Constant Float Value: " + PLANKS_CONSTANT);
		System.out.println("Constant Double Value: " + PI);
		System.out.println("Constant Char Value: " + BLOOD_TYPE);

		System.out.println("\n"); // Create a new line for easy reading

		// The next line generates an error because an constant cannot be changed
		// PI = 1.22222222;
	} // End main
} // End class
