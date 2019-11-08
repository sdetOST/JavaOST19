package File_InputOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// https://www.youtube.com/watch?v=_jhCvy8_lGE
public class P02_InputOutput {

	public static void main(String[] args) throws IOException {
		
		// Create a text file named fileA in directory
		File file = new File("fileAAA.txt");
		PrintWriter output = new PrintWriter(file);
		
		//write  name and age to file
		output.println("Homer Akin");
		output.println(49);
		output.close();
		
		Scanner input = new Scanner(file);
		String name = input.nextLine();
		int age = input.nextInt();
		
		System.out.printf("Name: %s \nAge : %d",name, age);		
		
		
		
		
		
		
		
	}

}
