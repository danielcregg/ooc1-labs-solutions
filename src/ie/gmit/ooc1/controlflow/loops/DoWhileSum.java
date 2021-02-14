package ie.gmit.ooc1.controlflow.loops;

import java.util.Scanner;

public class DoWhileSum {

	public static void main(String[] args) {
		Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);

	      
	      do {
	    	 System.out.print("Enter a number: ");
	    	 number = input.nextDouble();
	    	 sum += number;
	      } while (number != 0.0);
		   
	      System.out.println("Sum = " + sum);
	      input.close();
	}

}
