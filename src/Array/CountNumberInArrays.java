package Array;
/*
Given an array nums with 7 integers every element is repeated twice - except one. 
Find that element and print it to console.

Example:

nums --> [1, 1, 2, 3, 4, 3, 4]
         2
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class CountNumberInArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 integer :");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		System.out.println("Enter the number to search");

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
	}
}
