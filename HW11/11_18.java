// Exercise 11.18 Solution: Demo2.java
// Catching Exception exception.
import java.io.IOException;

public class Demo2 
{
   // execute application
   public static void main(String[] args)
   {
      try 
      { 
         // throw Exception A
        throw new ExceptionA();
      }
      
      catch (Exception exception) 
      {
         // print stack trace
          //System.out.println( exception.toString() );
          exception.printStackTrace();
      }

      try 
      {
         // throw Exception B
          throw new ExceptionB();
      }
      
      catch (Exception exception) 
      {
         // print stack trace
          //System.out.println( exception.toString() );
          exception.printStackTrace();
      } 

      try 
      {
         // throw null pointer exception
          throw new NullPointerException();
      }
      
      catch (Exception exception)
      {
         //print stack trace
          //System.out.println( exception.toString() );
          exception.printStackTrace();
      }
      
      try 
      {
         // throw IO Exception
          throw new IOException();
      }
      
      catch (Exception exception)
      {
         // print stack trace
          //System.out.println( exception.toString() );
          exception.printStackTrace();
      } 
   } 
} // end class Demo2

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
