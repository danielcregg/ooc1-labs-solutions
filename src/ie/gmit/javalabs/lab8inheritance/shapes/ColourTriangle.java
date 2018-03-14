package ie.gmit.javalabs.lab8inheritance.shapes;

public class ColourTriangle extends Triangle {
	private String colour;

	public ColourTriangle(String style, double width, double height, String colour) {
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
