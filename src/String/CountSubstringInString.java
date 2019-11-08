package String;
/*

How many times a string repeated inside the string 
 
 
*/
import java.util.Scanner;

public class CountSubstringInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter main string: ");
		String str1 = scan.nextLine();
		int s1 = str1.length();
		
		for (int i = 0; i >= 0; i++) {
		System.out.println("Enter sub string  to count in main string: ");
		String str2 = scan.nextLine();
		int s2 = str2.length();
		
		
		int b= 0;
	    int count = 0;
	    while (b < (s1-s2+1)){
	    	if (str1.substring (b,b+s2).equals(str2)) ++count;
	    	b++;
			      
	    }
	    System.out.println("String \""+str2+"\" repeted "+count+" times.");
	    }
		
	}
}
