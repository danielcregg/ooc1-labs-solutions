package ie.gmit.javalabs.labexams;

public class DogDriver {

	public static void main(String[] args) {

		// Create a new Dog object (e.g. (“Rex”, 40, "Labrador")
		Dog dog1 = new Dog("Rex", 40, "Labrador");

		// Use the getter methods in combination with System.out.println() to print the Dog’s name, weight and breed.
		System.out.println(dog1.getName() + " " + dog1.getWeight() + " " + dog1.breed);

		// Use the eat method to make your dog eat 3kgs of food
		dog1.eat(3.0f);

		// Use the getter methods in combination with System.out.println() again to print the Dog’s new weight.
		System.out.println(dog1.getName() + " " + dog1.getWeight() + " " + dog1.breed);
		
		//Create new dog Object
		Dog dog2 = new Dog("Bingo", 10, "Pug");
		
		// Use the getter methods in combination with System.out.println() again to print the Dog’s new weight.
		System.out.println(dog2.getName() + " " + dog2.getWeight() + " " + dog2.breed);
				
	} // end main
} // end class
