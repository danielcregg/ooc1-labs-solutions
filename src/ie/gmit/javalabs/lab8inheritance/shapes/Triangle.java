package ie.gmit.javalabs.lab8inheritance.shapes;

public class Triangle extends TwoDShape {
	private String style;
	
	public Triangle(String style, double width, double height) {
		super(width, height);
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public double area() {
		return .5 * getWidth() * super.getHeight();
	}
	
	public void printStyle() {
		System.out.println(style);
	}
	
	public void print() { 
		System.out.println("The triangle is " + style); 
		System.out.println("Width is " + getWidth() + " and Height is " + getHeight());
	} 

}
