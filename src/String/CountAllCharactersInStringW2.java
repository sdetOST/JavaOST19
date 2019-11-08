package String;

import java.util.Scanner;

public class CountAllCharactersInStringW2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		str = str.replace(" ","");
		int sl = str.length();
		String result = "";

		for (int i = 0; i < sl ; i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) == i ) {
				
				int b = 0;
				int j = 0;
				while (j < sl ) {
					if (str.charAt(j) == c)	++b;
					j++;
				}
				result +=String.valueOf(b)+c+""; 
			}
		}				
		System.out.println(result);
	}
}