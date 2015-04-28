// Exercise 9.8 Trapezoid.java
// Class Trapezoid definition

// Trapezoid inherits Quadrilateral classes
public class Trapezoid extends Quadrilateral {
    
    
    private double lengthA;
    private double lengthB;
    private double height;
    
    
    // Create a new instance of Trapezoid
    public Trapezoid( Point s1, Point s2, Point s3, Point s4 ) 
    {
         super(s1, s2, s3, s4);
    }
    
    // Returning the difference of Point1 y-coordinate and Point4 y-coordinate
    public double getHeight()
    {
      return (Math.abs(getPoint1().getY() - getPoint4().getY()));
    }
    
    public double getLengthA()
    {
         return (Math.abs(getPoint1().getX() - getPoint2().getX()));
    }
    
    public double getLengthB()
    {
        return (Math.abs(getPoint3().getX() - getPoint4().getX()));
    }
    
    // Area of a trapezoid is .5*height*(topLength+bottomLength)
    public double getArea()
    {
        lengthA =  getLengthA();
        lengthB = getLengthB();
        height = getHeight(); 
        
        return (.5 * height * (lengthA + lengthB));   
    }
    
    @Override
    public String toString()
    {
        return ("\nCoordinates of Trapezoid are:\n " +
                getPoint1() +"," + getPoint2() +"," + getPoint3() + "," + getPoint4() +
                "\nHeight is: " + getHeight() +"\nArea is: " + getArea())+"\n";
    }
    
}
