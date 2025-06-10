package Demo;
import java.util.*;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Marks:-");
		int marks=s.nextInt();
		
		if(marks>40 && marks<100)
		{
			System.out.println("Pass");
			
		}
		else if(marks >=0 && marks <=40)
		{
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalied Marks");
		}
	}

}
