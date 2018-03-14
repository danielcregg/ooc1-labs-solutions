package ie.gmit.javalabs.lab8inheritance.shapes;

public class Rectangle extends TwoDShape {

	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	public double area() {
		return getWidth() * getHeight();
	}
}
