package Demo;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=0;
		
		try {
			int result =a/b;
			
			System.out.println("Result:"+result);
		}catch(ArithmeticException e) {
			
			System.out.println("Caught ArithmeticException:"+e.getMessage());
		}finally {
			System.out.println("This block always executes (finally block).");
		}

	}

}
