package Scanner;
import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number = 0;
		int i = 0;
		do {
			System.out.print("Enter a number please: ");

			if(sc.hasNextDouble()) {
				number = sc.nextDouble();

				System.out.println("The number you entered is: "+number);
				System.out.println("");
				}
			else {
				System.out.println("I do not understand you.\nThe number has to be a digital form !");
				System.out.println("");
				sc.next();
				}
		}
		while (i == 0);
	
	}
}
