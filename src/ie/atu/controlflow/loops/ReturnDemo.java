package ie.atu.controlflow.loops;

public class ReturnDemo {
    public static void main(String[] args) {
        // For loop to print out the numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If i is 5, terminate then loop
            if (i == 5) {
                System.out.println("i = " + i + ". Returning from method!");
                return;
            }
            System.out.println("The value of i is " + i);
        } // End of for loop
        /* The return statement is different from the break statement. The return statement takes you out
         * of the method. It stops executing the method and returns from the method execution. This means the
         * following line will not be printed.
         */
        System.out.println("End of method reached!"); // 
        
    } // End of main method
} // End of class ReturnDemo
