package ie.atu.ooc1.arrays;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {

//		int[][] multiples = new int[4][2]; // 2D integer array with 4 rows and 2 columns
//		String[][] cities = new String[3][3]; // 2D String array with 3 rows and 3 columns
//		String[][] names = { { "Allen", "Alec", "Adam" }, { "Bill", "Bob", "Benny" } };
//
//		// You can also create a two-dimensional array where individual one-dimensional
//		// arrays have different lengths
//		String[][] myArray = new String[5][]; // OK
//
//		myArray[0] = new String[10];
//		myArray[1] = new String[5];
//
//		// int[][] wrong = new int[][]; // not OK, you must specify 1st dimension
//
//		// You can also create a two-dimensional array where individual one-dimensional
//		// arrays have different lengths
//		String[][] salutation = { { "Mr. ", "Mrs. ", "Ms. " }, { "Brennan", "Jones" } };

		// How to initialize two dimensional array in Java // using for loop
		int[][] board = new int[3][3];
		int counter = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = counter + i;
			}
		}

//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				System.out.println(board[i][j]);
//			}
//		}

//		// Print a two dimensional array in Java
//		for (int[] j : board) {
//			for (int i : j) {
//				System.out.print(i + "\t");
//			}
//			System.out.println("\n");
//		}

		// Print a two dimensional array in Java using inbuilt method
		//System.out.println(Arrays.deepToString(board));

		// 2D array length
		int[][] primes = new int[3][];
		int rows = primes.length; // 3
		primes[0] = new int[3];
		primes[1] = new int[2];
		primes[2] = new int[1];
		
		System.out.println(  primes[0].length)  ;
		System.out.println(  primes[1].length)  ;
		System.out.println(  primes[2].length)  ;
		//int cols = primes[0].length; // 2 
		//System.out.printf("int[3][2] has %s rows and %d columns %n", rows, cols);

		// Print a two dimensional array in Java using inbuilt method
		//System.out.println(Arrays.deepToString(primes));
		
		// Print a two dimensional array in Java
		for (int[] j : primes) {
			for (int i : j) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
