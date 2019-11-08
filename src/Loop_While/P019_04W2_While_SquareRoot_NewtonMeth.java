package Loop_While;
import java.util.Scanner;
public class P019_04W2_While_SquareRoot_NewtonMeth {
	
	public static void main( String[] args ){
		
		Scanner scan = new Scanner( System.in );
		final double smallValue = 1.0E-14 ;
		double N , Guess ; 
		System.out.print( "Enter a positive number :" );
		N = scan.nextDouble();
		
		while ( N < 0) {
			
			System.out.println( "You should enter a positive number :" );
			System.out.print( "Enter a positive number :" );
			N = scan.nextDouble();
			
		}
		
		System.out.print( "Enter the Guess number : " );
		Guess = scan.nextDouble();
		System.out.println(Math.abs( N/(Guess*Guess) - 1.0 ));
			
		while( Math.abs( N/(Guess*Guess) - 1.0 ) > smallValue ) {
			
		Guess = (0.5* (Guess + N/Guess)) ;
		
		}
			
			System.out.print("The square Root of " + N + " = " + Math.abs(Guess));
	}
}
