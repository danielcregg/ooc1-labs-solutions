package ie.gmit.javalabs.lab10abstraction.account.employee;

public abstract class Employee {
	private String name;
	private String address;
	private int age;

	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.age = number;
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

	// Abstract Class
	public abstract double computePay();
}
