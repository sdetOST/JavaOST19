package Switch;

import java.util.Scanner;

public class Days03 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter Day number : ");
	    int dayNum = scan.nextInt();
	    String dayWord = "Unknown";

	    switch (dayNum) {

	    case 1:case 2:case 3:case 4:case 5:
	      dayWord = "Weekday";
	      break;
	    case 6:case 7:
	      dayWord = "Weekend";
	      break;
	    default:
	      dayWord = "Invalid Day";
	      break;
	    }
	    System.out.println("the day is:" + dayWord);

	  }
}


/*
 * 
 * HOMEWORK :
         *  2 variables : season as String , monthNum as int
         *     Use switch statemmet to check for monthNumber equality
         *  if  3-4-5 as spring 6-7-8 as summer -9-10-11 fall -12,1,2 as winter
 */
