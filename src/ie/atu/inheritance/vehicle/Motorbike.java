package ie.atu.inheritance.vehicle;

public class Motorbike extends Vehicle {

	// Holds the ID number of the handle bar used
	private int handleBarID;
	
	// No argument Constructor
	public Motorbike() {
		super();
		handleBarID = 0;
	}
	
	// Paramiterised Constructor
	public Motorbike(String colour, int handleBarID) {
		super(colour);
		this.handleBarID = handleBarID;
	}
	
	// Getters and Setters
	public int getHandleBarID() {
		return handleBarID;
	}

	public void setHandleBarID(int handleBarID) {
		this.handleBarID = handleBarID;
	}
	
}
