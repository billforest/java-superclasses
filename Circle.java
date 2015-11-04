// Circle.java
// Superclass

public class Circle {
  
  // Instance Variables
  private double radius;
  
  // Constructor
  public Circle() {
    radius = 1.0;
  }
  public Circle ( double rd ) {
    radius = rd;
  }
  
  // Methods
   public void setRadius ( double rd ) {
    radius = rd;
  }
    public double getRadius() {
    return radius;
  }
    public double findArea () {
    return Math.PI * Math.pow( radius, 2 );
  }
    public double findArea( double rd ) {
      return Math.PI * Math.pow( rd, 2 );  
  }
   
   
  
  
} // end Circle class