package LoopsBasic;

import java.util.Scanner;

public class AddingCosequanceNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first integer as a first boundry: ");
		int num1 = scn.nextInt();
		System.out.print("Enter second integer as a second boundry: ");
		int num2 = scn.nextInt();
		int sum;
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
System.out.println("--------------------------------for loop SUM");
		sum =0;
		for (int i = num1; i <=num2; i++)  sum += i;
		System.out.print("Sum: " + sum);

		
System.out.println("\n--------------------------------while loop SUM");
		sum =0;
		int i = num1 ; 
		while(i<=num2) 
			sum += i++;
		System.out.print("Sum: " + sum);
				
System.out.println("\n---------------------------------do-while loop SUM");
		sum =0;
		i = num1 ; 
		do {
			sum += i;
			i++;
		}while(i<=num2) ; 
		System.out.print("Sum: " + sum);
	}

}
