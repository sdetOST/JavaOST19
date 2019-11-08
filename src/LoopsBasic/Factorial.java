package LoopsBasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number for factorial: ");
		int num = scn.nextInt();
		int i,fac;
		
		if ( num < 0) {													//  Exception catch 
			System.out.print("Please enter positive integer: ");		//	for negative
			num = scn.nextInt();										//	numbers
		}																//
		
System.out.println("--------------------------------for loop_FACTORIAL");
		fac = 1;
		for ( i = 1; i <=num; i++)  fac *= i;
		System.out.println(num+ "! = " + fac);

		
System.out.println("\n--------------------------------while loop_FACTORIAL");
		fac = 1;
		i = 1 ; 
		while(i<=num) 
			fac *= i++;
		System.out.println(num+ "! = " + fac);
				
System.out.println("\n---------------------------------do-while loop_FACTORIAL");
		fac = 1;
		i = 1 ; 
		do {
			fac *= i;
			i++;
		}while(i<=num) ; 
		System.out.println(num+ "! = " + fac);
		
		}
}	


