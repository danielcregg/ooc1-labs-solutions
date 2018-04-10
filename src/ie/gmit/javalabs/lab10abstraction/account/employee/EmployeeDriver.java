package ie.gmit.javalabs.lab10abstraction.account.employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		/* Following is not allowed and would raise error */
		Engineer engObj1 =new Engineer("Tom Brennan", "Castlebar, Mayo", 25, 40000.00f);
		Manager manObj1 = new Manager("Sean Murphy", "Roscam, Galway", 33, 100000.00f, 10000.00f);
		
		System.out.println(engObj1.computePay());
		System.out.println(manObj1.computePay());
	}
}
