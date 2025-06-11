package Demo;
import java.util.*;

public class GradeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter is a Character:");
		
		char ch=s.next().toUpperCase().charAt(0);
		
		switch(ch){
		
		case 'A':
			System.out.println("Excellent");
		break;
		case 'B':
			System.out.println("Good");
		break;
		case 'C':
			System.out.println("Average");
		break;
		case 'D':
			System.out.println("Below Average");
		case 'E':
			System.out.println("Fail");
		break;
		default:
		{
			System.out.println("Invalid Character");
		}

	}
	}
	
}
