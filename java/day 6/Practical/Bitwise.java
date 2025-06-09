package Demo;
import java.util.*;
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two Number:");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Bitwise AND(&):"+(a & b));
		System.out.println("Bitwise OR(|):"+(a | b));
		System.out.println("Bitwise XOR(^):"+(a ^ b));
	}

}
