// Exercise 6.36 ComputerAssistedInstruction.java
// Program generates single-digit arithmatic problems
import java.util.Random;

public class ComputerAssistedInstruction
{
    Random randomNumbers = new Random();
   // Declare variables
    int answer;
    String operation = "";
   // create question and stores the corresponding correct answer
   public void createQuestion()
   {
      // get two random numbers between 0 and 9
      int digit1 = randomNumbers.nextInt(10);
      int digit2 = randomNumbers.nextInt(10);
      // get random number between 0 and 3 to get arithmatic operator (-,+,*,/)
      int operator = randomNumbers.nextInt(4);
      //use switch statement to create question and compute answer
      switch (operator) 
      {
          case 0:
              if(digit1 < digit2)
              {
                  int temp = digit1;
                  digit1 = digit2;
                  digit2 = temp;
              }
              operation = "minus";
              answer = digit1 - digit2;
              break;
          case 1:
              operation = "plus";
              answer = digit1 + digit2;
              break;
          case 2:
              operation = "times";
              answer = digit1 * digit2;
              break;
          case 3:
              if(digit2 == 0)
                  digit2 = 1;
              operation = "divided by";
              answer = digit1 / digit2;
              break;
              
      }
      //ouput question to the user
      System.out.printf("How much is %d %s %d?\n", digit1, operation, digit2);
    } // end method createQuestion
   
   // checks if the user answered correctly
   public void checkResponse(int guess)
   {
       if ( guess != answer )
           System.out.println( createResponse( false ) );
       else
       {
           System.out.println( createResponse( true ) );
           createQuestion();
       }
   } // end method checkResponse   

   // create a new response
   public String createResponse(boolean correct)
   {
       if ( correct )
           switch ( randomNumbers.nextInt( 4 ) )
           {
               case 0:
                   return( "Very Good!" );

               case 1:
                   return( "Excellent!" );
                   
               case 2:
                   return( "Nice work!" );
                   
               case 3: 
                   return( "Keep up the good work!" );
           } // end switch

// otherwise, assume incorrect
       switch ( randomNumbers.nextInt( 4 ) )
       {
           case 0:
               return( "No. Please try again." );
           
           case 1:
               return( "Wrong. Try once more." );

           case 2:
               return( "Don't give up!" );

           case 3: default:
               return( "No. Keep trying." );
       }
   } // end method createResponse
} // end class ComputerAssistedInstruction
