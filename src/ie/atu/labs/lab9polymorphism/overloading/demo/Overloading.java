package ie.atu.labs.lab9polymorphism.overloading.demo;

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