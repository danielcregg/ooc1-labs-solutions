package ie.atu.labs.lab9polymorphism.overriding.animal;

public class Dog extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Woof!");
	}

	
}