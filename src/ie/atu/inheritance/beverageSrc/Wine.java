package ie.atu.inheritance.beverageSrc;

public class Wine extends Beverage{

	public boolean isAcceptableTemperature(){
		return temperature < 10;
	}
}
