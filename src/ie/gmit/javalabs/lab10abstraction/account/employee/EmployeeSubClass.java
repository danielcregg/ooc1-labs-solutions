package ie.gmit.javalabs.lab10abstraction.account.employee;

public class EmployeeSubClass extends Employee {

	public EmployeeSubClass(String name, String address, int number) {
		super(name, address, number);
	}

	public double computePay() {
		System.out.println("Employee's pay is being computed");
		return 0.0;
	}
}

