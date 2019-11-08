package LoopsBasic;

import java.util.Scanner;

public class CountingNumbersBetweenTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first integer as a first boundry");
		int num1 = scn.nextInt();
		System.out.println("Enter second integer as a second boundry");
		int num2 = scn.nextInt();
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
System.out.println("---------------------------------------for loop counting");
		
		for (int i = num1; i <=num2; i++)
			System.out.print(i + " ");

		
System.out.println("\n---------------------------------------while loop counting");
		
		int i = num1 ; 
		while(i<=num2) {
			System.out.print(i + " ");
			i++ ; 
		}
		System.out.println();
		
System.out.println("---------------------------------------do-while loop counting");

		i = num1 ; 
		do {
			System.out.print(i+ " ");
			i++;
		}while(i<=num2) ; 
		
	}

}
