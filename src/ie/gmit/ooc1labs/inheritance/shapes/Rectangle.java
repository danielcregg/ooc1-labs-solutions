package ie.gmit.ooc1labs.inheritance.shapes;

public class Rectangle extends TwoDShape {

	// Constructor
	public Rectangle(double width, double height) {
		super(width, height);
	}

	// Area Method
	public double area() {
		double areaOfRectangle = super.getWidth() * super.getHeight();
		return areaOfRectangle;
	}
}
