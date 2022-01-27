import java.io.*;
import java.util.*;

public class Craps {
  //Just testing right now, TODO
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n,m, result;

    //System.out.println("Enter a dice size:");
    //n = in.nextInt();
    //System.out.println("Enter a number of dice to roll:");
    //m = in.nextInt();

    boolean win = round();
    if(win){
      System.out.println("You win!");
    } else {
      System.out.println("You lose!");
    }
  }

  public static int roll(int diceSize){
    Random random = new Random();
    int result = random.nextInt(diceSize) + 1;
    return result;
  }

  public static int shoot(int amt, int diceSize){
    int sum = 0;
    for (int i = 0; i < amt; i++){
      sum = sum + roll(diceSize);
    }
    return sum;
  }
  //TODO
  public static boolean round(){ 
    int diceRoll = shoot(2,6);
    System.out.printf("First: Rolled a %d", diceRoll);
    System.out.println();
    int point = 0;
    if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12){
      return false;
    } else if (diceRoll == 7 || diceRoll == 11) {
      return true;
    } else {
      point = diceRoll;
    }
    System.out.printf("Point is: %d",point);
    System.out.println();
    do {
      diceRoll = shoot(2,6);
      System.out.printf("First: Rolled a %d", diceRoll);
      System.out.println();
    } while (diceRoll != 7 && diceRoll != point);

    if (diceRoll == 7){
      return false;
    } else if (diceRoll == point) {
      return true;
    } else {
      System.out.println("Uh oh... returning false but error");
      return false;
    }
  }
}