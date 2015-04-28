// Exercise 9.8 Quadrilateral.java
// Class Quadrilateral definition

public class Quadrilateral 
{
   private final Point point1; // first endpoint
   private final Point point2; // second endpoint
   private final Point point3; // third endpoint
   private final Point point4; // fourth endpoint

   // four-argument constructor
   public Quadrilateral( Point first, Point second, Point third, Point fourth )
   {
      point1 = first;
      point2 = second;
      point3 = third;
      point4 = fourth;
   } // end eight-argument Quadrilateral constructor

   // return point1
   public Point getPoint1()
   {
      return point1;
   } // end method getPoint1

   // return point2
   public Point getPoint2()
   {
      return point2;
   } // end method getPoint2

   // return point3
   public Point getPoint3()
   {
      return point3;
   } // end method getPoint3

   // return point4
   public Point getPoint4()
   {
      return point4;
   } // end method getPoint4

   // return string representation of a Quadrilateral object
   @Override
   public String toString()
   {
      return String.format( "%s:\n%s", 
         "Coordinates of Quadrilateral are", getCoordinatesAsString() ); 
   } // end method toString

   // return string containing coordinates as strings
   public String getCoordinatesAsString()
   {
      return String.format(  
         "%s, %s, %s, %s\n", point1, point2, point3, point4 );
   } // end method getCoordinatesAsString
} // end class Quadrilateral

