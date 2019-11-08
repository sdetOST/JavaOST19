package LoopsBasic;

import java.util.Scanner;

public class AddTwoNumberInConditions {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, sum;
		int count = 1;

		do {
			System.out.print("Enter first integer : ");
			num1 = scn.nextInt();
			System.out.print("Enter second integer : ");
			num2 = scn.nextInt();
			sum = num1 + num2;
			System.out.println("Sum: " + sum);
			count++;
			
//			continue;
			

		}while ( !(sum > 100 || count >3));

		System.out.print("END");
		
	}
}
//-----------------------------------------------------
//		Scanner scn = new Scanner(System.in);
//		int num1 ;
//		int num2 ;
//		int sum ;
//		int count = 0 ;
//		
//		do { 		
//			System.out.print("Enter first integer : ");
//			num1 = scn.nextInt();
//			System.out.print("Enter second integer : ");
//			num2 = scn.nextInt();
//			sum = num1 + num2;
//			System.out.println("Sum: " + sum);
//			count++;
//			if (count == 3)
//				break;
//			
//		}while ((sum <= 100 );
//
//		System.out.print("END");
//
//	}
//}
