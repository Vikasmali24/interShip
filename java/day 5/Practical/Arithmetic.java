package Demo;

import java.util.*;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your Tow Number:");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a + b;
		int diff = a - b;
		int prod = a * b;
		int div = a / b;
		int mod = a % b;

		System.out.println("Add:" + sum);
		System.out.println("Sub:" + diff);
		System.out.println("Muly:" + prod);
		System.out.println("Div:" + div);
		System.out.println("Mod:" + mod);
	}

}
