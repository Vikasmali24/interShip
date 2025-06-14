package Demo;
import java.util.*;
public class Studentdetalis {
	
	
	String name;
	int age;
	
	Studentdetalis(String name, int age){
		
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		
		System.out.println("Student Name:"+name);
		System.out.println("Student Age:"+age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentdetails s1=new Studentdetails("vikas",19);
		
		s1=display();
	
	}
}
