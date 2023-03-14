package ie.atu.abstraction.employee;

public class Contractor extends Employee {
	
	// Instance Variable
	private int hoursWorked;

	public Contractor(String name, int paymentPerHour, int hoursWorked) {
		super(name, paymentPerHour);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculateDailyPay() {
		return getPaymentPerHour() * hoursWorked;
	}
}
