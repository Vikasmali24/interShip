package Demo;

public class Pen {

	String brand;
	String color;
	
	Pen(String brand, String color){
		
		this.brand=brand;
		this.color=color;
	}
	
	void display() {
		System.out.println("Brand:"+brand);
		System.out.println("Color:"+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p=new Pen("Parker","Red");
		
		p.display();
		

	}

}
