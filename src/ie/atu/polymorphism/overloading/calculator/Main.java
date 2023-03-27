package ie.atu.polymorphism.overloading.calculator;

public class Main {

	public static void main(String[] args) {
		// Creating Calculator Object
		Calculator calcObj1 = new Calculator();
		
		System.out.println(		calcObj1.add(10, 20.1)		);
		System.out.println(		calcObj1.add(10, 20.5, 30)	);
		System.out.println(		calcObj1.add(1.1, 1.2)		);
		System.out.println(		calcObj1.add(5.5, 4)		);
		
	} // End Main
} // end Class
