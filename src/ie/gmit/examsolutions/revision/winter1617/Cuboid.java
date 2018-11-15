package ie.gmit.examsolutions.revision.winter1617;

public class Cuboid {
	
	// Declare Field Variables
	double length, width, height;
	
	
	// Constructor with parameters --- sets all variables to their respective parameter values
	public Cuboid(double len, double wdt, double hgt)
	{
		length = len;
		width = wdt;
		height = hgt;
	}
	
	// Setter Methods
	public void setlength(double length){
		this.length = length;
	}
	public void setwidth(double width){
		this.width = width;
	}
	public void setheight(double height){
		this.height = height;
	}
	
	public double surfaceArea()
	{
		double surfaceArea = (2 * width * length + 2 * length * height + 2 * height * width);
		return (surfaceArea);
	}
	
	public double volume()
	{
		double volume = (length * width * height);
		return (volume);
	}
	
	public String printCuboid(){
		String out = ("Length: " + length + ", " + "Width: " + width + ", " + "Height: " + height);
		System.out.println(out);
		return out;
	}
}

