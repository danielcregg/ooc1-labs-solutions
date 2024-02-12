package ie.atu.arrays;

public class ArraySummer {

    public static void main(String[] args) {

        // Constant for array size
        final int ARRAY_SIZE = 10;
        
        // Variables
        int sum = 0;
        double average = 0;

        // Create an array of 100 random numbers
        int[] numbers = new int[ARRAY_SIZE];

        // Populate the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        // Sum the numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Print the array using Arrays.toString
        System.out.println(java.util.Arrays.toString(numbers)); 
        // System.out.println(" = " + sum);
        System.out.println("Sum: " + sum);
        average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

    } // end of main
} // end of class
