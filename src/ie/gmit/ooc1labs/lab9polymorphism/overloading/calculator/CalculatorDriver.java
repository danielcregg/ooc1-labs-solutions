package ie.gmit.ooc1labs.lab9polymorphism.overloading.calculator;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		// Creating Calculator Object
		Calculator calcObj1 = new Calculator();
		
		System.out.println(		calcObj1.add(10, 20.1)		);
		System.out.println(		calcObj1.add(10, 20, 30)	);
		System.out.println(		calcObj1.add(0.1, 0.2)		);
		System.out.println(		calcObj1.add(5.5, 4)		);
		
	} // End Main

} // end Class
