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

package Loop_While;

import java.util.Scanner;

public class Cumulatives_W2 {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		String result="Cumulative total:"; 
		
		System.out.print("Enter numbers: ");
		
		
		while(n != -1)
		{
			n = sc.nextInt();
			sum += n;

			n = sc.nextInt();
			if(sum<1)
				System.out.print(result );
			
			if (sum!=0)
				System.out.print( sum+ " " );
				
		}
			sc.close();
	}
}
