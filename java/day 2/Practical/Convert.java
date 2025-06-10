package Demo;
import java.util.*;
public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a float value:");
		float floatvalue=s.nextFloat();
		
		int intvalue=(int) floatvalue;
		
		System.out.println("Float value:"+floatvalue);
		System.out.println("Converted int value:"+intvalue);

	}

}
