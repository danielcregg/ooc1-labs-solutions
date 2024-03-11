package ie.atu.inheritance;

// ColourTriangle class extends Triangle class. ColourTriangle is a subclass of Triangle.
public class ColourTriangle extends Triangle {

    // Instance variable
    private String colour;

    // Constructor
    public ColourTriangle(double width, double height, String triangleType, String colour) {
        super(width, height, triangleType); // Call the constructor of the superclass
        this.colour = colour;
        System.out.println("Inside the Colour Triangle constructor");
    }

    // Getters and Setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // toString method
    @Override
    public String toString() {
        return "The ColourTriangle is a " + super.getTriangleType() + " triangle with a width of " + super.getWidth() + " and a height of " + super.getHeight() + " and the colour is " + colour;
    }

}
