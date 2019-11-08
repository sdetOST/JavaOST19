package String;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scn.nextLine();
		int l = str.length();
		
		String reverse1 = "";
		for (int i = l-1; i >=0; i--) {
			reverse1 +=  str.charAt(i);		// reverse1 = reverse1 + str.charAt(i);
			}		
		System.out.println(reverse1);
		System.out.println("Palindrome? :" + str.equals(reverse1));
//------------------------------------------------------------		
		String reverse2 = "";
		while ( l > 0) {
			l--;
			reverse2 +=  str.charAt(l);		// reverse2 = reverse2 + str.charAt(l);
		}
		System.out.println(reverse2);
		System.out.println("Palindrome? : " + str.equals(reverse2));
		
//------------------------------------------------------------		
		
		
	}
}
