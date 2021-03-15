package ie.gmit.ooc1labs.inheritance.person;

public class Employee extends Person {

	// Instance Variable
	private String firstName;
	
	public Employee(int age, String firstName) {
		super(age);
		this.firstName = firstName;
	}
	
	// Getter Method
	public String getFirstName() {
		return firstName;
	}
	
	// Setter Method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
