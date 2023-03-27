package ie.atu.polymorphism.overriding.animal;

public class Animal {
	
	// Instance Variables
	private boolean moving;
	private float weightKg;
	
	// Getters and Setters
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
	public boolean getMoving() {
		return moving;
	}
	
	public float getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(float weightKg) {
		this.weightKg = weightKg;
	}

	// Others Methods
	public void speak() {
		System.out.println("Animal is making a sound");
	}
	
	public void eating() {
		System.out.println("I'm Eating");
	}

}