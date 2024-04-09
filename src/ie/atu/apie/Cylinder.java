package ie.atu.apie;

// Inheritance
class Cylinder extends Circle {
    
    // Instance variable
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Setter
    public void setHeight(double height) {
        this.height = height;
    }

    // Polymorphism (method overriding)
    @Override
    public double area() {
        return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
    }

    
    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
}
