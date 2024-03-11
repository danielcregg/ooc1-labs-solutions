package ie.atu.inheritance;

import ie.atu.polymorphism.overriding.streetfighter.ChunLi;
import ie.atu.polymorphism.overriding.streetfighter.Fighter;
import ie.atu.polymorphism.overriding.streetfighter.Ryu;

public class Main {

    public static void main(String[] args) {
        // Create a Triangle object
        Triangle triangle = new Triangle(10, 20, "Equilateral");
        System.out.println(triangle.area());
        triangle.toString();
        System.out.println(triangle);

        // Create a ColourTriangle object
        ColourTriangle colourTriangle = new ColourTriangle(10, 20, "Equilateral", "Red");
        System.out.println(colourTriangle.area());
        colourTriangle.toString();
        System.out.println(colourTriangle);

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.area());
        rectangle.toString();
        System.out.println(rectangle);

    }
}
