package ie.atu.controlflow.decisionmaking;

import java.util.Random;

public class CoinToss {

  public static void main(String[] args) {
    Random random = new Random();
    int numAttempts = 100; // Number of attempts to simulate
    int totalTossed = 0; // Total tosses across successful attempts

    for (int i = 0; i < numAttempts; i++) {
      int tossCount = 0; // Reset toss count for each attempt
      int headsCount = 0;

      while (headsCount < 3 && tossCount < 100) { // Adjust max tosses if needed
        boolean isHeads = random.nextBoolean();
        headsCount = isHeads ? headsCount + 1 : 0; // Increment/reset headsCount
        tossCount++;
      }

      if (headsCount == 3) {
        totalTossed += tossCount; // Accumulate tosses for successful attempts
      }
    }

    // Calculate and display average tosses (outside the loop)
    if (totalTossed > 0) {
      double averageTossed = (double) totalTossed / numAttempts;
      System.out.println("Average number of tosses to get 3 heads in a row: " + averageTossed);
    } else {
      System.out.println("No successful outcomes found in " + numAttempts + " attempts.");
    }
  }
}