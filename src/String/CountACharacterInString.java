package String;

import java.util.HashMap;
import java.util.Map;
/*

How many times a character repeated inside the string 
 
 
*/
import java.util.Scanner;

public class CountACharacterInString {

	public static void main(String[] args) {

//------------------------------------------------------------------------------------------use while loop		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter a string: ");
//		String str = scan.nextLine();
//		System.out.println("Enter a character to count in string: ");
//		char c = scan.next().charAt(0);
//
//		int count = 0;
//		int b = 0;
//		while (count < str.length() - 1) {
//			if (str.charAt(count) == c)
//				++b;
//			count++;
//
//		}
//		System.out.println("Character " + c + " repeted " + b + " times inside the string");

//----------------------------------------------------------use for loop
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter a string: ");
//		String str = scan.nextLine();
//		System.out.println("Enter a character to count in string: ");
//		char c = scan.next().charAt(0);
//
//		int b = 0;
//		for (int i = 0; i < str.length()-1; i++) {
//			if (str.charAt(i) == c)
//				++b;
//
//		}
//		System.out.println("Character " + c + " repeted " + b + " times inside the string");

//-------------------------------------------------------Count All Characters use for loop
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter a string: ");
//		String str = scan.nextLine();
//		int b = 0;
//		char c = 0;
//		String s = "";
//		for (int i = 0; i < str.length(); i++) {
//			c = str.charAt(i);
//			if (s.contains(c + ""))
//				continue;
//			s = s + str.charAt(i);
//
//			b = 0;
//			int j = 0;
//			while (j < str.length()) {
//				if (str.charAt(j) == c)
//					++b;
//				j++;
//
//			}
//			System.out.println("Character " + c + " repeted " + b + " times inside the string");
//			
//--------------------------------------------------------------------------------Count All Characters using for loop

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter a string: ");
//		String str = scan.nextLine();
//		
//		String s = "";
//		for (int j=0; j < str.length(); j++) {
//			char c = str.charAt(j);
//			if (s.contains(c + ""))
//				continue;
//			s = s + c;
//			
//			int b = 0;
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(i) == c)
//				++b;
//			
//			} System.out.println("Character " + c + " repeted " + b + " times inside the string");
//		
//		}  System.out.println(s);
//	}
	
//-------------------------------------------------------Count All Characters returns map

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a string: ");
	String str = scan.nextLine();
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	String unique = "";
	for (int j=0; j < str.length(); j++) {
		char c = str.charAt(j);
		if (unique.contains(c + "")) continue;
		else unique = unique + c;
		
		int b = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
			++b;
		
		} map.put(c, b);
	
	}  System.out.println(map);
}	
	

}
