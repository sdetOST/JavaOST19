package File_InputOutput; 
// https://www.youtube.com/watch?v=3YRahx2ltSg

import java.io.*;
import java.net.URL; /*BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;*/

public class P01_W2_InputOutputSTREAM {

	public static void main(String[] args) throws IOException {

		File x = new File("xx.txt");							// it creates just the path
		
		System.out.println("We got a file: " + x);
		System.out.println("Does it exist? " + x.exists());
		System.out.println("What? " + x.isDirectory());
																	
		OutputStream y = new FileOutputStream(x);	// file creation from the path
		String contentsToWrite = "hello world";	
		y.write(contentsToWrite.getBytes());
		y.close();

		BufferedReader reader = new BufferedReader(new InputStreamReader
				(new FileInputStream(x)));
		String firstLine = reader.readLine();
		reader.close();
		System.out.print("Read a line: " + firstLine);

		
		
	}
}
