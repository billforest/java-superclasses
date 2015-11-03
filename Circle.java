// Circle.java
// Superclass

public class Circle {
  
  // Instance Variables
  private double radius;
  
  // Constructor
  public Cicle() {
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
    public double findArea ( double rd ) {
    return Math.PI*Math.Pow( rd, 2 );
  }
   
   
  
  
} // end Circle class