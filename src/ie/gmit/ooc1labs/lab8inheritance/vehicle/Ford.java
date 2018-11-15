package ie.gmit.ooc1labs.lab8inheritance.vehicle;

public class Ford extends Car {

	private String model;

//	public Ford(String colour, String make) {
//		super(colour, make);
//	}
	public Ford(String colour, String make, String model) {
		super(colour, make);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
