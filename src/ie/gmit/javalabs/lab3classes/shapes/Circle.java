package ie.gmit.javalabs.lab3classes.shapes;

public class Circle {
	
	// Instance Variables
	private float radius;
	private String colour;
	
	
	// Constructor
	public Circle(float r, String c) {
		radius = r;
		colour = c;
	}
	
	// Method to calculate Area - Area of circle = PI*radius*radius
	public float getArea() {
		return 3.14f*radius*radius;
		//double area = Math.PI * (radius * radius);
	}
	
	// Method to get Circle colour
	public String getColour() {
		return colour;
		//double area = Math.PI * (radius * radius);
	}
	
	// Method to calculate circumference
}
