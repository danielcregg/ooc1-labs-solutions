package ie.atu.polymorphism.overriding.human;

public class IrishPerson extends Human {

	@Override
	public void greet() {
		System.out.println("Dia Dhuit");
	}

	@Override
	public void showPassport() {
		System.out.println("I am Irish. Here is my Irish passport!");
	}

}
