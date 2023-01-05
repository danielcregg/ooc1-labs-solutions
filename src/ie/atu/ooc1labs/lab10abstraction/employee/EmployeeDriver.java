package ie.atu.ooc1labs.lab10abstraction.employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Engineer engObj1 = new Engineer("Tom Brennan", "Castlebar, Mayo", 25, 36000.00);
		Manager manObj1 = new Manager("Sean Murphy", "Roscam, Galway", 33, 134000.00, 10000.00);
		
		System.out.println(engObj1.computePay());
		System.out.println(manObj1.computePay());
	
	}
}
