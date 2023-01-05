package ie.atu.ooc1labs.inheritance.beverageSrc;

public class Wine extends Beverage{

	public boolean isAcceptableTemperature(){
		return temperature < 10;
	}
}
