package AAA_BasicCodings;
import java.util.Scanner;

public class AddDoubles010_01 {
	
	public static void main (String[] args) {
		
		double first, second, sum;
		Scanner scan = new Scanner( System.in );
 
		// Read in the first double
		System.out.print("Enter the first double: ");
		first = scan.nextDouble();

		// Read in the second double
		System.out.print("Enter the second double: ");
		second = scan.nextDouble();

		// Compute the sum and write it out
		sum = first + second;
		System.out.print("Sum: " + sum );
		
	}
}
