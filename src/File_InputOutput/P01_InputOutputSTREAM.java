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

public class P01_InputOutputSTREAM {

	public static void main(String[] args) throws IOException {

		File path = new File("helloo.txt");						// it creates just the path
		System.out.println("We got a file: " + path);
		
		System.out.println("Does it exist? " + path.exists());
		System.out.println("What? " + path.isDirectory());
		
/*		String contentsToWrite = "hello world";					// file creation from the path
		OutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();
*/
/*		BufferedReader reader = new BufferedReader(new InputStreamReader
				(new FileInputStream(path)));
		String firstLine = reader.readLine();
		reader.close();
		System.out.print("Read a line: " + firstLine);
*/	
		URL url = new URL("http://mirrors.xmission.com/gutenberg/etext98/mspcd10.txt");
		InputStream stream = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		System.out.print("Done reading!");
		reader.close();
		
		
	}
}
