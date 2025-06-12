package Demo;

public class FactorialInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			int factorial =1;
			for(int j=1; j<=i;j++) {
				factorial *=j;
			}
			System.out.println("Factorial of "+i+"="+factorial);
		}
	}

}
