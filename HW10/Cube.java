// Cube.java

public class Cube extends ThreeDimensionalShape {
  
  public Cube (int x, int y, int side ) 
  {
    super ( x, y, side, side, side );
  }
  
  public String getName() 
  {
    return "Cube";
  }
  
  public int area()
  {
    return (int)( 6 * super.getDimension1() * super.getDimension1() );
  }
  
  public int volume()
  {
    return (int)( super.getDimension1() * super.getDimension1() * super.getDimension1() );
  }
  
  public void print()
  {
    System.out.println( "(" + super.getX() + ", " + super.getY() + ") " + "side: " + super.getDimension1() );
  }
  
  public void setSide( int side )
  {
    super.setDimension1( side );
  }
  
  public int getSide()
  {
    return super.getDimension1();
  }
}
