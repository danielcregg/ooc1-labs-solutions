package ie.atu.examsolutions.oldLabs;

import java.util.Scanner;

public class StringMath {

	public static void main(String[] args) {

		//Declare variables
		String string1, string2;
		int num1, num2;
		Scanner in;
		
		// Instantiate the Scanner object
		in = new Scanner(System.in);
		
		//Prompt the user to enter a number and read in the number.
		System.out.println("Enter Number 1");
		num1 = in.nextInt();

		//Prompt the user to enter a number and read in the number.
		System.out.println("Enter Number 2");
		num2 = in.nextInt();
		
		//Prompt the user to enter a string and read in the string.
		System.out.println("Enter String 1");
		string1 = in.next();
		
		//Prompt the user to enter a string and read in the string.
		System.out.println("Enter String 2");
		string2 = in.next();
		
		// Display inputs to user
		System.out.println("Number 1 = " + num1);
		System.out.println("Number 2 = " + num1);
		System.out.println("String 1 = " + string1);
		System.out.println("String 2 = " + string2);
		
		//Display the length of both strings. 
		System.out.println("Length of String 1 = " + string1.length());
		System.out.println("Length of String 2 = " + string2.length());
		
		//Compare both strings lexicographically and display the bigger string. 
		//Store the result of the comparison in the result variable
		int result = string1.compareTo(string2);
		
		if (result == 0) { //If the result is 0 then the strings are equal
			System.out.println("Both strings are the same");
		} else if (result < 0) { //If the result is less than 0 then the string1 is smaller
			System.out.println("String2 is bigger (i.e. String2 comes after String1 alphabetically)");		
		} else { //If the result is greater than 0 then the string1 is smaller
			System.out.println("String1 is bigger (i.e. String1 comes after String2 alphabetically)");
		}
		
		//Compare a number of characters ( the number of characters is specified by the length of the smaller string) of both strings 
		//and display the bigger sub-string. 
		
		//Get the length of the smallest string
		int length = Math.min(string1.length(), string2.length());
		
		//Compare both sub-strings lexicographically and display the bigger sub-string. 
		//Store the result of the comparison in the result variable		
		result = string1.substring(0, length).compareTo(string2.substring(0, length));
		
		//If the result is 0 then the sub-strings are equal
		if (result == 0)
			System.out.println("Both substrings are the same");
		
		//If the result is less than 0 then the sub-string1 is smaller
		else if (result < 0)
			System.out.println("Sub-String2 is bigger");
		
		//If the result is greater than 0 then the sub-string1 is bigger
		else
			System.out.println("Sub-String1 is bigger");
		
		//Concatenate string2 to string1.
		//Display both strings. 
		System.out.println("Concatenation: ");
		string1 = string1.concat(string2);
		System.out.println("String1: "+string1);
		System.out.println("String2: "+string2);
		
		
		//Concatenate the first three characters of string2 to string1.
		//Display both strings. 
		System.out.println("Concatenation first 3 Characters of string2 to string1: ");
		string1 = string1.concat(string2.substring(0, 3));
		System.out.println("String1: "+string1);
		System.out.println("String2: "+string2);
		
		//Copy the first three characters of string1 to string2 
		//Display both strings. 
		string2 = string1.substring(0, 3);
		System.out.println("String1: "+string1);
		System.out.println("String2: "+string2);
		
		//Display the absolute value of value1
		System.out.println("The absolute value of num1 is " + Math.abs(num1));
		
		//Display the max value of value1 and value2 
		System.out.println("The max number of num1 and num2 is "+ Math.max(num1,num2));
		
		//Display value1 to the power of value2 
		System.out.println("The value of num1 to the power of num2 is "+ Math.pow(num1, num2));
		
		//Display the sqrt of value2 
		System.out.println("The value of the square root of num2 is "+ Math.sqrt(num2));
		
		//Close Scanner Object
		in.close();
	}
}
