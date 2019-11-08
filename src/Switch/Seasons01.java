package Switch;
import java.util.Scanner;
public class Seasons01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mounth number : ");
		int month = scan.nextInt();
		String season;

		switch (month) {
		case 12: case 1: case 2:
			season = "Winter";
			break;
		case 3: case 4: case 5:
			season = "Spring";
			break;
		case 6: case 7: case 8:
			season = "Summer";
			break;
		case 9: case 10: case 11:
			season = "Fall";
			break;
		default:
			season = "Invalid entery!";
			break;
		}
		System.out.println("The season is: " + season);

	}
}

// HOMEWORK :
//	       2 variables : season as String , monthNum as int
//	       Use switch statemmet to check for monthNumber equality
//	       if  3-4-5 as spring 6-7-8 as summer -9-10-11 fall -12,1,2 as winter
