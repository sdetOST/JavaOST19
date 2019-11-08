package If_Statements;
import java.util.Scanner;

public class IfStatement_Drink {


	public static void main(String[] args) {
		int tipe, drink, amount ;
		double price, Amount ;
		String drinkk;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello there.\nPlease chose drink tipe.\nEnter 1 for Hot, 2 for Cold");
		tipe = sc.nextInt();
		if (tipe == 1) {
			System.out.println("Enter 1 for tea, 2 for coffee");
			drink = sc.nextInt();
			if(drink == 1) {
				System.out.println("How many you would like to have");
				amount = sc.nextInt();
				drinkk = "tea";
				price = 2.0;
				Amount = amount * price;
				System.out.println("You ordered "+ amount +" "+ drinkk +", price of $"+price+" each.\nThe total amount is: $"+ Amount);
			}else if(drink == 2){
				System.out.println("How many you would like to have");
				amount = sc.nextInt();
				drinkk = "cofee";
				price = 3.0;
				Amount = amount * price;
				System.out.println("You ordered "+ amount +" "+ drinkk +", price of $"+price+" each.\nThe total amount is: $"+ Amount);
			}else {
				System.out.println("Invalid selection");
			}
		}else if(tipe == 2) {
			System.out.println("Enter 1 for Icetea, 2 for lemonate");
			drink = sc.nextInt();
			
			if(drink == 1) {
				System.out.println("How many you would like to have");
				amount = sc.nextInt();
				drinkk = "Icetea";
				price = 2.5;
				Amount = amount * price;
				System.out.println("You ordered "+ amount +" "+ drinkk +", price of $"+price+" each.\nThe total amount is: $"+ Amount);			
			}else if (drink == 2) {
				System.out.println("How many you would like to have");
				amount = sc.nextInt();
				drinkk = "lemonate";
				price = 3.5;
				Amount = amount * price;
				System.out.println("You ordered "+ amount +" "+ drinkk +", price of $"+price+" each.\nThe total amount is: $"+ Amount);			
			}else {
				System.out.println("Invalid selection");
			}
		}
		else {
			System.out.println("Invalid selection");
		}
		
	}
}
