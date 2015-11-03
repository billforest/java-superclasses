// Bicycle.java
// Superclass

public class Bicycle {
 
  // Instance Variables
  private int gear;
  private int numGears;
  private double speed;
  
  // Constructor (#1 = empty; #2 = with parameters)
  public Bicycle() {
    gear = 1;
    numGears = 18;
    speed = 0;
  }
  public Bicycle( int gr, int numG, double sp ) {
    gear = gr;
    numGears = numG;
    speed = sp;
  }
  
  // Methods (#1 = setter; #2 = getter; #3 = other)
  public void setGear( int g ) {
    gear = g;
  }
  public void setNumGears( int n ) {
    numGears = n;
  }
  public void setSpeed( int s ) {
    speed = s;
  }
  
  public int getGear() {
    return gear;
  }
  public int getNumGears() {
    return numGears;
  }
  public double getSpeed() {
    return speed;
  }
  
  public void slowDown( double sp ) {
    speed -= sp;
  }
  public void speedUp( double sp ) {
    speed += sp;
  }
  
} // end Bicycle class