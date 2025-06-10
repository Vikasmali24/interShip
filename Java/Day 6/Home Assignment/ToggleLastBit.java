package Demo;
import java.util.*;
public class ToggleLastBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer:");
		
		int number=s.nextInt();
		
		int toggledNumber= number ^ 1;
		
		System.out.println("Original number:"+number);
		System.out.println("Number after toggling last bit:"+toggledNumber);
		
	}

}
