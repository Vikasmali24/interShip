package Demo;
import java.util.*;
public class IntRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Length:");
		int length=s.nextInt();
		System.out.println("Enter your Breadth:");
		int breadth=s.nextInt();
		
		int area=length*breadth;
		System.out.println("Area:-"+area);

	}

}
