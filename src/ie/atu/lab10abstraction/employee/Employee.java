package ie.atu.lab10abstraction.employee;

public abstract class Employee {
	
	private String name;
	private String address;
	private int age;
	private double salary;

	public Employee(String name, String address, int age, double salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return age;
	}

	public void setNumber(int number) {
		this.age = number;
	}

	// Abstract Method
	public abstract double computePay();
}
