// MTB.java
// Subclass of Bicycle.java

public class MTB extends Bicycle {
 
  // Instance Variables
  private double tireWidth;
  private int seatHeight;
  // Constructor
  public MTB() {
    super();
    tireWidth = 3.0;
    seatHeight = 10;
  }
  public MTB( double tw, int sh ) {
    super();
    tireWidth = tw;
    seatHeight = sh;
  }
  public MTB( int g, int nG, double s, double tw, int sh) {
    super( g, nG, s);
    tireWidth = tw;
    seatHeight = sh;
  }
  // Methods
  public void setGear(int g) {
    super.setGear(g);
    System.out.println("Feeling rekt, aye?");
  }
  
} // end MTB class