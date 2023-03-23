package ie.atu.polymorphism.overriding.animal;

public class Duck extends Animal{
	
	@Override
	public void speak() {
		System.out.println("Quack!");
	}
}
