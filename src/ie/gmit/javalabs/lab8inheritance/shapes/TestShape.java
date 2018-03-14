package ie.gmit.javalabs.lab8inheritance.shapes;

public class TestShape {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle("Isosceles", 5.0, 5.0);
		triangle1.area();
		triangle1.getHeight();
		triangle1.print();
		
		
		ColourTriangle ct1 = new ColourTriangle("Eqilaterial", 10.0, 8.5, "red");
		System.out.println(ct1.getHeight());
		
		Rectangle rec1 = new Rectangle(3.0, 4.0);
		System.out.println(rec1.area());
	}

}
