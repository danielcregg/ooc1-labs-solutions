package ie.gmit.javalabs.lab9polymorphism.overloading.calculator;

public class Calculator {
	
	public double add(int a, double b) {
		return a + b;
	}
	
	// Differs in number of parameters passed
	public double add(int a, double b, int c) {
		return a + b + c;
	}
	
	// Differs in the type of parameters
	public double add(double a, double b) {
		return a + b;
	}
	
	// Differs in the sequence of parameters
	public double add(double a, int b) {
		return a + b;
	}
	
	// Changing the return type of method does not work!
//	public int add(int a, double b) {
//		return a + b;
//	}
	
	// Changing the access modifer of method does not work!
//	private double add(int a, double b) {
//		return a + b;
//	}
	
}
