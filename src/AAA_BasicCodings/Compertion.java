package AAA_BasicCodings;

import java.util.Scanner;

public class Compertion {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.println("Enter the x value");
		x = scan.nextInt();
		System.out.println("Enter the y value");
		y = scan.nextInt();

		if (x > y) {
			System.out.println("x is greater than y");
		} else if (x == y) {
			System.out.println("x is equal to y");
		} else {
			System.out.println("y is greater than x");
		}
	}
}
