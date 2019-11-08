package Array;

/*
Given an array nums with 7 integers every element is repeated twice - except one. 
Find that element and print it to console.

Example:

nums --> [1, 1, 2, 3, 4, 3, 4]
         2
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_00001_CountNumberInArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 integer :");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		
System.out.println("==========================\n---Count Elements of IntArrays---\n-------------------------------");	

		String s = ",";
		for (int j = 0; j < nums.length; j++) {
			int a = nums[j];
			char b = (char) a;
			if (s.contains(b + ""))
				continue;
			s = s + b;
			

			int c = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == a)
					c++;
			}
			
			System.out.println(a + " repeted " + c + " times in array nums");
		}
System.out.println("==========================\n---Count an Element in IntArrays---\n-------------------------------");	

		
		System.out.println("Enter the number you would like to count in Array :");
		int b = input.nextInt();
	
		int d = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == b)
					d++;
		}
			
		System.out.println(b + " repeted " + d + " times in array nums");

System.out.println("==========================\n---Count a character in String---\n-------------------------------");	
		

		String str = " I love java, I love testing too.";
		System.out.println("Enter a character to count");
		String c = input.next();
		char cahrToLook  = c.charAt(0);
		
		char[] arr1 = str.toCharArray();
				
		int counter = 0;
		for(int i=0; i< arr1.length; i++) {
			if( arr1[i]==cahrToLook) counter ++;
		}
		
		System.out.println("\""+cahrToLook+ "\" is used "+counter+" times in the String");
				
				

		
		
		
System.out.println("==========================\n---Count an Element in StringArrays---\n-------------------------------");	
		
		
		String [] words = { "aaa","aaa","bbbb","bbbb","aa a","a  aa","bbb b","bb bb"};
		System.out.println("Enter the string you would like to count in Array :");
		String s1 = input.nextLine();
		
		int g  = 0;
		for (int i = 0; i < words.length; i++ ) {
			String str1 = words[i];
			if (str1.contains(s1)) 
				g++;
		}
		System.out.println(s1 + " repeted " + g + " times in array words");
		
		

		
		
		
		
		
System.out.println("==========================\n---Count all Element in StringArrays---\n-----------------------------");	
		
		String [] wordss = { "aaa","aaa","bbbb","bbbb","aa a","a  aa","bbbb","bb bb","aa a"};
		String ss = "";
		for (int j = 0; j < wordss.length; j++) {
			String a = wordss[j];
			if (ss.contains(a + ""))
				continue;
			ss = ss + a;
		 		
			int m  = 0;
			for (int i = 0; i < wordss.length; i++ ) {
				String str1 = wordss[i];
				if (str1.contains(a)) 
					m++;
				
			}
			System.out.println(a + " repeted " + m + " times in array words");
		
		}
		
System.out.println("==========================\n---2D Array printing---\n-------------------------------");	
		
		
		int[][] num = new int[2][2];
		System.out.println(Arrays.deepToString(num));
		
		for(int[] q: num) {
			for(int r : q ) {
				System.out.print(r +", ");
			}
			System.out.println();
		}
		
		
	}
}
			

