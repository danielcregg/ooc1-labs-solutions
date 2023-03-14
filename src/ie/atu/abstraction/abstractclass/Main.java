package ie.atu.abstraction.abstractclass;

public class Main {
	public static void main(String[] args) {
		// If a class is declared abstract, it cannot be instantiated.
		//AbstractClass abObj1 = new AbstractClass();
		
		// To use an abstract class, you have to inherit it from another class. 
		ConcreteSubClass subClassObj1 = new ConcreteSubClass();
		
		// If you inherit an abstract class, you have to provide implementations
		// to all the abstract methods in it.

		// Abstract classes may or may not contain�abstract methods.
		// If a class has at least one abstract method, then the class�must be
		// declared abstract.

	} // end Main method
} // end Main class
