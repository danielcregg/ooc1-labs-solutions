package ie.gmit.javalabs2.collections;

import java.util.ArrayList; // Use Ctrl+Shift+O to add
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // Need to use Integer not int
		
		// Add Values to ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Get values from ArrayList
		System.out.println("Number at index 0 = " + numbers.get(0));

		System.out.println("Iterating over ArrayList: ");
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		// This will call the toString method which is inherited from AbstractCollection
		System.out.println(numbers);
		
		// Remove elements from end (quick)
		numbers.remove(numbers.size() - 1);
		
		// remove element from start (slow); - Solution linked list
		numbers.remove(0);
		
		// Introduced with the Java version 5.0
		System.out.println("Enhanced for loop iteration: ");
		for (Integer element : numbers) {
			System.out.println(element);
		}
		
		// Collections Classes (e.g. ArrayList, LinkedList) implement List interface
		List<String> words = new ArrayList<String>();
		words.add("hello");
		System.out.println(words.get(0));
	}
}
