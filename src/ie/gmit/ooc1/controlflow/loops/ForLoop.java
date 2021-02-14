package ie.gmit.ooc1.controlflow.loops;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter number of iterations you want: ");
		
		int N = userInput.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("This is iteration " + i);
		}
	
		userInput.close();
	
	}
}
