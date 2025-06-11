package Demo;
import java.util.*;
public class CurrencySymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter currency code (INR, USD, EUR, GBP):");
		String currency=s.next().toUpperCase();
		
		switch(currency) {
		
		case "INR":
			System.out.println("Currency Symbol: ₹");
		break;
		case "USD":
			System.out.println("Currency Symbol: $");
		break;
		case "EUR":
			System.out.println("Currency Symbol: €");
		break;
		case "GBP":
			System.out.println("Currency Symbol: £");
		break;
		default:
			System.out.println("Invalid Invalid code");
		
		}
	}

}
