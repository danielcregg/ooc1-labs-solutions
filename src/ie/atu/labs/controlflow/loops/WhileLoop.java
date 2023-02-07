package ie.atu.labs.controlflow.loops;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 5) {
			//System.out.println("We have entered the while loop. i must be <= 5");
			//System.out.println("i = " + i);
			System.out.println(("This is iteration " + i));
			//System.out.println("Incrementing i...");
			i++; // Increment iterator
			//System.out.println("i is now = " + i);
			//System.out.println("Exiting while loop and checking value of i again.\n");
		}

	}
}