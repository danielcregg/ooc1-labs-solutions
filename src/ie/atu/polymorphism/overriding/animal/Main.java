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
		
		animalObj1.eating();
		dogObj1.eating();
		catObj1.eating();
		duckObj1.eating();
		
		System.out.println(  dogObj1.getWeightKg()  );
		System.out.println(	 animalObj1.getMoving()	);
		System.out.println(	 catObj1.getMoving()	);
		System.out.println(	 dogObj1.getMoving()	);
		duckObj1.setMoving(true);
		System.out.println(		duckObj1.getMoving()	);
		
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
		animalObj2.eating();
		// animalObj2.fetch(); - ERROR
		((Dog) animalObj2).fetch(); // prints "Fetch"
        
		/* we create an array of Animal references and populate it 
		 * with instances of Dog, Cat, and Animal. We then loop over 
		 * the array and call the makeSound method on each Animal 
		 * reference. Because of polymorphism, the appropriate makeSound
		 * method is called for each object, even though we are calling
		 * the method on a reference of type Animal.
		 */
		// Animal[] animals = new Animal[4];
        // animals[0] = new Animal();
		// animals[1] = new Dog();
        // animals[2] = new Cat();
		// animals[3] = new Duck();

		// for (Animal animal : animals) {
        //     animal.speak();
        // }
	} // End Main
} // End Class
