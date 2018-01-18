package ie.gmit.javalabs.lab9polymorphism.overloading.calculator;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();

		System.out.println(calc1.add(10, 20));
		System.out.println(calc1.add(10, 20, 30));
		System.out.println(calc1.add(.1, .2));
	}

}
