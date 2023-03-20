package ie.atu.inheritance.work;

public class Contractor extends Employee {
	
	// Instance Variable
	private float hourlyPay;
	
	// Constructor
	public Contractor (int age, String role, float hourlyPay) {
		super(age, role);
		this.hourlyPay = hourlyPay;
	}	
	// Getter
	public float getHourlyPay() {
		return hourlyPay;
	}
	
	// Setter
	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
}
