package ie.atu.controlflow.decisionmaking;

import java.util.Random;

public class CoinToss {

    public static void main(String[] args) {
      Random random = new Random();
      int tossCount = 0; // Count total number of tosses
      int headsCount = 0; // Count of consecutive heads
  
      while (headsCount < 3) { // While headsCount is less than 3
        // Increment the toss count
        tossCount++;
        // Randomly set isheads to true or false
        boolean isHeads = random.nextBoolean(); 
        // If isHeads is true, set result to "Heads", otherwise set it to "Tails"
        String result = isHeads ? "Heads" : "Tails";
        // Print the result, heads or tails
        System.out.println(result);
  
        // If heads, increment headsCount, otherwise reset it to 0
        if (isHeads) {
          headsCount++;
        } else {
          headsCount = 0; // Reset if not heads
        }
      }
  
      System.out.println("Got 3 heads in a row!");
      System.out.println("Total tosses: " + tossCount);
    }
  }