package Ternary;

import java.util.Scanner;

public class Ternary0001 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 4;
		
		int max = (a>b)? a : b;   								// find max
		
System.out.println("-------------------------------------------");
		
		int bill = 200;
		int discount = (bill >1000)? 20 : 15;
		System.out.println("Discount: %"+discount);
		
System.out.println("-------------------------------------------");

		int amt = 200;								
		int qty = 10;
		int discountt = (amt >1000)? (qty > 10)? 20 : 15: 10;
		System.out.println("Discount: %"+ discountt);
		
System.out.println("-------------------------------------------");		
		

        String name1 = "asdfga";
        String name2 = "edrga";
        int length1 = name1.length();
        int length2 = name2.length();
        
		System.out.println ((length1>length2)?"name1 is longer one "
												:"name2 is longer one");
		
System.out.println("--------------------------------------------------------------");

		int dayNum = 4;
		String dayWord = "Unknown";

		dayWord = dayNum >6 && dayNum<8 ? "weekend"
				: dayNum <= 6 && dayNum >0 ? "weekday"
				: "invalid number";
		
		System.out.println(dayWord);
		
System.out.println("--------------------------------------------------------------");
		
		int dayNm = 5;
		String dayWord1 = "Unknown";

		dayWord1 = dayNm == 1 ? "monday"
				: dayNm == 2 ? "tuesday"
				: dayNm == 3 ? "wednesday"
				: dayNm == 4 ? "thursday"
				: dayNm == 5 ? "friday"
				: dayNm == 6 ? "saturday" 
				: dayNm == 7 ? "sunday" 
				: "invalid number";
System.out.println(dayWord1);

System.out.println("--------------------------------------------------------------");
		
	}

}
