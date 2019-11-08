package String;

import java.util.Scanner;

public class PrintingCharacter {

	  public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a text: ");
		    String word = scan.nextLine();
		    String wrd = word.trim();
		    
		    char first = wrd.charAt(0);
		    char last = wrd.charAt(wrd.length()-1);
		    
		    System.out.println(first+""+last);
		    System.out.printf("%c%c\n",first,last);
		    
		  }
}
