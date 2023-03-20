package ie.atu.inheritance.beverage;

public class Wine extends Beverage{

	public boolean isAcceptableTemperature(){
		return temperature < 10;
	}
}
