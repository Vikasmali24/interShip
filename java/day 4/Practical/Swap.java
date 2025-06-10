package Demo;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=2;
		
		System.out.println("Before Swapping:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Atfer Swap:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);

	}

}
