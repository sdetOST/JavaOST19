/**
 * Sort 3 Numbers
 * 
 * This program prompts users to enter 3 numbers (integers) , sorts the numbers in non-descending order, and 
 * displays the numbers in sorted order.
 * 
 *  For example:  
  	Enter an Integer:10
	Enter an Integer:5
	Enter an Integer:20
	Output:5,10,20
 
 *  Testing program checks all your output.  
 *  Your prompts and output format must be same as the example above.
 * 
 * @author anwar mamat
 * 
 */

package sort;

import java.util.Scanner;

public class Sort3Numbers {
	public static void main(String[] args) {

		/**
		 * Read 3 integers from console
		 */
		System.out.println("Enter an Integer:");
		
		Scanner input = new Scanner(System.in);
	
		
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		
		System.out.printf("The first number entered\t: %s",a);
		System.out.printf("\nThe second number entered\t: %s",b);
		System.out.printf("\nThe third number entered\t: %s",c);
		System.out.println();
		if((a <= b) && (b <= c))
			System.out.println("Output: "+ a +" < "+ b +" < "+ c);
		else if((a <= c) && (c <= b))
			System.out.println("Output: "+ a +" < "+ c +" < "+ b);
		else if((b <= c) && (c <= a))
			System.out.println("Output: "+ b +" < "+ c +" < "+ a);
		else if((b <= a) && (a <= c))
			System.out.println("Output: "+ b +" < "+ a +" < "+ c);
		else if((c <= a) && (a <= b))
			System.out.println("Output: "+ c +" < "+ a +" < "+ b);
		else if((c <= b) && (b <= a))
			System.out.println("Output: "+ c +" < "+ b +" < "+ a);
	}

}
