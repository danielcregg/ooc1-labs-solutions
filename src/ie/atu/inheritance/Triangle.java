package ie.atu.inheritance;

// Triangle class extends TwoDShape class. Triangle is a subclass of TwoDShape class.
public class Triangle extends TwoDShape {

    // Instance variable
    private String triangleType;

    // Constructor
    public Triangle(double width, double height, String triangleType) {
        super(width, height); // Call the constructor of the superclass
        this.triangleType = triangleType;
        System.out.println("Inside the Triangle constructor");
    }

    // Getter and Setter
    public String getTriangleType() {
        return triangleType;
    }

    public void setTriangelType(String triangleType) {
        this.triangleType = triangleType;
    }

    // Method to calculate the area of the triangle. Overriding the area method in
    // the superclass. // Area of a triangle is 1/2 * base * height
    @Override
    public double area() {
        return 0.5 * super.getWidth() * super.getHeight();
    }

    // toString method
    @Override
    public String toString() {
        return "This Triangle is " + triangleType + " and has a height of " + getHeight() + " and a width of "
                + getWidth();
    }

}
