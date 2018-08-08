package ie.gmit.javalabs2.averageTemp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class averageCalculator {

	public static void main(String args[]) throws IOException {

		//try {
			
			File f = new File("src/ie/gmit/javalabs2/averageTemp/testResults.txt");

			Scanner s = new Scanner(f);

			int numIntsInFile = 0;
			int total = 0;

//			while (s.hasNextInt()) {
//				intCounter++;
//				total += s.nextInt();
//			}
//
//			System.out.println("Total results in file: " + intCounter);
//			System.out.println("Average of all results: " + (double) total / intCounter);

			// Find how many integers are in the file
			while (s.hasNextInt()) {
				numIntsInFile++;
				s.nextInt();
			}
			
			// Create an array to hold the ints
			int[] arr = new int[numIntsInFile];
			
			//ArrayList<Integer> arrList = new ArrayList<Integer>();
			
			// Create a new scanner to navigate file
			Scanner s2 = new Scanner(f);
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s2.nextInt();
				total += arr[i];
				//arrList.add(arr[i]);
			}
			
			System.out.println("Total results in file: " + arr.length);
			System.out.println("All Results: " + Arrays.toString(arr));
			System.out.println("Average of all results: " + (double) total / arr.length);
			//System.out.println("Average of all results: " + (double) total / arrList.size());
			
			s.close();
			s2.close();
		
		
		//} catch (Exception e) {
		//	return null;
		//}
	}
}
