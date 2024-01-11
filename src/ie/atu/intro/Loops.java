package ie.atu.intro;   // Declare the package name

// Define the class Loops
public class Loops {
	// Define the main method
	public static void main(String[] args) {
		// Declare and initialize variables a and b
		int a = 5, b = 10;

		// For loop that prints numbers from 1 to 100
		for (int i = 1; i<=100; i++ ) {
			System.out.print(i + " " );
		}
		
		// Declare and initialize variable z
		int z = 100;
		// While loop that prints numbers from 100 to 1
		while(z > 0) {
			System.out.print(z + " ");
			z--;
		}
		
		// Declare and initialize variable myString
		String myString = "Timmy";
		// Print the length of myString
		System.out.println(myString.length());
		// Change the value of myString
		myString = "Daniel Cregg";
		// Print the length of myString after removing spaces
		System.out.println(myString.replace(" ", "").length());
		
		// Call the multiply method with a and b as arguments
		multiply(a, b);
	}

	// Define the multiply method
	private static void multiply(int x, int y) {
		// Print the product of x and y
		System.out.println(x * y);
	}

} // End of the Loops class