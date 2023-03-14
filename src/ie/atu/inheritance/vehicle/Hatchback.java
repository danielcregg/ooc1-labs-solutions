package ie.atu.inheritance.vehicle;

public class Hatchback extends Car {

	// Instance variable
	private String hatchDoorColour;
	
	// Default Constructor
	public Hatchback() {
		super();
		hatchDoorColour = null;
	}
	
	// Paramiterised Constructor
	public Hatchback(String colour, String make, String hatchDoorColour) {
		super(colour, make);
		this.hatchDoorColour = hatchDoorColour;
	}

	// Getter
	public String getHatchDoorColour() {
		return hatchDoorColour;
	}
	// Setter
	public void setHatchDoorColour(String hatchDoorColour) {
		this.hatchDoorColour = hatchDoorColour;
	}
}
