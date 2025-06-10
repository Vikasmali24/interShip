package Demo;
import java.util.*;

public class SquareCube {
	public static void main(String arg[])
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=s.nextInt();
		int square=num*num;
		int cube=num*num*num;
		
		System.out.println("Square the Number:"+square);
		System.out.println("Cube the Number:"+cube);
	}

}
