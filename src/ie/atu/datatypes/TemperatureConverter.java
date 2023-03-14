package ie.atu.datatypes;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] Strings) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a temperature in degrees Celsius: "); 
		
		// Read in next double value from Keyboard
		double celsiusTemp = input.nextDouble();
		
		double tempInFahrenheit = ((9  * celsiusTemp/5) + 32 );
		
		System.out.println(celsiusTemp + " degrees Celsius is equal to " + tempInFahrenheit + " degrees Fahrenheit");
		
		// Close Scanner
		input.close();		
	}
}
