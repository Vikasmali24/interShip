package Demo;

class Shape {
	
	void printShape() {
		System.out.println("This is a shape");
	}
}

class Circle extends Shape {
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void calculateArea() {
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle:"+area);
	}
}

class Rectangle extends Shape {
	
	double length, width;
	
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	
	void calculateArea() {
		double area= length*width;
		System.out.println("Area of Rectangle:"+area);
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(5);
		c.printShape();
		c.calculateArea();
		
		System.out.println("----------------------");
		
		Rectangle r=new Rectangle(4,6);
		r.printShape();
		r.calculateArea();

	}

}
