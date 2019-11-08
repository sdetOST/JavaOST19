package Loop_While;
import  java.util.Scanner;
public class P017_03_WhileAndIf_Factorial {
	
	public static void main (String[] args ) { 
		
		Scanner scan = new Scanner( System.in );
		long N, fact = 1, x; 

		System.out.print( "Enter N= " );
		N = scan.nextLong();
		x = N ;

		if ( N >= 0 && N <= 20) {
			
			while ( N > 1 ) {
				
				fact = fact * N;
				N    = N - 1;
			}
			
			System.out.println( x + " factorial is " + fact );
			
			}
		else {
			
			System.out.println("N must be between 0 and 20");
		    System.out.println("Factorial for N less than 0 is not defined.");
		    System.out.println("Factorial for N greater than 20 causes overflow.");
		}
	}
}
