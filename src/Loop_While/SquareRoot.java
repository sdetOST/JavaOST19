/**
 * Calculate the square root using Newton's method
 */
package Loop_While;

public class SquareRoot {

	public static void main(String[] args) {
		/**
		 * Newton method
		 *  x2 = ((n/x1) + x1) /2
		 *  
		 */

		/*   10 / 3 = 3.3333333333
		 * x2 = 3.1666666666
		 * 
		 * x2 = (10/3.1666666 + 3.1666666)/2
		 */
		//3.162280671745152
		
		int n = 99;
		double delta = 0.01;
		double x1 = 1;
		double x2 = 1;
		do {
			System.out.println(n + "\told root=" + x1 + "\tnew root=" + x2);
			x1 = x2;
			x2 = (n / x1 + x1 ) /2;
			
		}while( Math.abs(x2-x1) > delta);
		System.out.println(x2);
	}

}
