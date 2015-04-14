// Sphere.java

public class Sphere extends ThreeDimensionalShape {
  
  public Sphere (int x, int y, int radius ) 
  {
    super ( x, y, radius, radius, radius );
  }
  
  public String getName() 
  {
    return "Sphere";
  }
  
  public int area()
  {
    return (int)( 4* Math.PI * super.getDimension1() * super.getDimension1() );
  }
  
  public int volume()
  {
    return (int)( 4 / 3 * Math.PI * super.getDimension1() * super.getDimension1() * super.getDimension1() );
  }
  
  public void print()
  {
    System.out.println( "(" + super.getX() + ", " + super.getY() + ") " + "radius: " + super.getDimension1() );
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
