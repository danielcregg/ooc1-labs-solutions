package ie.gmit.javalabs.lab3classes.driver;

import java.util.Scanner;

import ie.gmit.javalabs.lab3classes.shapes.Circle;


public class CircleDriver {

	public static void main(String[] args) {
		
		// Create new Scanner object called userInput
		Scanner userInput = new Scanner(System.in);
	    
		System.out.println("Please enter a radius length for your circle: ");
		float userRadius = userInput.nextFloat();
		System.out.println("Please enter a colour for your circle: ");
		String userColour = userInput.next();
		
		Circle circle2 = new Circle(userRadius, userColour);
	    
		// Construct new circle object
		//Circle circle1 = new Circle(10);

		// Use dot notation to call getArea method of Circle class/type
		//circle1.getArea();
		//System.out.println(circle1.getArea());
		//System.out.println("The area of circle1 is " + circle1.getArea() + "cm^2");
		
		System.out.println("The area of circle2 is " + circle2.getArea() + "cm^2");
		System.out.println("The colour of circle2 is " + circle2.getColour());
		
		userInput.close(); // Close Scanner object
	
	}

}
