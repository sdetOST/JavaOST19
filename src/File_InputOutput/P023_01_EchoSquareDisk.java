package File_InputOutput;
import java.util.Scanner;
import java.io.*;

public class P023_01_EchoSquareDisk {
	
	public static void main (String[] args) throws IOException
	{ 
		File    file = new File("myData.txt");   // create a File object
	    Scanner scan = new Scanner( file );      // connect a Scanner to the file
	    int num, square;

	    num = scan.nextInt();
	    square = num * num ;   

	    System.out.println("The square of " + num + " is " + square);
	  }
}
