package shapes;
import shapes.Circle;

public class MainShape {
	
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area of circle: " + c.calculateArea());
    }


}
