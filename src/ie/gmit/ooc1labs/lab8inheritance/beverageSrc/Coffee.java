package ie.gmit.ooc1labs.lab8inheritance.beverageSrc;

public class Coffee extends Beverage{
	
	public boolean isAcceptableTemperature(){
		return temperature > 70;
	}
	
	public void displayColour(){
		super.getColour();
	}
}
