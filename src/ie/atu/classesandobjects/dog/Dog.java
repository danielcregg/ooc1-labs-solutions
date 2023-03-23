// Encapsulation - Getters and Setters
package ie.atu.classesandobjects.dog;

public class Dog {
	//Instance variables
	private String name;
	private int age;
	private double weight;
	
	//Constructor
	public Dog(String initName) {
	    name = initName;
	    age = 0;
	    weight = 0;
	}
	
	// getter methods
	public String getName() {
	    return name;
	}
	
	public int getAge() {
	    return age;
	}
	
	public double getWeight() {
	    return weight;
	}
	
	// setter methods
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
	    age = newAge;
	}

	public void setWeight(double newWeight) {
		weight = newWeight;
	}
}
