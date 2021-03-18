package ie.gmit.ooc1labs.inheritance.shapes;

public class TwoDShape {

	// Instance Variables
	private double width;
	private double height;

	// Default Constructor
	public TwoDShape() {
//		this.width = 0.0;
//		this.height = 0.0;
	}

	// Constructor - Parameterised
	public TwoDShape(double width, double height) {
		this.width = width;
		this.height = height;
		System.out.println("I am the TwoDShape Constructor");
	}

	// Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Print Method
	public void print() {
		System.out.println("Width is " + this.width + " and Height is " + this.height);
	}
}
