package Demo;
import java.util.*;
public class RelationOperators {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number:");
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b)
		{
			System.out.println("First number is greater");
		}
		else if(a<b)
		{
			System.out.println("Second number is greater");
		}
		else {
			System.out.println("Equal to");
		}
	}

}
