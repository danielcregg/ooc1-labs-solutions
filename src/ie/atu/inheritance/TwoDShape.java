package ie.atu.inheritance;

public class TwoDShape {

    // Instance variables
    private double width;
    private double height;

    // Constructor
    public TwoDShape(double width, double height) {
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

    // Method to display the dimensions of the shape
    public void showDimensions() {
        System.out.println("Width and height are of this 2D Shape are " + width + " and " + height);
    }
}

