package Day18;

public class Employee {

		
		int id;
		String name;
		float salary;
		Employee(int id,String name,float salary){
			
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		
		void display() {
			
			System.out.println("Employee Id:"+id);
			System.out.println("Employee Name:"+name);
			System.out.println("Employee salary:"+salary);
		}
		
		
		public static void main(String arg[]) {
			
			Employee emp= new Employee(101,"vikas mali",15000);
			
			emp.display();
		}
		

}
