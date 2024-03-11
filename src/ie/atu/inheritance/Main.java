package ie.atu.inheritance;

public class Main {

    public static void main(String[] args) {

        // Create a TwoDShape object
        TwoDShape twoDShape = new TwoDShape(10, 20);
        System.out.println(twoDShape.area());
        twoDShape.toString();

        // Create a Triangle object
        Triangle triangle = new Triangle(10, 20, "Equilateral");
        System.out.println(triangle.area());
        triangle.toString();
        System.out.println(triangle);

        // Create a ColourTriangle object
        ColourTriangle colourTriangle = new ColourTriangle(10, 30, "Equilateral", "Red");
        System.out.println(colourTriangle.area()); // This calls the area method from the Triangle class
        colourTriangle.toString();
        System.out.println(colourTriangle);

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.area());
        rectangle.toString();
        System.out.println(rectangle);

    }
}
