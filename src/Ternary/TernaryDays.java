package Ternary;
import java.util.Scanner;
public class TernaryDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Day number : ");
		int dayNum = scan.nextInt();
		String dayWord = "Unknown";

		dayWord = dayNum == 1 ? "monday"
				: dayNum == 2 ? "tuesday"
				: dayNum == 3 ? "wednesday"
				: dayNum == 4 ? "thursday"
				: dayNum == 5 ? "friday"
				: dayNum == 6 ? "saturday" 
				: dayNum == 7 ? "sunday" 
				: "invalid number";
		System.out.println(dayWord);

	}
}
