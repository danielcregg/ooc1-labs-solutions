package ie.atu.polymorphism.overloading.house;

public class House {
	
	// Height of house
	private int numberOfRooms;

	// Default constructor
	public House() {
		numberOfRooms = 5; // Default value
	}

	// Overloaded constructor
	public House(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	// Info method
	public void info() {
		System.out.println("The house has " + numberOfRooms + " rooms");
	}

	// Overloaded info method
	public void info(String name) {
		System.out.println("The house has " + numberOfRooms + " rooms and is called " + name);
	}

}
