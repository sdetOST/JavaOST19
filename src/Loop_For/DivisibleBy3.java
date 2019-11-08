/** 
 * Print numbers between 1 - 100 and divisible by 3
 */
package Loop_For;

public class DivisibleBy3 {

	public static void main(String[] args) {
		for(int i = 1; i <=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i + "\t" + i/3);
			}
		}
	}
}
