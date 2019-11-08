package File_InputOutput;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class P23_PrintOutToFile {

	public static void main(String[] args) {

		try {
			File file = new File("output.txt");
			FileOutputStream fileOut = new FileOutputStream(file);
			PrintStream printOut = new PrintStream(fileOut);
			
			printOut.println("Hello");
			printOut.println("world.");
			
			printOut.flush();
			printOut.close();
			fileOut.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
