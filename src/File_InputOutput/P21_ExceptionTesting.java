package File_InputOutput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P21_ExceptionTesting {

	public static void main(String[] args) {
		
		FileInputStream input = null;
		Scanner userInput = new Scanner(System.in);
		
		try {
			System.out.println("Enter the file name to open: ");
			String fileName = userInput.nextLine();
			input = new FileInputStream(fileName);
			
			int i; char c;
			while((i = input.read())!=-1) {
				c = (char)i;
				System.out.print(c);
			}
		}
		catch(FileNotFoundException e) {			
			System.out.println("File not found.");
			System.out.println("Try again.");
			main(null);
		}
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}

		finally{
			userInput.close();
			if(input != null) {
				try {
					input.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
