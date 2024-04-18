package shapetest;

public class TestS {

	public static void main(String[] args) {
		RectangleShape rectangle = new RectangleShape(5,8);
        CircleShape circle = new CircleShape(4);
        
        System.out.println("area of rectangle:"+ rectangle.getarea());
        System.out.println("area of circle:"+ circle.getarea());
	}

}
