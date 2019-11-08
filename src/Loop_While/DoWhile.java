package Loop_While;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		do {
			System.out.println("Hello:"+ n);
			n++;
		}while (n<=5);
		
	}
}
