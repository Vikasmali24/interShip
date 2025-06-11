package Demo;
import java.util.*;
public class Trafficinstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Traffic Color name(Red,Yellow,Green");
		
		String color=s.nextLine();
		
		switch(color){
			
		case "red":
			System.out.println("Stop");
		break;
		case "yellow":
			System.out.println("Ready");
		break;
		case "green":
			
			System.out.println("Go");
		break;
		default:
			System.out.println("Invalid color");
		}
	}

}
