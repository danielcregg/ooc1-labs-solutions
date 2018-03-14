package ie.gmit.javalabs.lab8inheritance.shapes;

public class TwoDShape {
	private double width;
	private double height;

	public TwoDShape(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void print() {
		System.out.println("Width is " + width + "and Height is " + height);
	}
}
