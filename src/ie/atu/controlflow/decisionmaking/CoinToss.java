package ie.atu.controlflow.decisionmaking;

import java.util.Random;

public class CoinToss {

  public static void main(String[] args) {
    Random random = new Random(); // Create a random number generator
    int numAttempts = 10; // Number of attempts to simulate
    int totalTossed = 0; // Total tosses across all attempts

    // Simulate coin tosses for the specified number of attempts
    for (int i = 0; i < numAttempts; i++) {  
      int tossCount = 0; // Reset toss count for each attempt
      int headsCount = 0; // Reset heads count for each attempt

      while (headsCount < 3) { 
        boolean isHeads = random.nextBoolean();
        headsCount = isHeads ? headsCount + 1 : 0; // Increment/reset headsCount
        tossCount++;
      }

      if (headsCount == 3) {
        totalTossed += tossCount; // Accumulate tosses for successful attempts
      } 
   } // End of for loop

    // Calculate and display average tosses (outside the loop)
    if (totalTossed > 0) {
      double averageTossed = (double) totalTossed / numAttempts;
      System.out.println("Average number of tosses after " + numAttempts + " attempts to get 3 heads in a row: " + averageTossed);
    } else {
      System.out.println("No successful outcomes found in " + numAttempts + " attempts.");
    } // End of if-else

  } // End of main
} // End of class CoinToss
