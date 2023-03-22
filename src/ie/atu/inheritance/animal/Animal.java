package ie.atu.inheritance.animal;

public class Animal {

	// Instance Variables
	private double weightKg;

	// Constructor
	public Animal(double weightKg) {
		this.weightKg = weightKg;
	}

	// Getters and Setters
	public double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}

	// Methods
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	public void eat(double foodWeightKg) {
		System.out.println("Animal is eating " + foodWeightKg + "kg of food");
		// Print the weight of the animal before eating
		System.out.println("Animal weight before eating: " + this.weightKg + "kg");
		// Increase the weight of the animal by the amount of food eaten
		this.weightKg += foodWeightKg;
		// Print the weight of the animal after eating
		System.out.println("Animal weight after eating: " + this.weightKg + "kg");
	}

	//toString
	@Override
	public String toString() {
		return "Animal [weightKg=" + weightKg + "]";
	}
}
