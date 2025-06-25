package Day17;

public class ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {10,25,34,56,34};
		
		try {
			
			for(int i=0; i<=numbers.length; i++) {
				
				System.out.println("Element At index:"+i+":"+numbers[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error: Tried to access an invalid array index");
		}

	}

}
