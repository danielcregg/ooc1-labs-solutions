package ie.gmit.ooc1labs.lab8inheritance.vehicle;

public class Car extends Vehicle {

	private String make;
	/*
	 * The super keyword refers to the objects of immediate super class.
	 * 
	 * The use of super keyword
	 * 
	 * 1) To access the data members of parent class when both parent and child class have member with same name
	 * 2) To explicitly call the no-arg and parameterized constructor of parent class 
	 * 3) To access the method of parent class when child class has overridden that method.
	 */
	public Car(String colour, String make) {
		super(colour);
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
