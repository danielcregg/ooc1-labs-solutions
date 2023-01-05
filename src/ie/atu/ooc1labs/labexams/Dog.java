package ie.atu.ooc1labs.labexams;

public class Dog {

	// Instance Variables
	String name;
	float weight;
	String breed;

	// Parameterised Constructor
	public Dog(String name, float weight, String breed) {
		this.name = name;
		this.weight = weight;
		this.breed = breed;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// Eat method
	public void eat(float kilosOfFood) {
		this.weight += kilosOfFood; // Increment the dogs weight by the kilos of food the dog has eaten
	}

}
