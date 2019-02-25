package ie.gmit.ooc1labs.lab7arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// Declare an Array and assign values
		String[] cars = {"Ford", "Nissan", "Toyota"};
		System.out.println(cars);
		
		int[] ages = new int[3];
		
		// Access elements of array
		
		System.out.println(ages[2]);
		
		ages[1] = 22;
		
		System.out.println(ages[1]);
		
		//Inbuilt array methods
		System.out.println(cars.length);
		
		// Access all elements of array
		for(int i =0; i < cars.length; i++) {
			ages[i] = i;
		}
		
		// Print all elements of array
		for(int i =0; i < cars.length; i++) {
			System.out.println(ages[i]);
		}
		
		// Create an array that holds all values form 100 to 1
		
		
		int[] arr = {10,15,7,20,11,2}; 
		int i = 3; 
		int x = -1; 
		int y = 100;
		
		//1
		x = arr[3];
		System.out.println(x);
		//2
		x = 2 * arr[0]; 
		System.out.println(x);
		//3
		x = arr[1] + arr[2]; 
		System.out.println(x);
		x = arr[i] + i; 
		//4
		System.out.println(x);
		y = x + arr[5]; 
		System.out.println(y);
		x = arr[i] + 1; 
		//5
		System.out.println(x);
		y = arr[i+1];
		System.out.println(y);
	}

}
