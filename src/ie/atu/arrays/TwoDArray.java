package ie.atu.arrays;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {

		// Here we have declared and initialized a 2D array with 3 rows (Nested Arrays)
		// and 3 columns (with 3 elements each).
		// The first nested array has 3 elements, the second nested array has 3
		// elements, and the third nested array has 3 elements.
		// The first nested array is the first row, the second nested array is the
		// second row, and the third nested array is the third row.
		// Columns are the elements in each nested array. The first column contains 1,
		// 4, and 7. The second column contains 2, 5, and 8. The third column contains
		// 3, 6, and 9.
		// Row and column terminology is used to describe the elements in a 2D array
		// because it is similar to a table.

		// Declare and initialize a 2D array.
		int[][] numberArray1 = {
				{ 1, 2, 3 }, // 1st row (First nested array with 3 elements)
				{ 4, 5, 6 }, // 2nd row (Second nested array with 3 elements)
				{ 7, 8, 9 } // 3rd row (Third nested array with 3 elements)
		};

		// Declare and initialize a 2D array. This is another way to declare and
		// initialize a 2D array. All elements are initialized to 0.
		int[][] numbersArray2 = new int[3][3];

		// Update an elements to match the first 2D array
		numbersArray2[0][0] = 1;
		numbersArray2[0][1] = 2;
		numbersArray2[0][2] = 3;
		numbersArray2[1][0] = 4;
		numbersArray2[1][1] = 5;
		numbersArray2[1][2] = 6;
		numbersArray2[2][0] = 7;
		numbersArray2[2][1] = 8;
		numbersArray2[2][2] = 9;

		// Find the length (i.e. the number of rows AKA nested arrays) of the 2D array
		System.out.println(numberArray1.length); // Answer = 3

		// Find the length of the first row (AKA first nested array) in the 2D array
		// i.e. max number of elements or capacity of number of columns in the first
		// nested array
		System.out.println(numberArray1[0].length); // Answer = 3

		// Print the first two dimensional array using a nested for loop
		for (int i = 0; i < numberArray1.length; i++) {
			for (int j = 0; j < numberArray1[i].length; j++) {
				System.out.print(numberArray1[i][j] + "\t");
			}
			System.out.println("\n");
		}

		// Print the second 2 dimensional using a nested for each loop
		for (int[] innerArray : numbersArray2) {
			for (int element : innerArray) {
				System.out.print(element + "\t");
			}
			System.out.println("\n");
		}

		// Printing a two dimensional using for each loops can be easier to read but it
		// is not as flexible as using for loops.

		// Print a two dimensional array in Java using inbuilt method
		System.out.println(Arrays.deepToString(numberArray1));
		System.out.println(Arrays.deepToString(numbersArray2));

		// Modify all elements of the second two dimensional array.

		// You cannot use a for-each loop to modify the elements of an array. The
		// for-each loop gives you a copy of the element, not the actual element in the
		// array. If you try to modify it, the original array will not be changed.
		// But since you're dealing with an array of arrays, you can use a for-each loop
		// for the outer loop, and a regular for loop for the inner loop. This way, you
		// can modify the elements of the inner arrays:
		for (int i = 0; i < numbersArray2.length; i++) {
			for (int j = 0; j < numbersArray2[i].length; j++) {
				numbersArray2[i][j] = 9;
			}
		}

		// Print the second two dimensional array to see the updated elements
		System.out.println(Arrays.deepToString(numbersArray2));

		// Modifty the first two dimensional array using a nested for each loop
		for (int[] innerArray : numbersArray2) {
			for (int i = 0; i < innerArray.length; i++) {
				innerArray[i] = 8;
			}
		}

		// Print the second two dimensional array to see the updated elements
		System.out.println(Arrays.deepToString(numbersArray2));

		// Create a 2 dimensional array where nested arrays have different lengths (i.e.
		// different number of elements)
		String[][] jagged2Darray = new String[2][]; // OK
		// Print the 2 dimensional array with nested arrays yet uninitialised. Nested
		// arrays are null.
		System.out.println(Arrays.deepToString(jagged2Darray));
		// Populate the 2 dimensional array with nested arrays of different lengths
		jagged2Darray[0] = new String[5]; // The first nested array has 5 elements
		jagged2Darray[1] = new String[3]; // The second nested array has 3 elements
		// Print the 2 dimensional array with nested arrays of different lengths using a
		// nested for each loop
		for (String[] innerArray : jagged2Darray) {
			for (int i = 0; i < innerArray.length; i++) {
				System.out.print(innerArray[i] + "\t");
			}
			System.out.println("\n");
		}

		// Populate the jagged 2D array with elements using a nested for each loop

		for (String[] innerArray : jagged2Darray) {
			for (int i = 0; i < innerArray.length; i++) {
				innerArray[i] = "Element";
			}
		}

		// Print the 2 dimensional array with nested arrays of different lengths
		for (String[] innerArray : jagged2Darray) {
			for (int i = 0; i < innerArray.length; i++) {
				System.out.print(innerArray[i] + "\t");
			}
			System.out.println("\n");
		}

		// int[][] wrong = new int[][]; // not OK, you must specify number of rows (i.e.
		// nested arrays)

		// How to initialize two dimensional array in Java using a for loop
		String[][] ticTacToeBoard = new String[3][3];
		for (int i = 0; i < ticTacToeBoard.length; i++) {
			for (int j = 0; j < ticTacToeBoard[i].length; j++) {
				ticTacToeBoard[i][j] = "empty";
			}
		}

		// Print the 2 dimensional array with nested arrays of different lengths
		for (String[] innerArray : ticTacToeBoard) {
			for (int i = 0; i < innerArray.length; i++) {
				System.out.print(innerArray[i] + "\t");
			}
			System.out.println("\n");
		}

		// Populate the tictactoeboard with x and o for every second element.
		// The first row will read x o x, the second row will read o x o, and so on.
		for (int i = 0; i < ticTacToeBoard.length; i++) {
			for (int j = 0; j < ticTacToeBoard[i].length; j++) {
				if ((i + j) % 2 == 0) {
					ticTacToeBoard[i][j] = "x";
				} else {
					ticTacToeBoard[i][j] = "o";
				}
			}
		}

		// Print the 2 dimensional array with nested arrays of different lengths
		for (String[] innerArray : ticTacToeBoard) {
			for (int i = 0; i < innerArray.length; i++) {
				System.out.print(innerArray[i] + "\t");
			}
			System.out.println("\n");
		}

	}
}
