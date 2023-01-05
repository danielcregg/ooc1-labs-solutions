package ie.atu.ooc1labs.lab10abstraction.shape;

public class Triangle extends Shape {
	// Instance variables
	private float base;
	private float perpHeight;
	
	// Parameterised Constructor 
	public Triangle(float base, float perpHeight) {
		this.base = base;
		this.perpHeight = perpHeight;
	}
	
	@Override
	public float calculateArea() {
		return (base/2) * perpHeight;
	}
}
