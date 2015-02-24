// Exercise 6.33: Craps.java
// Craps class simulates the dice game craps.
import java.util.Random;
import java.util.Scanner;

public class Craps 
{
   // create random number generator for use in method rollDice
   private static final Random randomNumbers = new Random();
   
   int balance;
   int wager; 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

  
   // allows the user to bet on games of Craps
   public static void main(String args[])
   {
      Scanner myWager = new Scanner(System.in);
      // start the user off with $1000
      balance = 1000;
      // prompt the user for a wager
      do {
      System.out.printf("Your balance is: %d\n", balance);
      System.out.print("Enter your wager (-1 to quit): ");
      wager = myWager.nextInt();
      if( wager >= 0){
         if( wager > balance)
            System.out.println("Your do not have enough money!");
         else{
            System.out.println( chatter());
            play(); //play a game
            
            if(balance <= 0)
               System.out.println("Sorry you busted!");
         } //end else
         
         //reset wager
         wager = 0;
         System.out.println();
      
      } while ( wager != -1 && wager > 0);
      // terminate if the user quits or runs out of money
   
   // plays one game of craps
   public static void play()
   {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int sumOfDice = rollDice(); // first roll of the dice

      // determine game status and point based on first roll 
      switch (sumOfDice) 
      {
         case SEVEN: // win with 7 on first roll
         case YO_LEVEN: // win with 11 on first roll           
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll
         case BOX_CARS: // lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
         default: // did not win or lose, so remember point         
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point
            System.out.printf("Point is %d%n", myPoint);
            break; 
      } 

      // while game is not complete
      while (gameStatus == Status.CONTINUE) // not WON or LOST
      { 
         sumOfDice = rollDice(); // roll dice again

         // determine game status
         if (sumOfDice == myPoint) // win by making point
            gameStatus = Status.WON;
         else 
            if (sumOfDice == SEVEN) // lose by rolling 7 before point
               gameStatus = Status.LOST;
      } // end while 

      // display won or lost message and change the balance
      if (gameStatus == Status.WON)
      {
         System.out.println("Player wins");
         balance += wager;
         //update bank balance
      } 
      else
      {
         System.out.println("Player loses");
         balance -= wager;
         //update bank balance
      } 
   } 

   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n", 
         die1, die2, sum);

      return sum;
   } 

   // randomly chooses a phrase to respond to the player's action
   public static String chatter()
   {
      switch ( randomNumbers.nextInt(5) ){
         case 0:
            return "Oh, you're going for broke huh?";
         case 1:
            return "Aw cmon, take a chance!";
         case 2:
            return "You're up big. Now's the time to cash in your chips!";
         case 3:
            return "You're way too lucky! I think you're a cheat!!!";
         default:
            return: "I'm betting all my money on you.";
      }// end switch
   }// end method chatter
} // end class Craps
