package ie.atu.controlflow.loops;

public class ContinueDemo {
    public static void main(String[] args) {
        // For loop to print out the numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If i is 5, skip this iteration of the loop and continue
            if (i == 5) {
                System.out.println("i = " + i + ". Skipping the rest of this iteration of the loop and then continuing to loop!");
                continue;
            }
            System.out.println("The value of i is " + i);
        } // End of for loop
        System.out.println("End of method reached!"); 
    } // End of main method
} // End of class ContinueDemo
