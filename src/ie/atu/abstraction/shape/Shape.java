package ie.atu.abstraction.shape;

public abstract class Shape {
	public final String colour = "blue";
	
	// All Shapes will need this ability and they will all use same code to do it.
	public void zoom() {
		System.out.println("Zooming in on shape");
	}
	
	// All Shapes will need this ability but they will all need own code to do it. 
	public abstract float calculateArea();
}
