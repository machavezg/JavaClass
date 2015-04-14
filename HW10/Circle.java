// Circle.java

public class Circle extends TwoDimensionalShape {
  
  public Circle (int x, int y, int radius ) 
  {
    super ( x, y, radius, radius );
  }
  
  public String getName() 
  {
    return "Circle";
  }
  
  public void print()
  {
    System.out.println( "(" + super.getX() + ", " + super.getY() + ") " + "radius: " + super.getDimension1() );
  }
  
  public int area()
  {
    return (int)( Math.PI * super.getDimension1() * super.getDimension1() );
  }
  
  public void setRadius( int radius )
  {
    super.setDimension1( radius );
  }
  
  public int getRadius()
  {
    return super.getDimension1();
  }
}
