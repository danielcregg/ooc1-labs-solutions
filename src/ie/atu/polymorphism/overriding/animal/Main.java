package ie.atu.polymorphism.overriding.animal;

public class Main {

	public static void main(String[] args) {

		// Creating objects for each Type
		Animal animalObj1 = new Animal();
		Dog dogObj1 = new Dog();
		Cat catObj1 = new Cat();
		Duck duckObj1 = new Duck();

		animalObj1.speak();
		dogObj1.speak();
		catObj1.speak();
		duckObj1.speak();
		
		/* We create an array of Animal references and populate it 
		 * with instances of Dog, Cat, and Animal. 
		 */
		Animal[] animals = new Animal[4];
        animals[0] = new Animal();
		animals[1] = new Dog();
        animals[2] = new Cat();
		animals[3] = new Duck();

		/* We then loop over the array and call the makeSound method on each Animal 
		 * reference. Because of polymorphism, the appropriate makeSound
		 * method is called for each object, even though we are calling
		 * the method on a reference of type Animal.
		 */
		for (Animal animal : animals) {
            animal.speak();
        }

		/* We can also pass instances of Dog, Cat and Duck to a method that takes an Animal
		 * reference as a parameter. The appropriate makeSound method is called for 
		 * each object, even though we are passing the method an instance of Dog or Cat.
		 */
		doSomething(new Animal());  // Calls Animal's speak method
		doSomething(new Dog());  // Calls Dog's speak method
		doSomething(new Cat());  // Calls Cat's speak method
		doSomething(new Duck());  // Calls Duck's speak method

		// UPCASTING and DOWNCASTING examples
		// A dog object is created and assigned to an Animal reference. This is known as UPCASTING.
		Animal animalObj2 = new Dog();
		// The speak method is called on the Animal reference. Because of polymorphism, the speak method of the Dog class is called.
		animalObj2.speak();
		// The fetch method is called on the Animal reference. This results in a compiler error, because the Animal class does not have a fetch method.
		// animalObj2.fetch(); - ERROR
		// We can fix this by DOWNCASTING the Animal reference to a Dog reference using the (Dog) cast operator.
		((Dog) animalObj2).fetch(); // prints "Fetch"

		/*
		 * This code illustrates the flexibility of polymorphism, but also its limitations - while a subclass can be treated as its superclass,
		 * it can only access methods that the superclass knows about. To access subclass-specific methods, a downcast is necessary.
		 */

	} // End of Main method.

	// Method that takes an Animal reference as a parameter
	public static void doSomething(Animal animal) {
		animal.speak();
	}

} // End of Class.
