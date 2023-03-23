// This class contains a demonstration of overloading in Java. 
// Overloading is a feature that allows a class to have more than one method 
// having the same name, if their argument lists are different.

package ie.atu.polymorphism.overloading.demo;

public class Overloading {
	
	public void methodName(int intInput) {
		System.out.println("int Input : " + intInput);
	}
	
	public void methodName(String stringInput) {
		System.out.println("String Input : " + stringInput);
	}

	public void methodName(int intInput, String stringInput) {
		System.out.println("Input int And Input String : " + intInput + " " + stringInput);
	}
}