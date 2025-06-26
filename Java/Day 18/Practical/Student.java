package Day18;

public class Student {

	String name;
	int marks1,marks2,marks3;
	
	Student(String name,int marks1,int marks2,int marks3){
		
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	void display() {
		
		int total=marks1+marks2+marks3;
		double per=total/3;
		
		System.out.println("Student Name:"+name);
		System.out.println("Percentage:"+per);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud=new Student("Vikas mali",98,92,89);
		
		stud.display();
		
		

	}

}
