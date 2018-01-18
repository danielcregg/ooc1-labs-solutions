package ie.gmit.javalabs.oldLabs.circle;

//import org.junit.Test;

public class TestCircle {

	public static void main(String[] args) {

		//float area;
		// Declare reference to Circle
		Circle mycircle;
		
		// Create new circle object and initialize the radius to 2
		// To create a new Circle object called myCircle, the constructor is called by the new operator:
		// This creates space in memory for the object and initializes its fields.
		mycircle = new Circle(2);
		
		// Display circle's area using the circles calculateArea method
		System.out.println("The circles area is: " + mycircle.calculateArea());
//		area = mycircle.calculateArea();
//		System.out.println(area);
//		assertTrue(area == 12.56);
		
		// Display circle's circumference using the circles calculateCircumference method
		System.out.println("The circles circumfernce is: " + mycircle.calculateCircumference());
		
		// Update the circle with a new radius
		
//		assertTrue(mycircle.updateCircleRadius(4) == 4);
		
		// Display circle's area using the circles calculateArea method
		System.out.println("The circle's radius has been changed to " + mycircle.updateCircleRadius(100));
		
		// Display circle's area using the circles calculateArea method		
		System.out.println("The circles area is: "+ mycircle.calculateArea());
		
		// Display circle's circumference using the circles calculateCircumference method
		System.out.println("The circles circumfernce is: "+ mycircle.calculateCircumference());
		
	}

}

