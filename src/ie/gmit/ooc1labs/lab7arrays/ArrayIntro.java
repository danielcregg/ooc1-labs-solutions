package ie.gmit.ooc1labs.lab7arrays;

public class ArrayIntro {

	public static void main(String[] args) {
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
