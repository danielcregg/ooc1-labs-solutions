package ie.atu.controlflow.loops;

public class SimpleForLoop {

	public static void main(String[] args) {

	// for(initialization; test ; increment/decrement) {
	//     statement(s);
	// }

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("The value of i is: " + i);
//		}
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Outer loop iteration i = " + i);

			for (int j = 1; j <= 2; j++) {
				System.out.println("\tInner loop iteration j = " + j);
			}
	    }
		
//		int rows = 5;
//
//		for (int i = 1; i <= rows; ++i) {
//			for (int j = 1; j <= i; ++j) {
//				System.out.print(j + " ");
//			}
//			System.out.println("");
//		}

	}// End main
}// End class