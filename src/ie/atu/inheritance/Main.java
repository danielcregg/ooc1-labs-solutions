package ie.atu.inheritance;

public class Main {

    public static void main(String[] args) {

        // Create a TwoDShape object
        TwoDShape twoDShape = new TwoDShape(10, 20);
        System.out.println(twoDShape); // This calls the toString method from the TwoDShape class
        System.out.println("The area of the 2D shape = " + twoDShape.area()); // This calls the area method from the TwoDShape class

        // Create a Triangle object
        Triangle triangle = new Triangle(10, 20, "Equilateral");
        System.out.println(triangle); // This calls the toString method from the Triangle class
        System.out.println("The area of the Triangle = " + triangle.area()); // This calls the area method from the Triangle class

        // Create a ColourTriangle object
        ColourTriangle colourTriangle = new ColourTriangle(10, 30, "Equilateral", "Red");
        System.out.println(colourTriangle); // This calls the toString method from the ColourTriangle class
        System.out.println("The area the colorTriangle = " + colourTriangle.area()); // This calls the area method from the Triangle class

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle); // This calls the toString method from the Rectangle class
        System.out.println("The area the rectangle = " + rectangle.area()); // This calls the area method from the Rectangle class

    }
}
