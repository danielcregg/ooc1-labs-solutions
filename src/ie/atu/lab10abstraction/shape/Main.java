package ie.atu.lab10abstraction.shape;

public class Main {
	public static void main(String[] args) {
		
		// Create rectangle objecct
		Rectangle recObj1 = new Rectangle(10.0f, 5.0f);
		Triangle triObj1 = new Triangle(4.5f, 4.5f);
		Circle cirObj1 = new Circle(9.9f);
		
		Rectangle recObj2 = new Rectangle(20.0f, 10.0f);
		Triangle triObj2 = new Triangle(9.0f, 9.0f);
		Circle cirObj2 = new Circle(19.8f);
	
		System.out.println( "Area of rec1 = " +  recObj1.calculateArea()  );
		System.out.println( "Area of tri1 = " +  triObj1.calculateArea()  );
		System.out.println( "Area of cir1 = " +  cirObj1.calculateArea()  );
		System.out.println( "Area of rec2 = " +  recObj2.calculateArea()  );
		System.out.println( "Area of tri2 = " +  triObj2.calculateArea()  );
		System.out.println( "Area of cir2 = " +  cirObj2.calculateArea()  );
	
	} // End Main method
} // End Main Class
