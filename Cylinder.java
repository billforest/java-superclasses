// Cylinder.java
// Subclass of Circle.java

public class Cylinder extends Circle {
 
  // Instance Variables
  private double height;
  
  // Constructor
  public Cylinder() {
    super();
    height = 5;
  }
  public Cylinder( double r, int h ) {
    super(r);
       height = h;
  }
  // Methods
  public double findVolume () {
    return super.findArea() * height;
  }
  public double findVolume( double r, double h ) {
      return super.findArea(r) * h;  
  }

} // end Cylinder class