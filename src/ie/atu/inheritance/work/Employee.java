package ie.atu.inheritance.work;

public class Employee extends Person {

	// Instance Variable
	private String role;
	
	// Default Constructor
	public Employee() {
		super();  // Need to use super to call default constructor of super class. If not called, it will be called automatically. It must be the first line in the constructor
		this.role = null;
	}
	
	// Constructor
	public Employee(int age, String role) {
		super(age);  // Need to use super to call parameterized constructor of super class. If not called, it will be called automatically and it will call the default constructor. It must be the first line in the constructor
		this.role = role;
	}
	
	// Getter Method
	public String getRole() {
		return role;
	}
	
	// Setter Method
	public void setRole(String role) {
		this.role = role;
	}
	
	// Method using super keyword to access superclass public get method
	public void checkRetirementEligibility() {
		if (super.getAge() >= 66) {
			System.out.println("Eligible for retirment");
		} else {
			System.out.println("Not eligible for retirment");
		}
	}
	
}
