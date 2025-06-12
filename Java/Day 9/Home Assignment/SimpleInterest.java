package Demo;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principal (P):");
		float P=s.nextFloat();
		System.out.println("Enter Rate (R):");
		float R=s.nextFloat();
		System.out.println("Enter Time (T):");
		float T=s.nextFloat();
		
		float SI=(P*R*T)/100;
		System.out.println("Simple Interest="+SI);
	}

}
