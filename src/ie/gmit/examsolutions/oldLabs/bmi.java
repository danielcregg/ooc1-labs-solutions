package ie.gmit.examsolutions.oldLabs;
import java.util.Scanner;


public class bmi {
	
	public static void main( String args[])
	{
		
		//Declare Variables
		String name;
		int numberPersons;
		float weight;
		float height;
		Scanner in;
		float bmi;
		float total_bmi=0;
		float max_bmi=0;
		float min_bmi=0;
		float bmi_cat1=0;
		float bmi_cat2=0;
		float bmi_cat3=0;
		float bmi_cat4=0;
		float bmi_cat5=0;
		float bmi_cat6=0;
		
		
		///Initialsise the input stream
		in = new Scanner(System.in);
		
		
		// Ask for the number of people
		System.out.println("How many people are you going to enter");
		
		numberPersons = in.nextInt();
		
		/// Loop through all the people
		for(int i=0; i<numberPersons; i++)
		{
			
			/// Get the person's name, weight and height
			System.out.println("Please enter the name");
			name = in.next();
			
			System.out.println("Please enter the weight");
			weight = in.nextFloat();
			
			System.out.println("Please enter the height");
			height = in.nextFloat();
			
			// Call the calculate BMI Method
			// Pass the height and weight
			// Store result in bmi variable
			bmi = calculateBMI(weight,height);
			
			// Display BMI
			System.out.println(name+" your bmi is: "+bmi);
			
			//Check the BMI category and update the counter for that category
			if(bmi<18.5)
			{
					System.out.println("Your are underweight");
					bmi_cat1++;
			}
			else if(bmi<24.99)
			{
					System.out.println("Your are normal weight");
					bmi_cat2++;
			}
			else if(bmi<29.99)
			{
					System.out.println("Your are over weight");
					bmi_cat3++;
			}
			else if(bmi<34.99)
			{
				System.out.println("Your are obes (Class 1)");
				bmi_cat4++;
			}
			else if(bmi<39.99)
			{
				System.out.println("Your are obes (Class 2)");
				bmi_cat5++;
			}
			else
			{
				System.out.println("Your are morbid obes");
				bmi_cat6++;
			}
			
			//Check if this BMI is the Max BMI
			if(bmi>max_bmi)
				max_bmi = bmi;
			
			//Change the min bmi is this bmi is smaller or this is the first bmi (Was not asked in the CA)
			if(bmi<min_bmi || i==0 )
				min_bmi = bmi;
			
			// Update the total bmi
			total_bmi+=bmi;
		}
		
		// Display the results and the counts of the various categories
		System.out.println("The average bmi is: "+total_bmi/numberPersons);
		System.out.println("The max bmi is: "+max_bmi);
		System.out.println("The min bmi is: "+min_bmi);
		
		System.out.println("The number of underweight people is: "+bmi_cat1);
		System.out.println("The number of normal weight people is: "+bmi_cat2);
		System.out.println("The number of over weight people is: "+bmi_cat3);
		System.out.println("The number of obes (Class 1) people is: "+bmi_cat4);
		System.out.println("The number of obes (Class 2) people is:  "+bmi_cat5);
		System.out.println("The number of morbid obis people is: "+bmi_cat6);
		
		in.close();
	}
	
	/// Method for the calculation of the BMI
	//// Not it is outside the main method but inside the CA2 class
	private static float calculateBMI(float weight,float height)
	{
		float bmi;
		
		bmi = weight/(height*height);
		
		return bmi;
	}
}
