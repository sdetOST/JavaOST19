package String;

import java.util.Scanner;

public class EraseADublicatedChart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		int sl = str.length();
		String newStr = "";

//		for (int i = 0; i < sl; i++) {
//
//			String eachChar = str.charAt(i) + "";
//
//			if (newStr.contains(eachChar)) {
//
//			} else {
//				newStr = newStr + eachChar;
//			}
//
//		}
//
//		System.out.println(newStr);

//-----------------------------------------------------------------

		for (int i = 0; i < sl; i++) {
			
			String eachChar = str.charAt(i) + "";
			
			if (newStr.contains(eachChar))
				continue;

			newStr = newStr + eachChar;
		}
		System.out.println(newStr);

	}
}
