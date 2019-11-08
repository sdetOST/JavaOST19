package Switch;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter Operator + , - , * , / :" );
		String operation = scan.next();
		
		switch (operation) {
		case "+":
			System.out.println("the addition result is " + (num1+num2));
			break;
		case "-":
			System.out.println("the subtraction result is " + (num1-num2));
            break;
		case "*" :
			System.out.println("the multiplication result is " + (num1*num2));
            break;
		case "/":
			System.out.println("the division result is " + (num1/num2));
			break;
		default:
			System.out.println("Invalid Entry");
//2			break;
				
		}
	}
}
