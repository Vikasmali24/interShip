package Demo;
import java.util.*;
public class Book {
	
	String title;
	String author;
	
	Book(String title, String author){
		
		this.title=title;
		this.author=author;
	}
	
	void display() {
		
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Book b1=new Book("Java Programming","James Gosling");
	Book b2=new Book("Effective Java","Joshua Bloch");
	
	b1.display();
	b2.display();
	
		

	}

}
