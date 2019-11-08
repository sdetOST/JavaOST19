/**
 * 
 * 
	Write a program which reads a sequence of positive integers and prints the cumulative totals.
	
	Cumulative total is sum of integers you have seen so far. 
	
	Your program should stop reading inputs when the input is -1

Example:

----------------------------
Enter numbers: 1 7 2  9 -1 
Cumulative total:1 8 10 19 
---------------------------


Hint:
1: sum of first number
8= 1 + 7
10= 1 + 7 + 2
19 = 1 + 7 + 2 + 9

You stop when you see -1.

@author anwar mamat
 */

package Loop_For;

import java.util.Scanner;

public class Cumulatives2 {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int t = 0;
		
		String result="Cumulative Total: "; 
		
		System.out.print("How many numbers you will enter?: ");
		n = sc.nextInt();
		
		for (int k = 1; k <= n; k++ ) {
			System.out.print("Enter number "+ k +": ");
			t = sc.nextInt();
			sum += t;
			
		}
		
		System.out.println(result + sum );
		System.out.print("The Avarage is: "+ sum/(double)n );
		sc.close();
		
	}
}
