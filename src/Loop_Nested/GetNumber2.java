package Loop_Nested;
import java.util.Scanner;

public class GetNumber2 {

	public static void main(String[] args) {
		
		int n = 0;
		int j = 1;
		
		while (j>0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a whole number:");
			while (!sc.hasNextInt()) {
				System.out.println("Enter a whole number idiot:");
				sc.next();
			}
			n = sc.nextInt();
			System.out.println("The number you entered is "+ n);
			System.out.println("----------------- ");
			
		}
	}

}
