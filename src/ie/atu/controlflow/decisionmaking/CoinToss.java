package ie.atu.controlflow.decisionmaking;

import java.util.Random;

public class CoinToss {

    public static void main(String[] args) {
      Random random = new Random();
      int tossCount = 0; // Count total number of tosses
      int headsCount = 0; // Count of consecutive heads
  
      while (headsCount < 3) {
        tossCount++;
        boolean isHeads = random.nextBoolean();
        String result = isHeads ? "Heads" : "Tails";
        System.out.println(result);
  
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