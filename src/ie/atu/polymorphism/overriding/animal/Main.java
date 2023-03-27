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
		
		System.out.println(  dogObj1.getWeightKg() );
		
		System.out.println(		animalObj1.getMoving()	);
		System.out.println(		catObj1.getMoving()		);
		System.out.println(		dogObj1.getMoving()		);
		duckObj1.setMoving(true);
		System.out.println(		duckObj1.getMoving()	);
		
	} // End Main
} // End Class
