package ie.atu.inheritance.animal; // https://www.journaldev.com/644/inheritance-java-example

public class Main {

	public static void main(String[] args) {
		// Create a Animal object
		Animal animal = new Animal(100);
		// Create a Carnivore object
		Carnivore carnivore = new Carnivore(150, "Gazelle");
		// Create a Lion object
		Lion lion = new Lion(200, "Gazelle", "Zebra");

		// Create a Herbivore object
		Herbivore herbivore = new Herbivore(50, "Grass");
		// Create a Rabbit object
		Rabbit rabbit = new Rabbit(10, "Grass", "Brown");

		System.out.println("Animal: " + animal.getWeightKg());
	}
}
