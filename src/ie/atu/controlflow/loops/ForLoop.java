package ie.atu.controlflow.loops;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		int iterations = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter number of iterations you want: ");
		
		iterations = userInput.nextInt();
		
		// for(initialization; condition ; increment/decrement){
		//     statement(s);
		// }
		
		for (int i = 1; i <= iterations; i++) {
			System.out.println("This is iteration " + i);
		}
	
		// Close scanner
		userInput.close();
	
	} // End main method
} // End class
