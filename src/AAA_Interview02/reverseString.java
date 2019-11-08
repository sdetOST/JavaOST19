package a01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseString {
	public static void main(String[] args) {
		String word = "Cybertek spartans";
		String rev = "";

//#1----------------------------------------------------
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += "" + word.charAt(i);
		}
		System.out.println(rev);

//#2---------------------------------------------------------
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.substring(i, i + 1);
		}
		System.out.println(rev);

//#3--------------------------------------------------------

		StringBuilder str = new StringBuilder(word);
		str.reverse();
		System.out.println(str);

//#4--------------------------------------------------------
		
		String reversed = new StringBuilder(word).reverse().toString();
		System.out.println(reversed);

//#5 One line--------------------------------------------------
	      System.out.println(new StringBuilder(word).reverse().toString());
		
//#6-using array to reverse word by word--------------------------------------
	      
 	      String[] arr = word.split(" ");
 	      List<String> list= new ArrayList<>(Arrays.asList(arr));
  	      Collections.reverse(list);
  	      System.out.println(list); 
//#7-using array to reverse char by char--------------------------------------
	      
 	      String[] ar = word.split("");
 	      List<String> lst= new ArrayList<>(Arrays.asList(ar));
  	      Collections.reverse(lst);
  	      System.out.println(lst);  	      

	}
}