package Scanner;
import java.util.Scanner;

public class Scanner02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		double number2 = 0.0;
//		boolean isNumber;
		int i = 0;
	

		do {
			System.out.print("\nEnter a number please: ");
			if (sc.hasNextInt()) {
				number = sc.nextInt();

				System.out.println("The number you entered is: "+number);

			}
			else if(sc.hasNextDouble()) {
				number2 = sc.nextDouble();

				System.out.println("The number you entered is: "+number2);

				}
			else {
				System.out.println("I do not understand you !");

				sc.next();
				}
		}
		while (i == 0);
	
	}
}
