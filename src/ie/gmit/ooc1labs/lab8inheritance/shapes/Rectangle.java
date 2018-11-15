package ie.gmit.ooc1labs.lab8inheritance.shapes;

public class Rectangle extends TwoDShape {
	
	// Constructor
	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	// Area Method
	public double area() {
		return super.getWidth() * super.getHeight();
	}
}
