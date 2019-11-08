/**
 * convert an integer between 1 - 1000 to word.
 * 
 * Example: 
 * 456   --> Four hundred fifty six
 */
package Loop_While;

import java.util.Scanner;

public class Number2Word {

	public static void main(String[] args) {
	
		
		//break
		// you want to break out of a loop
		Scanner scan = new Scanner(System.in);
		int i = 10;
		int sum = 0;
		while(true) {
			i = scan.nextInt();
			if(i == -1) break;  //stop the loop
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
