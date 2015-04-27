// Exercise 6.36: ComputerAssistedInstructionTest.java
// Test application for class Multiply
import java.util.Scanner;

public class ComputerAssistedInstructionTest
{
   public static void main(String[] args)
   {
      ComputerAssistedInstruction application = new ComputerAssistedInstruction();
      Scanner input = new Scanner(System.in);

      int guess; // the user's guess

      application.createQuestion(); // display the first question

      System.out.print("Enter your answer (-1 to exit): ");
      guess = input.nextInt();

      while (guess != -1)
      {
         application.checkResponse(guess);
         
         System.out.print("Enter your answer (-1 to exit): ");
         guess = input.nextInt();
      } // end while
   } // end main   
} // end class ComputerAssistedInstructionTest


