// Exercise 9.8 Square.java
// Class Square definition

// Square inherits Rectangle classes
public class Square extends Rectangle{
    
    // Creates a new instance of Square
    public Square( Point s1, Point s2, Point s3, Point s4  )  
    {
         super(s1, s2, s3, s4);
    }
    
    // Using the width function to return a side 
    public double getSide()
    {
        return getWidth();
    }
    
    // Area of a rectangle is side*side
    @Override
    public String toString()
    {
        return ("\nCoordinates of Square are:\n "+
                getPoint1() +"," + getPoint2() +"," + getPoint3() + "," + getPoint4() +
                "\nSide is: " + getSide()  + "\nArea is: " + getArea())+"\n";
    }
}
