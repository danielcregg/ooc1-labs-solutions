package ie.atu.ooc1labs.lab9polymorphism.overloading.house;

public class House {
	
	// Height of house
	int height;
	
	// Default Constructor
	House() {
	      System.out.println("No input parameters. Constructing a default house.");
	      height = 0;
	}
	
	// Overloaded Constructor
	House(int height) {
	      System.out.println("Building new House that is " + height + " feet tall");
	      this.height = height;
	}
	
	
	void info() {
		System.out.println("House is " + this.height + " feet tall");
	}

	// Overloaded Method
	void info(String name) {
		System.out.println("House Name: " + name + " - House is " + height + " feet tall");
	}
}
