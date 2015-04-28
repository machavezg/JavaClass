// Exercise 9.8 Rectangle.java
// Class Point definition

// Rectangle inherits Parallelogram classes
public class Rectangle extends Parallelogram{
    
    /// Creates a new instance of Rectangle
    public Rectangle( Point s1, Point s2, Point s3, Point s4 ) 
    {
         super(s1, s2, s3, s4);
    }
    
    // Area of a rectangle is width*height
    @Override
    public double getArea()
    {
        return (getWidth() * getHeight());
    }
    
    @Override
    public String toString()
    {
        return ("\nCoordinates of Rectangle are: \n"+
                getPoint1() +"," + getPoint2() +"," + getPoint3() + "," + getPoint4() +
                "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() + "\nArea is: " + getArea())+"\n";
    }
    
    
}
