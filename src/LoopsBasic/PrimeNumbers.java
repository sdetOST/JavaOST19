package LoopsBasic;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an integer for upper limt: ");
		int num = scn.nextInt();

System.out.println("--------------------------------");

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);

		}
System.out.println("--------------------------------");

		for (int i = 2; i <= num; i++) {
			
			for (int j = 2; j <= i; j++) {
				
				if (j == i)  System.out.println(i);

				if (i % j == 0) break;
				}
			}
		
	}
}
