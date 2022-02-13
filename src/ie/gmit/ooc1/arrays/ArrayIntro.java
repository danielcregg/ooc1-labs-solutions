package ie.gmit.ooc1.arrays;

import java.util.Arrays;

public class ArrayIntro {
	public static void main(String[] args) {

		// Declaring an Array and assigning values
		int[] ages = new int[3];

		ages[0] = 19;
		ages[1] = 27;
		ages[2] = 34;
		// ages[3] = 51; // Array index out of bounds

		// Example 2
		String[] cars = { "Ford", "Nissan", "Toyota" };

		// Inbuilt array methods - length
		System.out.println(ages.length);
		System.out.println(cars.length);

		// Access elements of array
		System.out.println(ages[2]);
		System.out.println(cars[1]);

		// Access all elements of array
		for (int i = 0; i < cars.length; i++) {
			ages[i] = i;
		}

		// Print all elements of array
		System.out.println(cars); // Prints the hashcode values of the objects but I want to print the values of
									// these object

		for (int i = 0; i < cars.length; i++) {
			System.out.println(ages[i]);
		}

		System.out.println(Arrays.toString(cars)); // Need to import Arrays package

		// Create an array that holds all values form 1 to 100 and print it to the
		// console
		int[] myArr = new int[100];
		for (int i = 1; i <= 100; i++) {
			myArr[i - 1] = i;
		}
		System.out.println(Arrays.toString(myArr));

		// Array tests
		int[] arr = { 10, 15, 7, 20, 11, 2 };
		int i = 3;
		int x = -1;
		int y = 100;

		// 1
		x = arr[3];
		System.out.println(x);
		// 2
		x = 2 * arr[0];
		System.out.println(x);
		// 3
		x = arr[1] + arr[2];
		System.out.println(x);
		x = arr[i] + i;
		// 4
		System.out.println(x);
		y = x + arr[5];
		System.out.println(y);
		x = arr[i] + 1;
		// 5
		System.out.println(x);
		y = arr[i + 1];
		System.out.println(y);

	} // End main
} // End class
