package ie.atu.inheritance;

public class Triangle extends TwoDShape {

    // Instance variable
    private String triangleType;

    // Constructor
    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    // Getters and Setters
    public String getTriangleType() {
        return triangleType;
    }

    public void setTriangelType(String triangleType) {
        this.triangleType = triangleType;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    // toString method
    @Override
    public String toString() {
        return "Triangle is " + triangleType + " and has a height of " + getHeight() + " and a width of " + getWidth();
    }

}
