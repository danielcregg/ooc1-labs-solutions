package ie.gmit.ooc1labs.inheritance.person;

public class Main {

	public static void main(String[] args) {

		// Construct Employee object
		Employee employeeObject1 = new Employee(48, "Elon");
		Employee employeeObject2 = new Employee(64, "Bill");
		
		// Print Employee object 1 age and first name
		System.out.println(    employeeObject1.getAge()    );
		System.out.println(    employeeObject1.getFirstName()    );
		
		// Print Employee object 2 age and first name
		System.out.println(    employeeObject2.getAge()    );
		System.out.println(    employeeObject2.getFirstName()    );
	}
	 
}
