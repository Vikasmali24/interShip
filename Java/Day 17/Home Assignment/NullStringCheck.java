package Day17Home;

public class NullStringCheck {
	
	 public static void main(String[] args) {
	       String text = null;

	        if (text != null) {
	            System.out.println("String length: " + text.length());
	        } else {
	            System.out.println("The string is null. Cannot call methods on it.");
	        }
	    }

}
