package AAA_BasicCodings;
import java.util.Scanner;
public class Chapter010_AddTwo01 {
	public static void main (String[] args)  {
		
		Scanner scan = new Scanner( System.in );
	    int first, second, sum ;      					// declaration of int variables

	    System.out.println("Enter first  integer:");
	    first = scan.nextInt();       					// read chars and convert to int

	    System.out.println("Enter second integer:");
	    second = scan.nextInt();      					// read chars and convert to int

	    sum = first + second;         					// add the two int, put result in sum

	    System.out.println("The sum of " + first + " plus " + second +" is " + sum );
	  }
}
