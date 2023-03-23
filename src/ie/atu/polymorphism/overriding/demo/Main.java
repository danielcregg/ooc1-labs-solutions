package ie.atu.polymorphism.overriding.demo;

public class Main {

	public static void main(String[] args) {
		SuperClass super1 = new SuperClass();
		SubClass sub1 = new SubClass();
		
		super1.greet();
		sub1.greet();
	}

}
