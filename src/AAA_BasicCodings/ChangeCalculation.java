package AAA_BasicCodings;

import java.util.Scanner;

public class ChangeCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Enter the integer number from 1 to 99");
		number = scan.nextInt();

		int amount, quarters, dimes, nickels, pennies;
		int originalAmount;
		amount = number;
		originalAmount = amount;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		System.out.println(originalAmount + " : ");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels and");
		System.out.println(pennies + " pennies");
	}
}
