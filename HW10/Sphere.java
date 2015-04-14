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
  
  public int getArea()
  {
    return (int)( 4 * Math.PI * super.getDimension1() * super.getDimension2() );
  }
  
  public int getVolume()
  {
    return (int)( ( 4 * Math.PI * super.getDimension1() * super.getDimension2() * super.getDimension3() ) / 3 );
  }
  
}
