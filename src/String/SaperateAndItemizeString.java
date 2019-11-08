package String;

import java.util.Scanner;

/*
Separate and Itemize Spring Characters
 */
public class SaperateAndItemizeString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String mix = scan.nextLine();
		mix = mix.replace(" ","");
		String numberStr = "";
		String loweCase = "";
		String upperCase = "";
		String azStr = "";

System.out.println("-------------------print numbers in string--------------------------");			
		int i = 0;
		while (i < mix.length()) {
			char c = mix.charAt(i);

			if (c >= '0' && c <= '9') {
				System.out.println(c);
				numberStr = numberStr + c;
			}
			i++;
		}
		System.out.println(numberStr);

		
System.out.println("-------------------print lower case characters in string--------------");	
		int y = 0;
		do {

			char c = mix.charAt(y);
			if (c >= 'a' && c <= 'z') {
				System.out.println(c);
				loweCase = loweCase + c;
			}
			y++;

		} while (y < mix.length());

		System.out.println(loweCase);
		
System.out.println("-------------------print UPPER CASE characters in string--------------");	
		int z = 0;
		do {

			char c = mix.charAt(z);
			if (c >= 'A' && c <= 'Z') {
				System.out.println(c);
				upperCase = upperCase + c;
			}
			z++;

		} while (z < mix.length());

		System.out.println(upperCase);

System.out.println("------------------check whether the character is a number or upper/lower case latter--------------");
		int j = 0;
		while (j < mix.length()) {
			char c = mix.charAt(j);
			if (c >= '0' && c <= '9') { 									// if( c>= 32 && c<= 41 )
				System.out.println("Character \""+mix.charAt(j)+ "\" is a NUMBER!!");
			} else {
			    if( c>= 'A' && c<= 'Z' ) {
				      System.out.println("Character \""+mix.charAt(j)+ "\" is UPPERCASE Latter!!");
				    }else {
				      System.out.println("Character \""+mix.charAt(j)+ "\" is lowercase Latter!!");
						}
			}
			j++;
			

	}
}
}
