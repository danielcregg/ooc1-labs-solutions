package ie.atu.polymorphism.overriding.human;

public class IrishPerson extends Human {

	@Override
	public void greet() {
		System.out.println("Dia Dhuit");
	}

//	public void showIrishPassport() {
//		System.out.println("Showing my Irish Passport!");
//	}

//	public void humanGreet() {
//		// This will call the overridden greet() method of super class Human
//		super.greet();
//	}

}
