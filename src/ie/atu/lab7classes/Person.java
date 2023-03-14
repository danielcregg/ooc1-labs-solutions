package ie.atu.lab7classes;

public class Person {

	// Instance Variables
	private String name;
	private float weightKg;

	// Default Constructor - A default constructor is created if you do not
	// define any constructors in your class. It is the no argument constructor.
	public Person() {
		System.out.println("I am the Default Constructor");
	}

	// Parameterized Constructor
	public Person(float weightKg) {
		System.out.println("I am the Parameterized Constructor");
		this.weightKg = weightKg;
	}

	// Parameterized Constructor
	public Person(String name, float weightKg) {
		System.out.println("I am the Parameterized Constructor - 2 inputs");
		this.name = name;
		this.weightKg = weightKg;
	}

	// Getters and Setters
	// Weight Getter
	public float getWeightKg() {
		return weightKg;
	}

	// Name Getter
	public String getName() {
		return name;
	}

	// Weight Setter
	public void setWeightKg(float weightKg) {
		this.weightKg = weightKg;
	}

	// Name Setter
	public void setName(String name) {
		this.name = name;
	}

	// Eat method
	public void eat(float foodWeightKg) {
		System.out.println("This person is eating!");
		weightKg = weightKg + foodWeightKg;
	}

	// Exercise method
	public void exercise(int hoursOfExercise) {
		System.out.println("This person is exercising!");
		// The person will loose 1kg of weight per hour exercise
		weightKg = weightKg - (hoursOfExercise);
	}

}// end Class
