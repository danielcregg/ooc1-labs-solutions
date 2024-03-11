package ie.atu.inheritance;

public class Triangle extends TwoDShape {

    // Instance variable
    private String triangleType;

    // Constructor
    public Triangle(double width, double height, String triangleType) {
        super(width, height); // Call the constructor of the superclass
        this.triangleType = triangleType;
    }

    // Getters and Setters
    public String getTriangleType() {
        return triangleType;
    }

    public void setTriangelType(String triangleType) {
        this.triangleType = triangleType;
    }

    // Method to calculate the area of the triangle
    @Override
    public double area() {
        return super.getWidth() * super.getHeight() / 2;
    }

    // toString method
    @Override
    public String toString() {
        return "Triangle is " + triangleType + " and has a height of " + getHeight() + " and a width of " + getWidth();
    }

}
