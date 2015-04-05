// Exercise 9.8 QuadrilateralTest.java
// Driver for Exercise 9.8

public class QuadrilateralTest 
{
   public static void main( String args[] )
   {
      // NOTE: All coordinates are assumed to form the proper shapes
      // A quadrilateral is a four-sided polygon
      Quadrilateral quadrilateral = new Quadrilateral( new Point( 1.1, 1.2 ), 
         new Point( 6.6, 2.8 ), new Point( 6.2, 9.9 ), new Point( 2.2, 7.4 ) );

      // A trapezoid is a quadrilateral having exactly two parallel sides
      Trapezoid trapezoid = new Trapezoid( new Point( 0.0, 0.0 ), 
         new Point( 10.0, 0.0 ), new Point( 8.0, 5.0 ), new Point( 3.3, 5.0 ) );
      
      // A parallelogram is a quadrilateral with opposite sides parallel
      Parallelogram parallelogram = new Parallelogram( new Point( 5.0, 5.0 ), 
         new Point( 11.0, 5.0 ), new Point( 12.0, 20.0 ), new Point( 6.0, 20.0 ) );

      // A rectangle is an equiangular parallelogram
      Rectangle rectangle = new Rectangle( new Point( 17.0, 14.0 ), 
         new Point( 30.0, 14.0 ), new Point( 30.0, 28.0 ), new Point( 17.0, 28.0 ) );

      // A square is an equiangular and equilateral parallelogram
      Square square = new Square( new Point( 4.0, 0.0 ), 
         new Point( 8.0, 0.0 ), new Point( 8.0, 4.0 ), new Point( 4.0, 4.0 ) );

      System.out.printf( 
         "%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram, 
         rectangle, square );
   } // end main
} // end class QuadrilateralTest

