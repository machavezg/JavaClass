// Exercise 11.21 Solution: Demo5.java
// Catching exceptions in other scopes.

public class Demo5
{
    public static void main(String[] args) {
        try { // call method someMethod
            someMethod();
        } 
        catch (ExceptionB exception) {
            System.err.println( "Handled in: " + exception + "\n");
            exception.printStackTrace();
        }
        catch (Exception exception) {
        }
    }
// call method someMethod2
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        }
        catch (ExceptionA exception) { // only catches ExceptionA
            throw exception;
        } 
    } 
// throw Exception
    public static void someMethod2() throws Exception {
        throw new ExceptionB();
    }
} 

// subclasses of Exception
class ExceptionA extends Exception {
// empty class body
}

class ExceptionB extends Exception {
// empty class body
}
