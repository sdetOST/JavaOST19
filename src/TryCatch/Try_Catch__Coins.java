package TryCatch;
import java.util.*;

public class Try_Catch__Coins {

	public static void main(String[] args) {
		// Create the  scanner
		Scanner sc = new Scanner(System.in);
		
		int numberOfPennies = 0;
		int numberOfNickels = 0;
		int numberOfDimes = 0;
		int numberOfQuarters = 0;
				
		// Number of Pennies
//		String message = "Enter the number of nickels: ";
//		prompt(message);
		System.out.println("Enter the number of pennies: ");
		String line = null;
		while ( line == null) {
			line = sc.nextLine();
			try {
				numberOfPennies = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Expected numeric value, not: '"+ line +"', please try again\n");
//				prompt ("Expected numeric value, not; '"+ line +"', please try again\n");
				line = null;
			}
		}
		// Number of Nickels
//		message = "Enter the number of nickels: ";
//		prompt(message);
		System.out.println("Enter the number of nickels: ");
		line = null;
		while ( line == null) {
			line = sc.nextLine();
			try {
				numberOfNickels = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Expected numeric value, not: '"+ line +"', please try again\n");
//				prompt ("Expected numeric value, not; '"+ line +"', please try again\n");
				line = null;
			}
		}
		// Number of Dimes
//		message = "Enter the number of dimes: ";
//		prompt(message);
		System.out.println("Enter the number of dimes: ");
		line = null;
		while ( line == null) {
			line = sc.nextLine();
			try {
				numberOfDimes = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Expected numeric value, not: '"+ line +"', please try again\n");
//				prompt ("Expected numeric value, not; '"+ line +"', please try again\n");
				line = null;
			}
		}
		// Number of Quarters
//		message = "Enter the number of quarters: ";
//		prompt(message);
		System.out.println("Enter the number of quarters: ");
		line = null;
		while ( line == null) {
			line = sc.nextLine();
			try {
				numberOfQuarters = Integer.valueOf(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Expected numeric value, not: '"+ line +"', please try again\n");
//				prompt ("Expected numeric value, not; '"+ line +"', please try again\n");
				line = null;
			}
		}
		// Close the scanner
//		scanner.close();
		
		// Calculation of total
		int totalCents = numberOfPennies + 
				numberOfNickels * 5 + 
				numberOfDimes * 10 + 
				numberOfQuarters * 25;
		
		double dollarValue = totalCents/100.0;
		
		System.out.println("Total cents: "+ totalCents);
		System.out.println("Total dollar value in jar: $"+ dollarValue);
	}
}