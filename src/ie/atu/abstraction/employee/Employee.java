package ie.atu.abstraction.employee;

public abstract class Employee {

	//Instance variables
	private String name;
	private int paymentPerHour;

	// Constructor
	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	// Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	
	// Abstract Method
	public abstract int calculateDailyPay();
}
