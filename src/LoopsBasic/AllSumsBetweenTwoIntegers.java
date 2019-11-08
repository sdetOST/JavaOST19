package LoopsBasic;

import java.util.Scanner;

public class AllSumsBetweenTwoIntegers {

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
		
		System.out.println("Sums of the integers");
System.out.println("-----------------------------------using for loop");
		System.out.println("Starts\tEnds\tSums");
		System.out.println("------\t-----\t-----");
	
		int sum = 0;
		for(int i = num1; i <= num2; i++ ){
			sum  = sum + i;
			System.out.println(" "+num1+"\t "+i+"\t "+sum);
		}
		
System.out.println("----------------------------------same code with a while loop");	

		int i=num1;
		sum = 0;
		while(i <= num2) {
			sum  = sum + i;
			System.out.println(" "+num1+"\t "+(i++)+"\t "+sum);
		}
		
System.out.println("----------------------------------same code with a do-while loop");

		i = num1;
		sum = 0;
		do {
			sum  = sum + i;
			System.out.println(" "+num1+"\t "+(i++)+"\t "+sum);
		}while(i <= num2);
	}
}
