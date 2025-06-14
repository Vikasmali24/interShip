package Demo;

class User {
	String username;
	String email;
	
	User(String username, String email){
		this.username=username;
		this.email=email;
				
	}
}

class Admin extends User {
	
	int adminLevel;
	
	Admin(String username, String email, int adminLevel){
		super(username, email);
		this.adminLevel=adminLevel;
	}
	
	void displayDetalis() {
		System.out.println("Username:"+username);
		System.out.println("Email:"+email);
		System.out.println("Admin Level:"+adminLevel);
	}
}
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admin a=new Admin("Vikasmali24","Vikasmali2409@gmail.com",5);
		
		a.displayDetalis();
	}

}
