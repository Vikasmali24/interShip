package Demo;

class Product {
	
	String name;
	double price;
	int quantity;
	
	void displayDetails() {
		System.out.println("Product Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
	}
}
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new Product();
		p1.name = "Pen";
		p1.price = 10.5;
		p1.quantity = 100;
		
		Product p2=new Product();
		p2.name = "NoteBook";
		p2.price = 45.5;
		p2.quantity = 50;

		Product p3=new Product();
		p3.name = "Backpack";
		p3.price = 999.5;
		p3.quantity = 20;

		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		
	}

}
