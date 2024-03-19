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
		
		/* Downcasting
		 * If we want to call the fetch method, which is only defined 
		 * in the Dog class, we need to downcast the animal reference
		 * to a Dog reference using the (Dog) cast operator. This 
		 * tells the compiler that we know that the animal reference 
		 * is actually referring to an instance of Dog, and allows us
		 * to call the fetch method.
		 */
		
		Animal animalObj2 = new Dog();
		animalObj2.speak();
		// animalObj2.fetch(); - ERROR
		((Dog) animalObj2).fetch(); // prints "Fetch"
        
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

	} // End Main

	// Method that takes an Animal reference as a parameter
	public static void doSomething(Animal animal) {
		animal.speak();
	}

} // End Class
