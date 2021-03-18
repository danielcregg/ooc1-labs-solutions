package ie.gmit.ooc1labs.inheritance.shapes;

public class Triangle extends TwoDShape {
	
	// Instance Variable
	private String style;
	
	// Default Constructor
	public Triangle() {
//		super();
//		this.style = null;
	}
	
	// Constructor
	public Triangle(double width, double height, String style) {
		super(width, height); // Call constructor of Super class
		this.style = style;
		System.out.println("I am the Triangle Constructor");
	}
	
	// Getters and setters
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	// Area Method
	public double area(){
		double areaOfTriangle = super.getWidth() * super.getHeight() / 2;
		return areaOfTriangle;
	}
	
	public void printStyle() {
		System.out.println(this.style);
	}

}
