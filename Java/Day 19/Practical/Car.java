package Day19;

public class Car {
	
	String model;
	int year;
	
	Car(String model, int year){
		
		this.model=model;
		this.year=year;
	}
	
	Car(Car c){
		
		this.model=c.model;
		this.year=c.year;
	}

	void display() {
		
		System.out.println("Car Model:"+model);
		System.out.println("Car year:"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car("Toyota",2020);
		Car c2=new Car(c1);
		
		c1.display();
		c2.display();
		
	}

}
