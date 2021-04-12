package ie.gmit.ooc1labs.lab9polymorphism.overriding.animal;

public class Animal {
	
	// Fields
	private boolean moving;
	private float weight;
	
	// Getters and Setters
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
	public boolean getMoving() {
		return moving;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	// Others Methods
	public void speak() {
		System.out.println("Animal is making a sound");
	}
	
	public void eating() {
		System.out.println("I'm Eating");
	}

}