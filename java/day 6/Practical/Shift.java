package Demo;
import java.util.*;
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer:");
		int num=s.nextInt();
		
		System.out.println("Original Number:");
		
		System.out.println("Left Shift(num << 2):"+(num<<2));
		System.out.println("Right Shift(num >> 2):"+(num>>2));
		System.out.println("Unsigned Right Shift(num >>> 2):"+(num >>> 2));
		

	}

}
