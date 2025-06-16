package Demo;
import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		float length=s.nextFloat();
		System.out.println("Enter breadth:");
		float breadth=s.nextFloat();
	
		double area=length*breadth;
		System.out.println("Rectangle Area:"+area);
				
	}

}
