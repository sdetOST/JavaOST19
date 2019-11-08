package String;

import java.util.Scanner;

public class EraseACharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		System.out.println("Enter a character to eliminate in string: ");
		char c = scan.next().charAt(0);

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				continue;
			}
			result += str.charAt(i);
		}
		System.out.println("The new string is: "+ result);
	}
}
