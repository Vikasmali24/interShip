package Demo;

class Movie {
	
	String title;
	String director;
	int releaseYear;
	
	Movie(String title, String director, int releaseYear){
		this.title=title;
		this.director=director;
		this.releaseYear=releaseYear;
	}
	
	void displayDetalis() {
		System.out.println("Title:"+title);
		System.out.println("Director:"+director);
		System.out.println("Release Year:"+ releaseYear);
	}
}
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1=new Movie("Inception","Christopher Nolan",2010);
		Movie m2=new Movie("Parasite","Bong Joon-ho",2019);
		
		m1.displayDetalis();
		System.out.println("-------------------------");
		m2.displayDetalis();
	}

}
