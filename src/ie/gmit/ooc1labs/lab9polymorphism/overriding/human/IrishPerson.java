package ie.gmit.ooc1labs.lab9polymorphism.overriding.human;

public class IrishPerson extends Human {
	
	@Override
	public void greet() {
		System.out.println("Dia Dhuit");
	}
	
	public void showIrishPassport() {
		System.out.println("Showing my Irish Passport!");
	}
	
}

