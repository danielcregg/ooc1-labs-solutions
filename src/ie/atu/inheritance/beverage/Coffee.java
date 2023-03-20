package ie.atu.inheritance.beverage;

public class Coffee extends Beverage{
	
	public boolean isAcceptableTemperature(){
		return temperature > 70;
	}
	
	public void displayColour(){
		super.getColour();
	}
}
