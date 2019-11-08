package Array;

import java.util.Scanner;

public class DaysArray {

	public static void main(String[] args) {
		
		String [] dayNames = 
			{"Sunday","Monday","Tuesday","Wednesday","Thurusday","Friday","Saturday"};
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the day: 1 for Sunday,2 for Monday,3 for Tuesday,4 for Wednesday,5 for Thurusday,6 for Friday,7 for Saturday)");
	    int day = scan.nextInt();
	    int i = day-1;
	    
	    System.out.println(dayNames[i]);
	}
}
