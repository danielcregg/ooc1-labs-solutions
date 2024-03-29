package ie.atu.abstraction.employee;

public class Contractor extends Employee {
	
	// Instance Variable
	private int costPerHourEuro;

	// Constructor
	public Contractor(String name, int costPerHourEuro) {
		super(name);
		this.costPerHourEuro = costPerHourEuro;
	}

	@Override
	public int calculateMonthlyPay() {
		// 20 working days * 8 hours per day
		return 20 * 8 * costPerHourEuro;
	}
}