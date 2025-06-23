package Demo;
import java.util.*;
class Number extends Thread{

	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Number:"+i);
			
			try {
				
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			
		}
	}
	public static void main(String[] args) {
		
		Number thread =new Number();
		thread.start();
	}
}
