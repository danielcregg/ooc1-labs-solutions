package ie.gmit.javalabs.lab10abstraction.account.employee;

public class Engineer extends Employee{
	
	public Engineer(String name, String address, int age, double salary) {
		super(name, address, age, salary);
	}

	//@Override
	public double computePay() {
		return super.getSalary() / 12;
	}
}
