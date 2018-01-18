package ie.gmit.javalabs.lab9polymorphism.overloading.calculator;

public class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}
