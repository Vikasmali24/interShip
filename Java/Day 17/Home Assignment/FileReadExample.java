package Day17Home;
import java.io.*;

public class FileReadExample {

	    public static void main(String[] args) {
	    	
	        File file = new File("nonexistent.txt");

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	        } catch (IOException e) {
	            System.out.println("Error: File not found or could not be read.");
	        }
	    }

}
