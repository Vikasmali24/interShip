package Day18;

public class Counter {

	static int count = 9;

	Counter(){
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		
		System.out.println("Objects created:"+Counter.count);
		
	}

}
