package a001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class A_reverse001 {
	public static void main(String[] args) {
		String word = "Cybertek Spartans";
		reverese1(word);
		reverese2(word);
		reverese3(word);
		reverese4(word);
		reverese5(word);
	}
//==========================================================
//1.Reverse String1 - loop --> snatrapS ketrebyC
//----------------------------------------------------------	
	public static void reverese1(String word) {
		String rev = "";
		for (int i = word.length()-1; i >= 0; i--) {
			rev += "" + word.charAt(i);
		}
		System.out.println(rev);
	}
//==========================================================
//2.Reverse String2 - StringBuilder --> snatrapS ketrebyC	
//----------------------------------------------------------	
	public static void reverese2(String word) {
		
		String reversed = new StringBuilder(word).reverse().toString();
		System.out.println(reversed);
	}
 //==========================================================
 //3.Reverse String by words - Array --> Spartans Cybertek
 //----------------------------------------------------------	
  	public static void reverese3(String word) {  	      
		
		String[] arr = word.split(" ");  	      
		String reverse = "";
  	      
		for (int i=arr.length-1; i>=0; i-- ) {
			reverse +=" "+ arr[i];
		}
		System.out.println(reverse.trim());
  	}
//==========================================================
//4.Reverse String by words - ArrayList-Collections.reverse 
//  							--> Spartans Cybertek
//----------------------------------------------------------	
  	public static void reverese4(String word) {   	      
	      
 	      List<String> list= new ArrayList<>(Arrays.asList(word.split(" ")));
  	      Collections.reverse(list);
  	      String s = list.toString();
  	      s = s.replace("[","").replace("]","").replace(",","");
  	      System.out.println(s);
  	}
//==========================================================
//5.Reverse String words itself - StringBuilder --> ketrebyC snatrapS 
//----------------------------------------------------------	
    	public static void reverese5(String word) {  
  	    
  	    String words[]=word.split(" ");
  	    String revWords="";  
  	    for(String w: words) 
  		    revWords += new StringBuilder(w).reverse().toString()+" ";
  	    System.out.println(revWords);
 	}
}