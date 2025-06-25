package Day17;

public class NullCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=null;
		
		if(name != null){
			
			System.out.println(name.toLowerCase());
			
		}else {
			
			System.out.println("String is null. Cannot call methods on it.");
		}
		

	}

}
