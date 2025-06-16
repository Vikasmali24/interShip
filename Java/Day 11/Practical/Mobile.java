package Demo;

public class Mobile {

	
	String modelName;
	float price;
	
	Mobile(String modelName, float price){
		
		this.modelName=modelName;
		this.price=price;
	}
	
	void display() {
		System.out.println("Model Name:"+modelName);
		System.out.println("Mobile price:"+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1=new Mobile("iphone 13",58999);
		Mobile m2=new Mobile("iphone 15",85999);
		
		m1.display();
		m2.display();

	}

}
