//What is the output of the following program? Why?

/*
  The following is the command of interest
  double averageAge = (age1 + age2 + age3 + age4) / 4;
  
  This amounts to 
  double averageAge = 147 / 4;
  
  This puts the value 36.0 into the double averageAge. The real result is 36.75 but we have lost the decimal part.
  
  This is similar to some of the scenarios in Expressions. Since both 147 and 4 
  are stored integer then the decimal precision is lost in the assignment. If
  the following instruction was used the result would be 36.75
  
  We must cast the result to a double to keep the decimal part.
  double averageAge = (double)(age1 + age2 + age3 + age4) / 4;
 */
package ie.atu.datatypes;

public class AverageCalculator {
	public static void main(String[] args) {
		int age1 = 10;
		int age2 = 9;

	    int averageAge = (age1 + age2) / 2;
	    //double averageAge = (age1 + age2) / 2;
	    //double averageAge = (double) (age1 + age2) / 2;
	    
	    System.out.println(averageAge);
	}
}
