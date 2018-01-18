package ie.gmit.javalabs.lab9polymorphism.overriding.animal;

public class Horse extends Animal{
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
}
