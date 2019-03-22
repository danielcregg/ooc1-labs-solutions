package ie.gmit.ooc1labs.lab9polymorphism.overriding.human;

public class Main {
	public static void main(String[] args) {
		Human humanObj1 = new Human();
		IrishPerson irishPersonObj1 = new IrishPerson();
		FrenchPerson frenchPersonObj1 = new FrenchPerson();

		humanObj1.speak();
		irishPersonObj1.speak();
		frenchPersonObj1.speak();
		
		
	}
}
