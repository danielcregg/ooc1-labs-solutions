package ie.atu.inheritance.work;

public class Main {

	public static void main(String[] args) {

		// Construct Person objects
		Person personObject1 = new Person();
		Person personObject2 = new Person(12);		
		
		// Construct Employee objects
		Employee employeeObject1 = new Employee();
		Employee employeeObject2 = new Employee(42, "Engineer");
		Employee employeeObject3 = new Employee(66, "Manager");
		
		// Print person objects
		System.out.println("Person 1: " + personObject1.getAge());
		System.out.println("Person 2: " + personObject2.getAge());
		
		// Print Employee objects
		System.out.println("Employee 1: " + employeeObject1.getAge() + ", " + employeeObject1.getRole());
		System.out.println("Employee 2: " + employeeObject2.getAge() + ", " + employeeObject2.getRole());
		System.out.println("Employee 3: " + employeeObject3.getAge() + ", " + employeeObject3.getRole());
		
		employeeObject3.checkRetirementEligibility();
	
	} // End main method 
} // End Main class
