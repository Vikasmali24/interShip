package Demo;
import java.util.*;
 class Aa{

	String name;
	int age;
}

class Employee extends Aa{
	
	double salary;
	
	void setDetails(String name, int age, double salary) {
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	void displayDetalis() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee Salary:"+salary);
	}
	
	}
	public class Person{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e= new Employee();
		
		e.setDetails("Vikas",19,23000.4);
		e.displayDetalis();
		
	}

}
