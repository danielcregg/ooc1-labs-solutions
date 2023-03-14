/* Do-while loops are useful when you want to execute a block of code 
 * at least once, regardless of whether the condition is true or false,
 * and then continue executing the block of code as long as the condition
 * remains true. They can be helpful in situations where you need to ensure 
 * that a certain action is performed at least once, such as when validating 
 * user input. 
*/
package ie.atu.controlflow.loops;

import java.util.Scanner;

public class DoWhileUserInputValidation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user via the console
        Scanner input = new Scanner(System.in);

        // Declare an integer variable to store the user input
        int number;

        // Use a do-while loop to prompt the user to enter a number between 1 and 10,
        // and read the input. If the input is not between 1 and 10, 
        // prompt the user to enter another number until a valid input is received
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();
        } while (number < 1 || number > 10);

        // Print the user input once a valid input is received
        System.out.println("You entered: " + number);
        // Close the Scanner object
        input.close();
    }
}
