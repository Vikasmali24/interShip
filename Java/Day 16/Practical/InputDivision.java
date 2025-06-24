package Demo;
import java.util.*;
public class InputDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		try {
			System.out.println("Enter first number:");
			int a=s.nextInt();
			
			System.out.println("Enter Second number:");
			int b=s.nextInt();
			
			int result =a/b;
			System.out.println("Result:"+result);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: Cannot divide by zero");
		}catch(Exception e) {
			System.out.println("Invalid input");
		}
	}

}
