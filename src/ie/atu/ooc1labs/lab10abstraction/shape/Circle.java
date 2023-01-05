package ie.atu.ooc1labs.lab10abstraction.shape;

public class Circle extends Shape {
	
	// Instance variables
	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	
	@Override
	public float calculateArea() {
		return (float)Math.PI * (float)Math.pow(radius, 2);
	}
}
