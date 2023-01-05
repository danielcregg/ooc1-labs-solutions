package ie.atu.ooc1labs.inheritance.shapes;

public class Main {

	public static void main(String[] args) {
		// Create Triangle object
//		Triangle triangle1 = new Triangle(5.0, 5.0, "Isosceles");
//		System.out.println(triangle1.area());
//		triangle1.print();
//		triangle1.printStyle();

		// Create ColourTriangle object
//		ColourTriangle colourTriangle1 = new ColourTriangle(10.0, 8.5, "Eqilaterial", "red");
//		System.out.println(colourTriangle1.getColour());
//		colourTriangle1.printStyle();
		
		// Create Rectangle objects
		Rectangle rectangleObject1 = new Rectangle(3.0, 4.0);
		Rectangle rectangleObject2 = new Rectangle(5.0, 6.0);
		Rectangle rectangleObject3 = new Rectangle(6.0, 8.0);
		Rectangle rectangleObject4 = new Rectangle(7.0, 1.0);
		
		// Print Rectangle areas
		System.out.println(rectangleObject1.area());
		System.out.println(rectangleObject2.area());
		System.out.println(rectangleObject3.area());
		System.out.println(rectangleObject4.area());

	} // end main
} // end class
