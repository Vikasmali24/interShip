package Demo;
import java.util.*;	

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter is a Character:");
		
		char ch=s.next().toLowerCase().charAt(0);
		
		switch(ch){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
		System.out.println(ch +"is a Vowel");
		break;
		default:
		if(Character.isLetter(ch)) {
			System.out.println(ch+"is a Consonant");
		}
	}
	
}

}
