package ie.atu.inheritance;

public class Main {

    public static void main(String[] args) {
        // Create a Triangle object
        Triangle triangle = new Triangle(10, 20, "Equilateral");
        triangle.showDimensions();
        System.out.println(triangle);

        // Create a ColourTriangle object
        ColourTriangle colourTriangle = new ColourTriangle(10, 20, "Equilateral", "Red");
        colourTriangle.showDimensions();
        System.out.println(colourTriangle);

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.showDimensions();
        System.out.println(rectangle);

        // Create a Fighter objects
        Fighter fighter = new Fighter();
        Fighter chunLi = new ChunLi();
        Fighter ryu = new Ryu();
        
        ryu.specialMove();
        chunLi.specialMove();
        fighter.specialMove();

    }
}
