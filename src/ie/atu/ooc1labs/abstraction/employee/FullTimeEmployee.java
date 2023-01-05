package ie.atu.ooc1labs.abstraction.employee;

public class FullTimeEmployee extends Employee {
	
	// Constructor
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateDailyPay() {
		return getPaymentPerHour() * 8;
	}
}
