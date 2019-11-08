package try_catch_Exception;

import java.util.Scanner;

public class ChangeJar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfPennies = 0;
		int numberOfNickels = 0;
		int numberOfDimes = 0;
		int numberOfQuarters = 0;
		
		// Number of Pennies
		String message = "Enter the number of pennies: ";
		prompt(message);
		String line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				numberOfPennies = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		
		// Number of Nickels
		message = "Enter the number of nickels: ";
		prompt(message);
		line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				numberOfNickels = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		
		// Number of Dimes
		message = "Enter the number of dimes: ";
		prompt(message);
		line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				numberOfDimes = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		
		// Number of Quarters
		message = "Enter the number of quarters: ";
		prompt(message);
		line = null;
		while (line == null) {
			line = scan.nextLine();
			try {
				numberOfQuarters = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				prompt("Expected numeric value, not: \""+line+"\", please try again.\n");
				line = null;
				prompt(message);
			}
		}
		// close the scanner
		scan.close();
		// Calculate the total
		int totalCents = numberOfPennies + numberOfNickels + numberOfDimes + numberOfQuarters ;
		
		double dollarValue = totalCents/100.0;
		
		System.out.println("Total cents: "+ totalCents);
		System.out.println("Total dollar value: "+ dollarValue);
	}

	private static void prompt(String message) {
		System.out.print(message);
		
	}

}
