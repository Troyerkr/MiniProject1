
/*
Mini Project 1
Group #_: YourName, YourPartnerName1, YourPartnerName2, YourPartnerName3 (if you have 4 members)
Date: (whatever date you turn it in)
*/
import java.util.Scanner;
import java.util.Random;

class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");

    Scanner setupScan = new Scanner(System.in);
    Random r = new Random();

    int userNum = setupScan.nextInt();

    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");

    playGame(randomNum, userNum);

  }

  static void playGame(int numToGuess, int userOrigInput) {
    System.out.println("Please guess a number between 0 and " + userOrigInput);

    Scanner gameScan = new Scanner(System.in);

    // make it so you can only enter numbers in that range?
    int userGuess = gameScan.nextInt();
    int numTries = 1;
    while (numToGuess != userGuess) {
      if (userGuess > numToGuess) {
        System.out.println("guess lower");
      } else {
        System.out.println("guess higher");
      }
      System.out.println("Enter your new guess: ");
      userGuess = gameScan.nextInt();
      numTries++;
    }
    if (numTries = 1) {
      System.out.println("Great, you win! It took you " + numTries + " try");
    } else {
      System.out.println("Great, you win! It took you " + numTries + " tries");
    }
  }
}