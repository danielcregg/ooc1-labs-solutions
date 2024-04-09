package ie.atu.apie;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder area: " + cylinder.area());
        System.out.println("Cylinder volume: " + cylinder.volume());
    }
}