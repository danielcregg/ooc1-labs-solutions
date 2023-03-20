package ie.atu.inheritance.work;

public class Person {
	
	// Instance Variable
	private int age;
	
	// Default Constructor
	public Person() {
		// Set all instance variables to their default values.
		this.age = 0;
	}
	
	// Constructor
	public Person(int age) {
		this.age = age;
	}

	// Getter Method
	public int getAge() {
		return age;
	}
	
	// Setter Method
	public void setAge(int age) {
		this.age = age;
	}
	
}
