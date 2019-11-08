/**
 * Read an integer n from console, and calculate the sum of odd digits of that integer n.
 * For example: 
 * 
 * ------------------
 * Enter an integer:32677
 * Sum = 17
 * ---------------------
 * 
 *  In above example, the input n is 32677, which has 3 odd digits  3, 7, 7. 
 *  3 + 7 + 7 = 17.   Therefore, the result is 17.
 *  
 *   @author anwar mamat
 *   
 */
package Loop_While;

import java.util.Scanner;

public class SumOddDigits {

	public static void main(String[] args) {

		int n = 0;
		int temp = 0;
		int odsum = 0;
		int evensum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		n = input.nextInt();
		System.out.println(n);

		while (n > 0 ) {
			temp = (n % 10);
			if (temp % 2 != 0) {					// test oddness
				odsum += temp;}
			else 
				evensum += temp;

			n = n / 10;
		}
		System.out.println("Some of the Od numbers:" + odsum);
		System.out.println("Some of the Even numbers:" + evensum);

		input.close();
	}

}
