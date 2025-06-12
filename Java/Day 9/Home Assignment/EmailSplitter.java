package Demo;
import java.util.*;
public class EmailSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email address:");
		
		String email=s.nextLine();
		
		String[] parts= email.split("@");
		if(parts.length == 2) {
			System.out.println("Username:"+parts[0]);
			System.out.println("Domain:"+parts[1]);		
		}
		else {
			System.out.println("Invalid email address");
		}
	}

}
