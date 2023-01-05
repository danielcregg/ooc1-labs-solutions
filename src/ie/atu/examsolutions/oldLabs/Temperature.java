package ie.atu.examsolutions.oldLabs;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

	// Declare variables
	float temperature;
	float temperatureConvert;
	String unit;
	Scanner in;
		
	// Instantiate the scanner object
	in = new Scanner(System.in);
	
	///Prompt the user to enter the temperature
	System.out.println("Please Enter the Temperature in Fahrenheit or Celsius");
	// Read in the temperature
	temperature = in.nextFloat();
	
	//System.out.println(temperature+" in Fahrenheit is "+Converter.celsiusToFahrenheit(temperature));
	//System.out.println(temperature+" in Celsius is "+Converter.fahrenheitToCelsius(temperature));
	
	///Prompt the user to enter the unit of their input
	System.out.println("Please Enter the C if the temperature is in Celsius or F if the temperature is in Fahrenheit");
	// Read in unit
	unit = in.next();
	
	// If user enter Celsius then convert to Fahrenheit and display the result
	if(unit.equals("C") || unit.equals("c"))
	{
		temperatureConvert = toFahrenheit(temperature);
		System.out.println("The temperature is: "+temperatureConvert+"F");
	}
	// Else If user enter Fahrenheit then convert to Celsius and display the result
	else if(unit.equals("F") || unit.equals("f"))
	{
		temperatureConvert = toCelsius(temperature);
		System.out.println("The temperature is: "+temperatureConvert+"C");
	}
	// Otherwise the user entered a wrong unit
	else
	{
		System.out.println("Invalid Temperature Unit");
	}
	in.close();
}

	/*
	 * Temperature Conversions
	 * Fahrenheit to Celsius : (�F - 32) / 1.8 = �C
 	 * Celsius to Fahrenheit : (�C * 1.8) + 32 = �F
	 */
	// Method to convert Fahrenheit to Celsius
	// Return the Celsius as a float
	private static float toCelsius(float temperature) 
	{
		float result;
		
		// Apply conversion
		result = (float) ((temperature-32)/1.8);
		// return the result
		return result;
	}

	// Method to convert Celsius to Fahrenheit
	// Return the Fahrenheit as a float
	private static float toFahrenheit(float temperature) 
	{
		float result;
		
		// Apply conversion
		result = (float) ((temperature*1.8) + 32);
		
		//return the result
		return result;
	}
}
