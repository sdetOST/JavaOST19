/**
 * Find a 3-digit number, whose value is equal to the sum of the cube of each digit.
 * For example: 153 = 1^3 + 5^3 + 3 ^ 3
 */
package Loop_For;

public class CubicDigits {

	public static void main(String[] args) {
		for(int i = 100; i <= 999; i++) {
			// 456
			//456 / 100 = 4
			//456 % 100 = 56 / 10 = 5
			int first = i / 100;
			int second =  (i % 100) / 10 ;
			int third = i % 10;
			int n = first * first * first + second * second * second + (int)(Math.pow(third, 3));
			if( n  == i) {
				System.out.println(i);
			}
		}
		 
		/*
		 * 153
370 = 3^3 + 7^3

371 3 ^3 + 7^3 + 1^3
407  = 4^3 + 0 ^3 + 7^3
*/ 
		

	}

}
