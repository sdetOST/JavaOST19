package Array;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words -> ["hello", "why", "by", "apple" , "note"]
print: 
       ho
       wy
       by
       ae
       ne
  
 */

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstLastCharOnStringArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter string " + (i + 1) + ": ");
			words[i] = input.nextLine();
		}

		String[] arr1 = new String[1];
		String[] arr2 = new String[1];
		String[] arr3 = new String[1];
		String[] arr4 = new String[1];
		String[] arr5 = new String[1];

		arr1[0] = words[0];
		arr2[0] = words[1];
		arr3[0] = words[2];
		arr4[0] = words[3];
		arr5[0] = words[4];

		String str1 = Arrays.toString(arr1);
		String str2 = Arrays.toString(arr2);
		String str3 = Arrays.toString(arr3);
		String str4 = Arrays.toString(arr4);
		String str5 = Arrays.toString(arr5);
		
		System.out.println(str1.charAt(1) +""+ str1.charAt(str1.length()-2));
		System.out.println(str2.charAt(1) +""+ str2.charAt(str2.length()-2));
		System.out.println(str3.charAt(1) +""+ str3.charAt(str3.length()-2));
		System.out.println(str4.charAt(1) +""+ str4.charAt(str4.length()-2));
		System.out.println(str5.charAt(1) +""+ str5.charAt(str5.length()-2));

	}

}
