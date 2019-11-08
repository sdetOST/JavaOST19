package String;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		
//reverse string------------------------------------------------		
//	        String str = "abcd efg";
//	        String rev = "";
//
//	        for (int i=str.length()-1 ;i>=0; i--){
//	            rev += str.charAt(i);
//	        }
//	        System.out.println(str);
//	        System.out.println(rev);
//	       
//	    }
	 
		
      String str = "abcd efg";
      char cr = 'e';
      String result = "";
      int i = 0;
      while (i<str.length()){
          if (str.charAt(i) == cr) {
              i++;
              continue;

          }
          result += str.charAt(i);
      }
	
	
	
		

}
