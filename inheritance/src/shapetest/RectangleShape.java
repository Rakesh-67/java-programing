package shapetest;

public class RectangleShape {
 private double length;
 private double width;
 
  public RectangleShape(double length,double width) {
	  this.length = length;
	  this.width = width;
  }
  public double getarea() {
	  return length*width;
  }
}
