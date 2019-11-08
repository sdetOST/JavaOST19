package String;
/*

How many times Characters repeated inside the string 
 
 
*/
import java.util.Scanner;

public class CountAllCharactersInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		str = str.replace(" ","");
		int sl = str.length();

		for (int i = 0; i < sl ; i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) == i ) {
				
				int b = 0;
				int j = 0;
				while (j < sl ) {
					if (str.charAt(j) == c)
						++b;
					j++;

				}
				System.out.println("Character \"" + c + "\" repeted " + b + " times.");
			}
		}
	}
}
