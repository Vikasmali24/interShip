package Demo;
import java.util.*;

public class ExpressionEvaluaation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Integer value:");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		
		int result=(a+b)*(c-d)/e;

		System.out.println("Expression Evaluation Result:"+result);
	}

}
