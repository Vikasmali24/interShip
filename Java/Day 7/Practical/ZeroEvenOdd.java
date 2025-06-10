package Demo;
import java.util.*;

public class ZeroEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number=s.nextInt();
		
		if(number == 0)
		{
			System.out.println("Zero");
		}
		else if(number % 2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
