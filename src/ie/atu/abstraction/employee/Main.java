package ie.atu.abstraction.employee;

public class Main {

	public static void main(String[] args) {

		// Create an object of FullTimeEmployee class and pass the name and
		// salary as parameters
		FullTimeEmployee fteObj1 = new FullTimeEmployee("Tommy", 50000);
		// Create an object of Contractor class and pass the name and euro
		// rate per hour as parameters
		Contractor contractorObj1 = new Contractor("John", 50);

		// Print the monthly pay of both the employees
		// using the calculateMonthlyPay() method
		System.out.println(fteObj1.calculateMonthlyPay());
		System.out.println(contractorObj1.calculateMonthlyPay());
	}
}
