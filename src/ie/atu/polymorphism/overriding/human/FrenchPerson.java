package ie.atu.polymorphism.overriding.human;

public class FrenchPerson extends Human {
	
	@Override
	public void greet() {
		System.out.println("Bonjour");
	}
	
}
