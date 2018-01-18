package ie.gmit.javalabs.oldLabs;

import java.util.Scanner;


public class Lab5Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare the variables
		Scanner input;
		int numberToRead;
		int value;
		int count=0;
		int sum=0;
		float average;
		
		// Initialize the Scanner object
		input = new Scanner(System.in);
		
		
		System.out.println("This program reads in numbers from the user and then displays\n"
						 + " the average of all of the numbers that are divisible by 6 or 17.\n");
		
		
		// Prompt the user to enter the number of numbers that they wish to enter...
		System.out.println("Please enter the number of integers you wish to read");
		// Read the users input
		numberToRead = input.nextInt();
		
		//Repeat the loop a "numberToRead" times.....
		for(int i=0; i < numberToRead; i++)
		{
			// Prompt the user to enter a number
			System.out.println("Please enter your number");
			// Read the users input
			value = input.nextInt();
			
			if(value % 6 == 0 ||value % 17 == 0)
			{
				//Increment the count of numbers divisible by 6 or 17
				count++;
				sum+=value;
			}
		}
		
		// If none of the numbers were divisible by 6 or 17 & So to avoid dividing by zero
		if(count==0)
			System.out.println("None Divisble");		
		else
		{
			// Calculate the average and cast it to a float...
			average=(float)sum/count;
			System.out.println("Average of numbers divisible by 6 or 17 = " + average);
		}
			
		// Close the input stream
		input.close();
	}

}
