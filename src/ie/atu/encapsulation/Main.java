package ie.atu.encapsulation;

public class Main {

	public static void main(String[] args) {
		// Creating two new dog objects
		Dog dogObject1 = new Dog(123456789012345L, "Bobby", 10);

		// Printing out the details of the first dog
		System.out.println(dogObject1.toString());

		// Change MUI to 1234567890123456L
		dogObject1.setMui(100000000000000L);
		dogObject1.setName("BillyBobThornt");

		// Printing out the details of the first dog
		System.out.println(dogObject1.toString());

	} // End Main Method

} // End Class
