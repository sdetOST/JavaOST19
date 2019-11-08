/**
 * 	Print the number between 1 and 10 and their squares
 * 
 * Example:
 * 
 * 1      1
 * 2      4    2 * 2
 * 3      9    3 * 3
 * 4      16
 * ...
 * 10     100
 */

package LoopsBasic;

import java.util.Scanner;

public class SquareTable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer as a boundry for square table");
		int num = scn.nextInt();
		
		System.out.println("Square Table");
		System.out.println(" N\t N^2");
		System.out.println("---\t-----");
		int i;
		for(i = 1; i <= num; i++ ){
			int square = i * i;
			System.out.println(" "+i + "\t  " + square);
			
		}
//System.out.println("---------------same code with a while loop------------");	
//
//
//		System.out.println("While loop starts here");
//		int k = 1;
//		while(k <= 10) {
//			System.out.println(k + "\t" + k *k);
//			k = k + 1;
//		}
//		
//System.out.println("---------------same code with a do-while loop------------");
//
//		System.out.println("Do while starts here");
//		int m = 1;
//		do {
//			System.out.println(m +"\t" + m * m);
//			m++;
//		}while(m <= 10);
	}
}

