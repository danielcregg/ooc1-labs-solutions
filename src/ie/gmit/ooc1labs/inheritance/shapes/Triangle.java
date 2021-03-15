package ie.gmit.ooc1labs.inheritance.shapes;

public class Triangle extends TwoDShape {
	// Instance Variable
	private String style;
	
	public Triangle() {
	};
	
	// Constructor
	public Triangle(String style, double width, double height) {
		super(width, height); // Call constructor of Super class
		this.style = style;
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
		System.out.println(style);
	}
	
//	public void print() { 
//		System.out.println("The triangle is " + style); 
//		System.out.println("Width is " + getWidth() + " and Height is " + getHeight());
//	} 

}
