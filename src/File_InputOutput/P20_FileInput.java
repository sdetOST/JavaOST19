package File_InputOutput;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P20_FileInput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputStream = new FileInputStream("readme.txt");	// open file input stream
		
		int i;
		char c;
		
		while((i=inputStream.read()) !=-1) {					// read input from file
			c = (char)i;
			System.out.print(c);			
		}
		inputStream.close();									// close
System.out.println("\r-------------------------------------------------------");    

		FileInputStream inputStream2 = new FileInputStream("readme.txt");    // input stream with scanner
		Scanner fileScanner2 = new Scanner(inputStream2);
		
		while(fileScanner2.hasNextLine()) {			
			System.out.println(fileScanner2.nextLine());
			
		}
		fileScanner2.close();
		inputStream2.close();
System.out.println("-------------------------------------------------------"); 
	
		FileInputStream inputStream3 = new FileInputStream("readme.txt");    // input stream with scanner
		Scanner fileScanner3 = new Scanner(inputStream3);

		while(fileScanner3.hasNext()) {							// used "hasNext" instead of "hasNextLine"
			System.out.println(fileScanner3.next());		// ...next() instead of ...nextLine())
	
		}
		fileScanner3.close();
		inputStream3.close();
System.out.println("-------------------------------------------------------");

	}
}
