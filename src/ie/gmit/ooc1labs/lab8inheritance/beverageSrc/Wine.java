package ie.gmit.ooc1labs.lab8inheritance.beverageSrc;

public class Wine extends Beverage{

	public boolean isAcceptableTemperature(){
		return temperature < 10;
	}
}
