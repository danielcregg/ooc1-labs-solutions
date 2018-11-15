package ie.gmit.ooc1labs.lab9polymorphism.overriding.animal;

public class Cat extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Meow!");
	}
	
}
