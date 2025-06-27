package Day19;

public class Student {

	
	String name;
	int id;
	int marks;
	
	Student(String name, int id, int marks){
		
		this.name=name;
		this.id=id;
		this.marks=marks;
		
	}
	
	void display() {
		
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:"+id);
		System.out.println("Student Marks:"+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student("Vikas mali",101,89);
		s.display();
	}

}
