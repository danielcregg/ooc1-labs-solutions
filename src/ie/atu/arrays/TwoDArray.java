package ie.atu.arrays;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {

		// Declare and initialize a 2D array
		int[][] array2D = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		// Print a two dimensional array in Java
		for (int[] innerArray : array2D) {
			for (int element : innerArray) {
				System.out.print(element + "\t");
			}
			System.out.println("\n");
		}

		// 2D integer array with 4 rows and 2 columns
		int[][] multiples = new int[4][2];

		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(multiples));

		// Update a two dimensional array in Java
		multiples[0][0] = 1;
		
		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(multiples));
		
		multiples[0][1] = 2;
		multiples[1][0] = 3;
		multiples[1][1] = 4;
		multiples[2][0] = 5;
		multiples[2][1] = 6;
		multiples[3][0] = 7;
		multiples[3][1] = 8;

		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(multiples));

		// Update all elements of a two dimensional array in Java
		for (int i = 0; i < multiples.length; i++) {
			for (int j = 0; j < multiples[i].length; j++) {
				multiples[i][j] = 9;
			}
		}

		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(multiples));

		// // 2D String array with 3 rows and 3 columns
		// String[][] cities = new String[3][3];
		// // 2D String array with 2 rows and 3 columns
		// String[][] names = {{ "Allen", "Alec", "Adam" }, { "Bill", "Bob", "Benny" }};

		// You can also create a two-dimensional array where individual one-dimensional
		// arrays have different lengths
		String[][] myArray = new String[2][]; // OK
		myArray[0] = new String[10];
		myArray[1] = new String[5];

		// Populate a two dimensional array in Java using enhanced for loops
		for (String[] innerArray : myArray) {
			for (int i = 0; i < innerArray.length; i++) {
				innerArray[i] = "Word";
			}
		}

		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(myArray));

		// String[][] salutation = {{ "Mr. ", "Mrs. ", "Ms. " }, { "Brennan", "Jones" }};
		
		//int[][] wrong = new int[][]; // not OK, you must specify 1st dimension

		// // How to initialize two dimensional array in Java using a for loop
		// int[][] board = new int[3][3];
		// int counter = 1;
		// for (int i = 0; i < board.length; i++) {
		// 	for (int j = 0; j < board[i].length; j++) {
		// 		board[i][j] = counter;
		// 		counter++;
		// 	}
		// }
		
		// System.out.println(board[1][1]);

		// for (int i = 0; i < board.length; i++) {
		// 	for (int j = 0; j < board[i].length; j++) {
		// 		System.out.print(board[i][j]);
		// 	}
		// 	System.out.println();
		// }

		// // Print a two dimensional array in Java
		// for (int[] j : board) {
		// 	for (int i : j) {
		// 		System.out.print(i + "\t");
		// 	}
		// 	System.out.println("\n");
		// }

		// // Print a two dimensional array in Java using inbuilt method
		// System.out.println(Arrays.deepToString(board));
//
		// // 2D array length
		// int[][] primes = new int[3][];
		// int rows = primes.length; // 3
		// primes[0] = new int[3];
		// primes[1] = new int[2];
		// primes[2] = new int[1];
//		
//		System.out.println(  primes[0].length)  ;
//		System.out.println(  primes[1].length)  ;
//		System.out.println(  primes[2].length)  ;
//		//int cols = primes[0].length; // 2 
//		//System.out.printf("int[3][2] has %s rows and %d columns %n", rows, cols);
//
//		// Print a two dimensional array in Java using inbuilt method
//		//System.out.println(Arrays.deepToString(primes));
//		
//		// Print a two dimensional array in Java
//		for (int[] j : primes) {
//			for (int i : j) {
//				System.out.print(i + "\t");
//			}
//			System.out.println("\n");
//		}
		
	}
}
