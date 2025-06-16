package Demo;

class Laptop{

	String brand;
	String processor;
	int ramSize;
	
	void displayDetails( ) {
		
		System.out.println("Brand:"+brand);
		System.out.println("Processor:"+processor);
		System.out.println("RAM Size:"+ ramSize +"GB");
	}
}
public class LaptopMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop myLatop = new Laptop();
		myLatop.brand ="Dell";
		myLatop.processor="Intel i5";
		myLatop.ramSize= 16;
		
		myLatop.displayDetails();
		
	}

}
