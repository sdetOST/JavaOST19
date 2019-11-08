package Ternary;
import java.util.Scanner;
public class TernaryDays02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Day number : ");
		int dayNum = scan.nextInt();
		String dayWord = "Unknown";

		dayWord = dayNum >6 && dayNum<8 ? "weekend"
				: dayNum <= 6 && dayNum >0 ? "weekday"
				: "invalid number";
		System.out.println(dayWord);

	}
}
