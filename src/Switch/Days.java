package Switch;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter Day number : ");
	    String dayNum = scan.next();
	    String dayWord = "Unknown";

	    switch (dayNum) {

	    case "1":
	    case "2":
	    case "3":
	    case "4":
	    case "5":
	      dayWord = "Weekday";
	      break;
	    case "6":
	    case "7":
	      dayWord = "Weekend";
	      break;
	    default:
	      dayWord = "Invalid Day";
	      break;
	    }
	    System.out.println("the day is:" + dayWord);

	  }
}
