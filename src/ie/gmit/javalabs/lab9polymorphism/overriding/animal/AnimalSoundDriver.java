package ie.gmit.javalabs.lab9polymorphism.overriding.animal;

public class AnimalSoundDriver {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		animal1.speak();
		cat1.speak();
		dog1.speak();
		
		
	}

}
