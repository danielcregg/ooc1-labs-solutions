package ie.atu.labs.lab10abstraction.shape;

public class Rectangle extends Shape {
	
	// Instance variables
	private float length;
	private float width;
	
	// Parameterised Constructor 
	public Rectangle(float lenght, float width) {
		this.length = lenght;
		this.width = width;
	}
	
	@Override
	public float calculateArea() {
		return length * width;
	}
	
	// Now do circle and triangle the create Main class and show objects.

}
