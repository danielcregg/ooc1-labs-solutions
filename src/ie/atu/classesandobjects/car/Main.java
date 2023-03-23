package ie.atu.classesandobjects.car;

public class Main {
	public static void main(String[] args) {
		// Create a new Car object called carObject1 using the default constructor
		Car carObject1 = new Car();
		// Print carObject1's make
		System.out.println(carObject1.getMake());
		// Print carObject1's price
		System.out.println(carObject1.getPriceEur());
		// Print carObject1's speed
		System.out.println(carObject1.speedKph);

		// Use toString method to print all carObject1's properties
		System.out.println(carObject1.toString());

		// Update carObject1's properties
		carObject1.setMake("Ford");
		carObject1.setPriceEur(15000f);
		carObject1.setSpeedKph(50);

		// Create a new Car object called carObject2 using the parameterized constructor
		Car carObject2 = new Car("Nissan", 20000f, 100);
		// Use toString method to print all carObject2's properties
		System.out.println(carObject2.toString());

		// Update carObject2's properties
		carObject2.setMake("Toyota");
		carObject2.setPriceEur(30000f);
		carObject2.setSpeedKph(120);

		// Use toString method to print all carObject2's properties
		System.out.println(carObject2.toString());

		// Use the accelerate method to accelerate carObject1
		carObject1.accelerate(10, 10);

		// Use toString method to print all carObject1's properties
		System.out.println(carObject1.toString());

		// Use the brake method to slow down carObject2
		carObject2.brake(10, 10);

		// Use toString method to print all carObject2's properties
		System.out.println(carObject2.toString());

	} // End of main method
} // End of Main class	
