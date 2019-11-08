package Loop_While;

import java.util.Scanner;

public class CountAllIntegers_CatchExceptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		int tempNumber = 0;

		String message = "Enter the first number: ";
		prompt(message);
		String line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				firstNumber = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		
		message = "Enter the second number: ";
		prompt(message);
		line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				secondNumber = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		
		if ( firstNumber > secondNumber) {
			tempNumber = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
		}
		System.out.print("Numbers betweeen " + firstNumber + " and "+secondNumber+ " :\n" );
		int x = firstNumber;	
		while (x <= secondNumber) {
			System.out.print(x++ +", " );
		}
	}
	private static void prompt(String message) {
		System.out.print(message);
	}
}
