package Day19;

public class Person {

	String name;
	int age;
	
	Person(){
	
		name="Unknown";
		age=0;

	}
	
	void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] ardgs) {
		// TODO Auto-generated method stub

		Person p= new Person();
		p.display();
	}

}
