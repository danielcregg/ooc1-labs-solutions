package ie.atu.inheritance.work;

public class Employee extends Person {

	// Instance Variable
	private String role;
	
	// Default Constructor
	public Employee() {
		super();
		this.role = null;
	}
	
	// Constructor
	public Employee(int age, String role) {
		super(age);  // Need to use super to call parameterised constructor of super class
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
