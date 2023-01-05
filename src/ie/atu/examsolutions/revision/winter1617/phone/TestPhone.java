package ie.atu.examsolutions.revision.winter1617.phone;

public class TestPhone {
	public static void main(String[] args) {
		Phone phone1 = new Phone("Samsung Galaxy S7 Edge", 850.00, 4);
		Phone phone2 = new Phone("Apple iPhone 7 Plus", 999.00, 3);
		
		// Print out the information of the first phone object
		System.out.println(phone1.getPhoneBrand());
		System.out.printf("%.2f", phone1.getPhonePrice());
		System.out.println("");
		System.out.println(phone1.getphoneRamGb());
		System.out.println("");
		
		// Reduce the price of the second phone object by 20%
		phone2.reducePrice(20);
		
		// Print out the information of the second phone object
		System.out.println(phone2.getPhoneBrand());
		System.out.printf("%.2f", phone2.getPhonePrice());
		System.out.println("");
		System.out.println(phone2.getphoneRamGb());
	}
}

