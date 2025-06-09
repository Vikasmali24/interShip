package Demo;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Today's Temperature in: ");
		float temp=s.nextFloat();
		
		if(temp>35)
		{
			System.out.println("Hot Day");
		}
		else {
			System.out.println("Normal Day");
		}
	}

}
