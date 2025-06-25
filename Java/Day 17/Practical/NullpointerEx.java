package Day17;

public class NullpointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = null;

		try {
			
			System.out.println(message.toUpperCase());
		}catch(NullPointerException e) {
			
			System.out.println("Error: Tried to call a method on a null object.");
		}
	}

}
