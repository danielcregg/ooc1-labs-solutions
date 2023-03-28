package ie.atu.polymorphism.overriding.animal;

public class Dog extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Woof!");
	}
	
	@Override
	public void eating() {
		System.out.println("The Dog is eating");
		setWeightKg(getWeightKg() + 1);
	}

	public void fetch() {
		System.out.println("The Dog is fetching");
	}
	
}
