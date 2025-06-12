package Demo;
import java.util.*;
public class CharToASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character:");
		
		char ch=s.next().charAt(0);
		
		int ascii = (int) ch;
		System.out.println("ASCII value of"+ch+ "=" +ascii);
	}

}
