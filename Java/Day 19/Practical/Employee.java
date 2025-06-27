package Day19;

public class Employee {
	
	String name;
	int id;
	
	Employee(String name, int id){
		
		this.name=name;
		this.id=id;
	}
	
	Employee(Employee e){
		
		this.name=e.name;
		this.id=e.id;
	}
	
	void display() {
		
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee("Rohit Bhoye",101);
		Employee e2=new Employee(e1);
		
		e1.display();
		e2.display();
				
	}

}
