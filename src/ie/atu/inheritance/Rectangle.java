package ie.atu.inheritance;

public class Rectangle extends TwoDShape {

    // Constructor
    public Rectangle(double width, double height) {
        super(width, height); // Call the constructor of the superclass
    }

    public double area() {
        return getWidth() * getHeight();
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle has a height of " + getHeight() + " and a width of " + getWidth();
    }

}
