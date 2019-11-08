/**
 * Find a 3-digit number, whose value is equal to the sum of the cube of each digit.
 * For example: 
  	153 = 1^3 + 5^3 + 3^3	= 153
	370 = 3^3 + 7^3 		= 370
	371 = 3^3 + 7^3 + 1^3 	= 371
	407 = 4^3 + 0 ^3 + 7^3 	= 407
 */
package AAA_BasicCodings;

public class CubicDigits {

	public static void main(String[] args) {
		for(int i = 100; i <= 999; i++) {
			int first = i / 100;					// 456 / 100 = 4
			int second =  (i % 100) / 10 ;			// 456 % 100 = 56 / 10 = 5
			int third = i % 10;					// 456 % 10 = 6 
			int n = first * first * first 
				  + second * second * second 
				  + (int)(Math.pow(third, 3));
			
			if( n  == i) {
				System.out.println(i);
			}
		}
	}
}
