package a01;
/*
  	Write a return method that check if a string is build out of the same letters as another string.

	Ex:  	same("abc",  "cab"); -> true 
		same("abc",  "abb"); -> false:
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class sameCharsStrings {

	public static void main(String[] args) {
		
		List<String> c1 = new ArrayList<>();

		System.out.println(same("abc",  "cab"));
		System.out.println(same("abc",  "abb"));
		
		System.out.println(same2("abc",  "cab"));
		System.out.println(same2("abc",  "abb"));
	}

	public static boolean same(String a, String b) {

		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String a1="", a2="";

		for(char each: ch1) a1 +=each;
		for(char each: ch2) a2 +=each;		 

		return  a1.equals(a2) ;

		}
	public static boolean same2(String a, String b) {
		a = new TreeSet<String>(Arrays.asList( a.split("") ) ).toString( );
		b = new TreeSet<String>(Arrays.asList( b.split("") ) ).toString( );
		
		return  a.equals(b) ;
	}
	





}
