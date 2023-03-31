package ie.atu.abstraction.employee;

public class FullTimeEmployee extends Employee {
	
	// Instance variables
	private int yearlySalaryEuro;

	// Constructor
	public FullTimeEmployee(String name, int yearlySalaryEuro) {
		super(name);
		this.yearlySalaryEuro = yearlySalaryEuro;
	}

	// Getters and Setters
	public int getYearlySalaryEuro() {
		return yearlySalaryEuro;
	}

	public void setYearlySalaryEuro(int yearlySalaryEuro) {
		this.yearlySalaryEuro = yearlySalaryEuro;
	}
	
	@Override
	public int calculateMonthlyPay() {
		// Yearly salary divided by 12 months
		return yearlySalaryEuro / 12;
	}
}
