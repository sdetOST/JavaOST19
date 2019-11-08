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

public class Sort3Numbers_W2 {
	public static void main(String[] args) {

		/**
		 * Read 3 integers from console
		 */
		int a,b,c,t;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: " );		
		a =input.nextInt();
		System.out.print("Enter an integer: " );
		b =input.nextInt();
		System.out.print("Enter an integer: " );
		c =input.nextInt();
		
		if (a > b) {									//swap a<-->b
			t = a;
			a = b;
			b = t;
		}
		
		if (a > c) {									//swap a<-->b
			t = a;
			a = c;
			c = t;
		}
		if (b > c) {									//swap a<-->b
			t = b;
			b = c;
			c = t;
		}
		System.out.println("The order is: "+ a +" < "+ b +" < "+ c);
		}
}

