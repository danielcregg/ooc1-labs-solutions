package ie.gmit.ooc1labs.lab6classes;

public class Person {
	
	// Instance Variable
	private String name;
	private float weight;
	

	// Default Constructor - A default constructor is created if you do not 
	// define any constructors in your class. It is the no argument constructor.
	public Person() {
		System.out.println("I am the Default Constructor");
	}
	
	// Parameterized Constructor
	public Person(float weight) {
		System.out.println("I am the Parameterized Constructor");
		this.weight = weight;
	}
	
	// Parameterized Constructor
	public Person(String name, float weight) {
		System.out.println("I am the Parameterized Constructor - 2 inputs");
		this.name = name;
		this.weight = weight;
	}
	
	
	
	public float getWeight() {
		return weight;
	}
	
	// Setter 
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	
	// Eat method
	public void eat(float foodAmount) {
		System.out.println("This person is eating!");
		weight = weight + foodAmount;
	}
	
	// Eat method
	public void exercise(int hoursOfExercise) {
		System.out.println("This person is exercising!");
		weight = weight - (hoursOfExercise * 5);
	}

	 

	
}// end Class
