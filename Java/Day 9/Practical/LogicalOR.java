package Demo;
import java.util.*;
public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int age=s.nextInt();
		
		if(age >= 60 || age <= 12) {
			System.out.println("Person is either a senior citizen or child.");
		}
		else {
			System.out.println("Persob is an adult.");
		}
	}

}
