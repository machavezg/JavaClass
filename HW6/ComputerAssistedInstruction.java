// Exercise 6.36 ComputerAssistedInstruction.java
// Program generates single-digit arithmatic problems
import java.util.Random;

public class ComputerAssistedInstruction
{
   // Declare variables
         
   // create question and stores the corresponding correct answer
   public void createQuestion()
   {
      // get two random numbers between 0 and 9
      int digit1 = randomNumbers.nextInt(10);
      int digit2 = randomNumbers.nextInt(10);
      // get random number between 0 and 3 to get arithmatic operator (-,+,*,/)
      int operator = randomNumbers.nextInt(4);
      //use switch statement to create question and compute answer
      
      //ouput question to the user

    } // end method createQuestion
   
   // checks if the user answered correctly
   public void checkResponse(int guess)
   {
            
   } // end method checkResponse   

   // create a new response
   public String createResponse(boolean correct)
   {
      
         
   } // end method createResponse
} // end class ComputerAssistedInstruction


