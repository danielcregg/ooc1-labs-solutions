package ie.atu.lab10abstraction.employee;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name, String address, int age, double salary, double bonus) {
		super(name, address, age, salary);
		this.bonus = bonus;
	}

	//@Override
	public double computePay() {
		return (super.getSalary() + bonus)/12;
	}

}
