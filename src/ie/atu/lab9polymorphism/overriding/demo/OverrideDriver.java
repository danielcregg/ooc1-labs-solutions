package ie.atu.lab9polymorphism.overriding.demo;

public class OverrideDriver {

	public static void main(String[] args) {
		SuperClass super1 = new SuperClass();
		SubClass sub1 = new SubClass();
		
		super1.greet();
		sub1.greet();
	}

}
