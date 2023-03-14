package ie.atu.controlflow.loops;

public class BreakDemo {
    public static void main(String[] args) {
        // For loop to print out the numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If i is 5, terminate then loop
            if (i == 5) {
                System.out.println("i = " + i + ". Breaking out of loop!");
                break;
            }
            System.out.println("The value of i is " + i);
        } // End of for loop
        System.out.println("End of method reached!");
    } // End of main method
} // End of class BreakDemo
