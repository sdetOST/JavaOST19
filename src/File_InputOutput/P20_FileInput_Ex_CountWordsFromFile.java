package File_InputOutput;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class P20_FileInput_Ex_CountWordsFromFile {

	public static void main(String[] args) throws IOException{
		//create input stream and scanner
		FileInputStream fin = new FileInputStream("readwords.txt");
		Scanner fileInput = new Scanner(fin);
		System.out.println(fin);
		
		// create the array list
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		// read through file and find the words
		while(fileInput.hasNext()) {
			String nextWord = fileInput.next();		// get the next words
			if(words.contains(nextWord)){				// determine if the word is in the ArrayList
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index) + 1);
			}
			else {
				words.add(nextWord);
				count.add(1);
			}
		}
		fileInput.close();
		fin.close();
		
		// print out the results
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i) + " occured " + count.get(i) + " time(s) ");
		}
	}
}