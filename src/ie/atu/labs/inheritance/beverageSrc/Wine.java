package ie.atu.labs.inheritance.beverageSrc;

public class Wine extends Beverage{

	public boolean isAcceptableTemperature(){
		return temperature < 10;
	}
}