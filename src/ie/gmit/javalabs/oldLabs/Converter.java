package ie.gmit.javalabs.oldLabs;

public class Converter {
	
	public static float celsiusToFahrenheit(float tempInCelsius){
		return (float)((tempInCelsius*1.8) + 32);
	}
	public static float fahrenheitToCelsius(float tempInFahrenheit){
		return (float)((tempInFahrenheit-32)/1.8);
	}
}
