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

		// Construct Contractor objects
		Contractor contractorObject1 = new Contractor(25, "Plumber", 150.0f);

		// Construct Retiree object
		Retiree retireeObject1 = new Retiree(67, 230.0f);
		
		// Print person objects
		System.out.println("Person 1: " + personObject1.getAge());
		System.out.println("Person 2: " + personObject2.getAge());
		
		// Print Employee objects
		System.out.println("Employee 1: " + employeeObject1.getAge() + ", " + employeeObject1.getRole());
		System.out.println("Employee 2: " + employeeObject2.getAge() + ", " + employeeObject2.getRole());
		System.out.println("Employee 3: " + employeeObject3.getAge() + ", " + employeeObject3.getRole());
		
		// Print Contractor objects
		System.out.println("Contractor 1: " + contractorObject1.getAge() + ", " + contractorObject1.getRole() + ", " + contractorObject1.getHourlyPay());

		// Print Retiree object
		System.out.println("Retiree 1: " + retireeObject1.getAge() + ", " + retireeObject1.getStatePension());

		employeeObject2.checkRetirementEligibility();
		employeeObject3.checkRetirementEligibility();
		contractorObject1.checkRetirementEligibility();
	
	} // End main method 
} // End Main class
