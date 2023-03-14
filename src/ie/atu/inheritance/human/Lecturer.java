package ie.atu.inheritance.human;

public class Lecturer extends Human {

	private String department;

	public Lecturer(double weight, String department) {
		/*
		 * Before learning super keyword you must have the knowledge of inheritance in
		 * Java. The super keyword refers to the objects of immediate super class.
		 */

		/*
		 * The use of super keyword
		 * 
		 * 1) To access the data members of parent class when both parent and child class have member with same name
		 * 2) To explicitly call the no-arg and parameterized constructor of parent class 
		 * 3) To access the method of parent class when child class has overridden that method.
		 */

		super(weight);
		this.setDepartment(department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
