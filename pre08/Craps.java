import java.io.*;
import java.util.*;

public class Craps {
  //Just testing right now, TODO
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n,m, result;

    System.out.println("Enter a dice size:");
    n = in.nextInt();
    System.out.println("Enter a number of dice to roll:");
    m = in.nextInt();

    result = shoot(m,n);
    System.out.printf("Your max roll is: %d", result);
    System.out.println();
  }

  public static int roll(int diceSize){
    Random random = new Random();
    int result = random.nextInt(diceSize) + 1;
    return result;
  }

  public static int shoot(int amt, int diceSize){
    int max = 0;
    for (int i = 0; i < amt; i++){
      int currentRoll = roll(diceSize);
      if (max < currentRoll){
        max = currentRoll;
      }
    }
    return max;
  }
  //TODO
  public static boolean round(){
    return true;
  }
}