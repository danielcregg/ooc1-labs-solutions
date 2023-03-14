package ie.atu.abstraction.employee;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects
		FullTimeEmployee fteObj1 = new FullTimeEmployee("Tommy", 10);
		Contractor contractorObj1 = new Contractor("John", 15, 4);
		
		System.out.println(   fteObj1.calculateDailyPay()   );

		System.out.println(   contractorObj1.calculateDailyPay() );
	}

}
