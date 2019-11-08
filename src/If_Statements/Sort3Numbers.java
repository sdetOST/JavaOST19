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

package If_Statements;
import java.util.Scanner;
public class Sort3Numbers {
	public static void main(String[] args) {

		/**
		 * Read 3 integers from console
		 */
		int a;
		int b;
		int c;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		a = keyboard.nextInt();
		System.out.print("Enter an Integer: ");
		b = keyboard.nextInt();
		System.out.print("Enter an Integer: ");
		c = keyboard.nextInt();
		
		if(a >= b) {
			// swap a <--> b
			int t = a;
			 	a = b;
			 	b = t;
		}
		
		if(a >= c) {
			// exchange a <--> c
			int t = a;
				a = c;
				c = t;
				
			// a is the largest
		}
		
		if(b >= c) {
			// exchange a <--> c
			int t = b;
				b = c;
				c = t;
				
		}
		
		System.out.println("Output: "+ a + ", " + b + ", " + c);
	}
}
