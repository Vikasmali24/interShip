package Day17;

import java.io.*;
public class ReadMissiingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
			
			String line=reader.readLine();
			
			System.out.println("File content:"+line);
		}catch(IOException e) {
		
			System.out.println("IOException occurred:"+e.getMessage());
		}

	}

}
