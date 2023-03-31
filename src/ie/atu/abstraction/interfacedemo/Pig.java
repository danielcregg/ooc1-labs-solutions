package ie.atu.abstraction.interfacedemo;

//Pig "implements" the Animal interface
public class Pig implements Animal {
	
	@Override
	public void makeSound() {
		// The body of makeSound() is provided here
		System.out.println("Oink Oink!");
	}

	// The pig has its own sleep method
	public void sleep() {
		System.out.println("The Pig is sleeping.....zzz");
	}
	
}
