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
  
  public int getArea()
  {
    return (int)( 6 * super.getDimension1() * super.getDimension2() );
  }
  
  public int getVolume()
  {
    return (int)( super.getDimension1() * super.getDimension2() * super.getDimension3() );
  }
  
}
