package ie.atu.ooc1.operators;

public class Variables {

	public static void main(String[] args) {
		// Declare and initialize eight primitive values
		boolean booleanValue = true;
		byte byteValue = 1;
		short shortValue = 3;
		int intValue = 1;
		long longValue = 10l;
		float floatValue = 1.11f;
		double doubleValue = 2.1212d;
		char charValue = 'A';

		// Display the eight variables (Not Constants)
		System.out.println("Boolean Value: " + booleanValue);
		System.out.println("Byte Value: " + byteValue);
		System.out.println("Short Value: " + shortValue);
		System.out.println("Int Value: " + intValue);
		System.out.println("Long Value: " + longValue);
		System.out.println("Float Value: " + floatValue);
		System.out.println("Double Value: " + doubleValue);
		System.out.println("Char Value: " + charValue);

		// Declare and initialize eight primitive constant values
		final boolean constantBooleanValue = true;
		final byte constantByteValue = 1;
		final short constantShortValue = 3;
		final int constantIntValue = 1;
		final long constantLongValue = 10;
		final float constantFloatValue = 1.11f;
		final double constantDoubleValue = 2.1212d;
		final char constantCharValue = 'A';

		System.out.println("\n"); // Create a new line for easy reading

		// Display the eight variables (Constants)
		System.out.println("Constant Boolean Value: " + constantBooleanValue);
		System.out.println("Constant Byte Value: " + constantByteValue);
		System.out.println("Constant Short Value: " + constantShortValue);
		System.out.println("Constant Int Value: " + constantIntValue);
		System.out.println("Constant Long Value: " + constantLongValue);
		System.out.println("Constant Float Value: " + constantFloatValue);
		System.out.println("Constant Double Value: " + constantDoubleValue);
		System.out.println("Constant Char Value: " + constantCharValue);

		// Change the Non Constant variables
		booleanValue = false;
		byteValue = 22;
		shortValue = (short) (shortValue * 10);
		intValue = intValue + 2;
		longValue = longValue + shortValue;
		charValue = 'Z';
		floatValue = floatValue * 100;
		doubleValue = doubleValue / floatValue;

		System.out.println("\n"); // Create a new line for easy reading

		// Display the eight variables (Not Constants)
		System.out.println("Boolean Value: " + booleanValue);
		System.out.println("Byte Value: " + byteValue);
		System.out.println("Short Value: " + shortValue);
		System.out.println("Int Value: " + intValue);
		System.out.println("Long Value: " + longValue);
		System.out.println("Float Value: " + floatValue);
		System.out.println("Double Value: " + doubleValue);
		System.out.println("Char Value: " + charValue);

		// The next line generates an error because an constant cannot be changed
		// constantDoubleValue = 1.22222222;
	} // End main
} // End class
