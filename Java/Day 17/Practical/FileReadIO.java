package Day17;
import java.io.*;
public class FileReadIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			 
			FileReader file =new FileReader("file.txt");
			
			BufferedReader reader= new BufferedReader(file);
			
			System.out.println(reader.readLine());
		}catch(IOException e) {
			
			System.out.println("Error: file not found or cannot be read.");
		}
	}

}
