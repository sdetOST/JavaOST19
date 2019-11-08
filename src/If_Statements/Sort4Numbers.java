/**
 * Sort 4 Numbers  a,b,c,d
 * a-b,a-c,a-d
 * b-c,b-d
 * c-d
 * 
 * This program prompts users to enter 4 numbers (integers) , sorts the numbers in non-descending order, and 
 * displays the numbers in sorted order. 
 */

package If_Statements;

import java.util.Scanner;

public class Sort4Numbers {
	public static void main(String[] args) {


		int a,b,c,d,t;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: " );		
		a =input.nextInt();
		System.out.print("Enter an integer: " );
		b =input.nextInt();
		System.out.print("Enter an integer: " );
		c =input.nextInt();
		System.out.print("Enter an integer: " );
		d =input.nextInt();
		
		
		if (a > b) {									//swap a<-->b
			t = a;
			a = b;
			b = t;
		}
		if (a > c) {									//swap a<-->c
			t = a;
			a = c;
			c = t;
		}
		if (a > d) {									//swap a<-->d
			t = a;
			a = d;
			d = t;
		}
		if (b > c) {									//swap b<-->c
			t = b;
			b = c;
			c = t;
		}
		if (b > d) {									//swap b<-->d
			t = b;
			b = d;
			d = t;
		}
		if (c > d) {									//swap c<-->d
			t = c;
			c = d;
			d = t;
		}
		System.out.println("The order is: "+ a +", "+ b +", "+ c +", "+ d);
		
}
}