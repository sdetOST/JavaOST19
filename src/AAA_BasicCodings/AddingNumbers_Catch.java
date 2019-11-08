package AAA_BasicCodings;

import java.util.Scanner;

public class AddingNumbers_Catch {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 0;
		int total = 0;
		int tempNumber = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		firstNumber = scan.nextInt();
		System.out.println("Enter second number: ");
		secondNumber = scan.nextInt();
		
		if ( firstNumber > secondNumber) {
			tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
		}
        int x = firstNumber;
        while (x <=secondNumber) {
            total = total + x++;
        }
        System.out.println("The total :"+total);
    }
}
