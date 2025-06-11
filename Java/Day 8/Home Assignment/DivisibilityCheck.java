package Demo;
import java.util.*;
public class DivisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number =s.nextInt();
		
		if(number % 5 == 0 && number % 11 == 0) {
			System.out.println(number+"is divisible by both 5 and 11")
		}
		else {
			System.out.println(number+"is not divisible by both 5 and 11");
		}
	}

}
