package If_Statements;
/**
 * 	Check if a given year is a leap year
 * 
 * 	A year is a leap year if it is divisble by 4, but not divisible by 100
 *  or it is divisible by 400
 * 
 */


import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1996;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		year = input.nextInt();
		
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 !=0)) ||  (year % 400 == 0);
				
		
		if(isLeapYear) {
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year + " is NOT a Leap Year");
		}
		
		input.close();
	}

}
