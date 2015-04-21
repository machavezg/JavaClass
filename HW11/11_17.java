// Exercise 11.17 Solution: Demo2.java
// Catching Exception Superclass

public class Main 
{
   // execute application
   public static void main(String[] args)
   {
      try 
      { 
         // throw Exception C
        throw new ExceptionC();
      }
      
      catch (ExceptionA exception) 
      {
         // print stack trace & error
          System.err.println( "First Exception: " + exception.toString() );
          exception.printStackTrace();
      }

      try 
      {
         // throw Exception B
          throw new ExceptionB();
      }
      
      catch (ExceptionA exception) 
      {
         // print stack trace & error
          System.err.println( " Second Exception: " + exception.toString() );
          exception.printStackTrace();
      } 
   } 
} // end class

// subclass of Exception
class ExceptionA extends Exception
{
   // empty class body
} 

// subclass of ExceptionA
class ExceptionB extends ExceptionA
{
   // empty class body
}

// subclass of ExceptionB
class ExceptionC extends ExceptionB
{
   // empty class body
}
