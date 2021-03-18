package ie.gmit.ooc1labs.inheritance.shapes;

public class ColourTriangle extends Triangle {
	
	// Instance Variable
	private String colour;
	
	// Default Constructor
	public ColourTriangle() {
//		super();
//		this.colour = null;
	}
	
	// Constructor
	public ColourTriangle(double width, double height, String style, String colour) {
		super(width, height, style);
		this.colour = colour;
		System.out.println("I am the ColourTriangle Constructor");
	}

	// Getters and Setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
