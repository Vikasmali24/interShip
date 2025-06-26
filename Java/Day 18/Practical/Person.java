package Day18;

public class Person {

	String name;
	int age;
	String city;
	Person(String name){
		
		this.name=name;
	}
	
	Person(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	
	Person(String name,int age,String city){
		
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	void display() {
		
		System.out.println("Person Name:"+name);
		System.out.println("Person Age:"+age);
		System.out.println("Person City:"+city);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person("Vikas mali");
		Person p2=new Person("Omkar",19);
		Person p3=new Person("Sumit",20,"Nashik");
		
		p1.display();
		p2.display();
		p3.display();
		
	}

}
