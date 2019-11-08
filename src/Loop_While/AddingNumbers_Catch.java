package Loop_While;

import java.util.Scanner;

public class AddingNumbers_Catch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int total = 0;
		int tempNumber = 0;
		
		for (int i = 0; i>=00; i++) {
		
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
        int x = firstNumber;
        while (x <=secondNumber) {
            total = total + x++;
        }
        System.out.println("The total :"+total);
        total = 0;
    } 
	}

	private static void prompt(String message) {
		System.out.print(message);
		
	}
}
