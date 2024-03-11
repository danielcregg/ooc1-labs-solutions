package ie.atu.inheritance;

public class TwoDShape {

    // Instance variables
    private double width;
    private double height;

    // Constructor
    public TwoDShape(double width, double height) {
        System.out.println("Inside the TwoDShape constructor");
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the area of the shape
    public double area() {
        return width * height;
    }

    // toString method - returns a string representation of the object
    @Override
    public String toString() {
        return "The Width of 2D shape is : " + width + " and the Height of 2D shape: " + height;
    }
}
