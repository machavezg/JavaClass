// Exercise 9.8 Parallelogram.java
// Class Parallelogram definition

// Parallelogram inherits Trapezoid classes
public class Parallelogram extends Trapezoid {
    
    // Create a new instance of Parallelogram
    public Parallelogram( Point s1, Point s2, Point s3, Point s4 )  
    {
        super(s1, s2, s3, s4);
    }
    
    // Using superclasses getLengthA() to return the width
    public double getWidth()
    {
       return  getLengthB();
    }
    
    // Area of a parallelogram is base*height
    @Override
    public double getArea()
    {
        return (getWidth() * getHeight());
    }
    
    @Override
    public String toString()
    {
        return ("\nCoordinates of Parallelogram are: \n"+
                getPoint1() +"," + getPoint2() +"," + getPoint3() + "," + getPoint4() +
                "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() +"\nArea is: " + getArea())+"\n";
    }
    
}
