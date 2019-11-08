package AAA_BasicCodings;
import java.util.Scanner;

public class BasicCalculations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the first value");
        x = scan.nextInt();
        System.out.println("Enter the second value");
        y = scan.nextInt();

        System.out.println("Enter the operation");
        String operation = scan.next();

        if (operation.equals("+")) {
            System.out.println("This is the addition result is " + (x + y));
        } else if (operation.equals("-")) {
            System.out.println("This is the subtraction result is " + (x - y));
        } else if (operation.equals("*")) {
            System.out.println("This is the multiplication result is " + (x * y));
        } else if (operation.equals("/")) {
            System.out.println("This is the division result is 3" + (x / y));
        } else {
            System.out.println("Enter the correct operation");
        }

	}

}
