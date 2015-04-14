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
  
  public int getArea()
  {
    return (int)( Math.PI * super.getDimension1() * super.getDimension2() );
  }

}
