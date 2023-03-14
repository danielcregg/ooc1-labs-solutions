package ie.atu.inheritance.vehicle;

public class Vehicle {
	
	// Instance variable
	private String colour;
	//private float price;
	
	// Default Constructor
	public Vehicle() {
		colour = null;
	}
	
	// Constructor with parameters
	public Vehicle(String colour) {
		this.colour = colour;
	}
	
	// Getter
	public String getColour() {
		return colour;
	}

	// Setter
	public void setColour(String colour) {
		this.colour = colour;
	}


	// public void setPrice(float vehiclePrice){
	// price = vehiclePrice;
	// }

	// Method to update price
	// public void updatePrice(float newPrice){
	// price = newPrice;
	// }

}
