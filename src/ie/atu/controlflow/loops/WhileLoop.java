package ie.atu.controlflow.loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 6; // Initialisation
		System.out.println("We are about to enter the loop. i = " + i);
		while (i <= 5) { // Test
			System.out.println("We have entered the while loop. i must be <= 5");
			System.out.println("i = " + i);
			System.out.println(("This is iteration " + i));
			System.out.println("Incrementing i...");
			i++; // Increment iterator
			System.out.println("i is now = " + i);
			System.out.println("Exiting while loop block and checking value of i again.\n");
		} // End while loop
		System.out.println("We have now moved on from the loop");
	} // End main method
} // End class