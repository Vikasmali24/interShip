package Demo;

public class EmployeeInforamtion {

			String name;
			int id;
			
			EmployeeInforamtion(String name, int id){
				
				this.name=name;
				this.id=id;
				
			}
			
			 void displayInfo(){
				
				 System.out.println("Employee Name:"+name);
				 System.out.println("Employee Id:"+id);
			}
			 
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				EmployeeInforamtion e= new EmployeeInforamtion("Vikas Mali",101);
				
				e.displayInfo();
			}

		}

