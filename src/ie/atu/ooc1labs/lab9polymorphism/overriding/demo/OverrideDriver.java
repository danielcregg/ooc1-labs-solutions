package ie.atu.ooc1labs.lab9polymorphism.overriding.demo;

public class OverrideDriver {

	public static void main(String[] args) {
		SuperClass super1 = new SuperClass();
		SubClass sub1 = new SubClass();
		
		super1.greet();
		sub1.greet();
	}

}
