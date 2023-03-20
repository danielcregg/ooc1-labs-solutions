package ie.atu.inheritance.beverage;

public class Beverage {
	
	private String colour = "blue";
	public int temperature = 0;
	
	public String getColour(){
		return colour;
	}
	
	public boolean isAcceptableTemperature(){
		return temperature > 0;
	}
}
