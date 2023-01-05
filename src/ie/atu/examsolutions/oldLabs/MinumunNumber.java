package ie.atu.examsolutions.oldLabs;

import java.util.Scanner;


public class MinumunNumber {
	
	public static void main(String[] args)
	   {
			//Declare variables
			Scanner input;
			float value1,value2,value3;
			
			//Initialize the scanner object
			input = new Scanner(System.in);
			
			//Prompt the user to enter number 
			System.out.println("Please enter a number");
			//Assign the user input to value1
			value1 = input.nextFloat();
			
			//Prompt the user to enter number
			System.out.println("Please enter a number");
			//Assign the user input to value1
			value2 = input.nextFloat();
			
			//Prompt the user to enter number
			System.out.println("Please enter a number");
			//Assign the user input to value1
			value3 = input.nextFloat();
			
			/// If value1 is the smallest then display it
			if(value1<=value2 && value1<=value3)
			{
				System.out.println("The smallest value is "+value1);	
			}
			/// If value2 is the smallest then display it
			else if (value2<=value1 && value2<=value3) 
			{
				System.out.println("The smallest value is "+value2);	
			}
			/// If value3 is the smallest then display it
			//else if(value3<=value1 && value3<=value2)
			//{
			else
			{
				System.out.println("The smallest value is "+value3);
			}
			
			/// Close the input.
			input.close();
	   }
}
