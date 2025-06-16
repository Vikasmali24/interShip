package Demo;

class Teacher {
	
	String name;
	String subject;
	
	Teacher(String name,String subject){
		
		this.name=name;
		this.subject=subject;
	}
	
}

class MathTeacher extends Teacher {
	
	int experienceYears;
	
	MathTeacher (String name,String subject, int experienceYears){
		super(name,subject);
		this.experienceYears=experienceYears;
	}
	
	void display() {
			
			System.out.println("Teacher Name:"+name);
			System.out.println("Teacher Subject:"+subject);
			System.out.println("Experience Years:"+experienceYears);
			
	}
	
}
public class TeacherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathTeacher m=new MathTeacher("Shinde sir","JAVA",5);
		
		m.display();
	}

}
