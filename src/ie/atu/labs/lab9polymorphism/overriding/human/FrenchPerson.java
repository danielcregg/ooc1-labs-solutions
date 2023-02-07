package ie.atu.labs.lab9polymorphism.overriding.human;

public class FrenchPerson extends Human {
	
	@Override
	public void greet() {
		System.out.println("Bonjour");
	}
	
}
