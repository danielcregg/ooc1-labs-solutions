package ie.atu.abstraction.interfacedemo;

public class Main {
	public static void main(String[] args) {

		// If we define multiple classes that implement the same interface,
		// we can create an array of that interface and store the objects
		// of the classes in the array. Create an array to store 3 Animals.
		Animal[] animals = new Animal[3];

		// Store an object of each type of animal in the array.
		animals[0] = new Cow();
		animals[1] = new Horse();
		animals[2] = new Pig();

		// Loop through the array and call the makeSound method on each
		// object. This will call the implementation of the method
		// defined in the class of that object.
		for (Animal animal : animals) {
			animal.makeSound();
		}
	}
}
