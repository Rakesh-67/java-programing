package shapetest;

public class CircleShape {
  private static final double PI = 0;
  private double redius;
   
  public CircleShape(double redius) {
	  this.redius = redius;
  }
  public double getarea() {
	  return PI*redius*redius;
  }
}
