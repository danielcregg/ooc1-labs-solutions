package ie.gmit.ooc1labs.lab2operators;

																														//import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] Strings) {

																														//Scanner input = new Scanner(System.in);
																														//System.out.print("Please enter a temperature in degrees Celsius: "); 
																														//double fahrenheitTemp = input.nextDouble(); double celsiusTemp = input.nextDouble();
		double fahrenheitTemp = 100;
																														//double celsiusTemp = 100;
		double tempInCelsius = ((5 * (fahrenheitTemp - 32.0)) / 9.0);
																														//double tempInFahrenheit = ((9 * celsiusTemp) + (32 * 5)) / 5;
		System.out.println(fahrenheitTemp + " degree Fahrenheit is equal to " + tempInCelsius + " in Celsius");
																														//System.out.println(celsiusTemp + " degrees Celcius is equal to " + tempInFahrenheit + " degrees Fahrenheit");
																											//input.close();
	
		float f = 3.14f;
		int i = (int) f;
		System.out.println(i);
		
	}
}
