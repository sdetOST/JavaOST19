package File_InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class P22_FileOutput {

	public static void main(String[] args) {

		File file = null;
		FileOutputStream fileOut = null;
		
		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter text to save.");
			String textToSave = userInput.nextLine();
			
			System.out.println("Please enter a file name.");
			String fileName = userInput.nextLine();
						
			file = new File(fileName);
			if(!file.exists()) {
				file.createNewFile();
			}
			fileOut = new FileOutputStream(file);
			
			byte[] textToSaveBytes = textToSave.getBytes();
			fileOut.write(textToSaveBytes);
			
			fileOut.close();
			System.out.println("Saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}
}
