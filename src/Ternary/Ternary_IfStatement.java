package Ternary;
import java.util.Scanner;

public class Ternary_IfStatement {

	public static void main(String[] args) {
		
//		double a,b,max;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter two numbers: ");
//		a = sc.nextDouble();
//		b = sc.nextDouble();
//		
//		max = (a>b)? a : b;   // if a>b max=a, if a<b max=b 
//		
//		System.out.println("The max number you enterd is: "+ max);
//System.out.println("-------------------------------------------");
//
//		boolean isGreen = true;
//		String action;
//	
//		action = (isGreen)? "Can drive":"Can't drive";
//		System.out.println(action);
//System.out.println("-------------------------------------------");

		int bill = 200;
		int discount = (bill >1000)? 20 : 15;
		System.out.println("Discount: %"+discount);
		

System.out.println("-------------------------------------------");

		int amt = 200;								
		int qty = 10;
		int discountt = (amt >1000)? (qty > 10)? 20 : 15: 10;
		System.out.println("Discount: %"+ discountt);
		
//		Above is the shortage form of the if statement below
//		if (amt>1000) {
//			if(qty > 10)
//				discountt = 20;
//			else 
//				discountt = 15;
//		}else
//			discountt = 10;
		
System.out.println("-------------------------------------------");

	}
}
