package ie.gmit.ooc1labs.inheritance.shapes;

public class ColourTriangle extends Triangle {
	// Instance Variable
	private String colour;
	
	// Default Constructor
	public ColourTriangle() {
	}
	
	// Constructor
	public ColourTriangle(String colour, String style, double width, double height) {
		super(style, width, height);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
