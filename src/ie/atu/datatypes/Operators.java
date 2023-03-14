package ie.atu.datatypes;

public class Operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 17;
		
//		System.out.println((a + b) / c); // 3 and 4 are added with sum 7. 7 is divided by 5 with quotient 1
//		System.out.println(a + b / c); //4 is divided by 5 with quotient 0. 3 is added to 0 with sum 3
//		
//		System.out.println(a++); // 3 is displayed. Then a is incremented to 4
//		System.out.println(a--); // 4 is displayed. Then a is decremented to 3
//		
//		System.out.println(a + 1); // 3 is added to 1. Then 4 is displayed. Note a is not assigned the new value of 4
//		
//		System.out.println(++a); // 3 is incremented to 4 and then 4 is displayed
//		System.out.println(--a); // 4 is decremented to 3 and then 3 is displayed
				
//		System.out.println(d % b); // 17 is divided by 4, which is 4 with a remainder of 1. Then 1 is displayed
//		
//		System.out.println(d / c); // 17 is divided by 5 which should be 3.4. However, d and c are both integer so the answer is 3
//		
//		System.out.println(d + a / d + b); // 5 is divided by 17. Which is 0 because a and d are integers. Then the answer is added to 17 and 4. Then 21 is displayed
//		
//		System.out.println((d + a) / (d + b)); //17 is added by 3. This is divided by the sum of 17 and 4 (ie 20/21). Then 0 is displayed (because both value are integers)
		
		System.out.println(Math.max(a,b)); // The max of 3 and 4 is calculated .  4 is displayed
		System.out.println(Math.min(a, b)); // The min of 3 and 4 is found. 3 is displayed
		
		System.out.println(Math.sqrt(b)); // The square root of 4 is calculated.  2.0 is displayed
		System.out.println(Math.pow(a, b)); // 3 to the power of 4 is calculated. 81.0 is displayed
		System.out.println(Math.abs(-a)); // The absolute value of -3 is calculated. 3 is displayed
		System.out.println(Math.PI);
		System.out.println(Math.pow(Math.PI,Math.PI));		

	}// End main
}// End class
