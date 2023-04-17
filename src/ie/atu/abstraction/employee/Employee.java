package ie.atu.abstraction.employee;

public abstract class Employee {

	// Instance variables
	private String name;
	
	// Constructor
	public Employee(String name) {
		this.name = name;
	}

	// Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Abstract Method
	public abstract int calculateMonthlyPay();
}
