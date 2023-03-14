package ie.atu.arrays;

public class ArraySummer {

	public static void main(String[] args) {
		
		int[] numbers = { 1,2,3,4,5 };
        int sum = 0;
        
        //System.out.print("Sum of ");
        
        for(int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
//            if (i < (numbers.length - 1)) {
//            	System.out.print(numbers[i] + " + ");
//            } else {
//            	System.out.print(numbers[i]);
//            }
        }
        
        //System.out.println(" = " + sum);
        System.out.println("Sum: " + sum);
	}
	
}
