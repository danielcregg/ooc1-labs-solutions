package ie.atu.polymorphism.overriding.human;

public class FrenchPerson extends Human {
	
	@Override
	public void greet() {
		System.out.println("Bonjour");
	}

	@Override
	public void showPassport() {
		System.out.println("Je suis français. Voici mon passeport français!");
	}
	
}
