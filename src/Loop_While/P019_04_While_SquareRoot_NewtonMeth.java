package Loop_While;
import java.util.Scanner;
public class P019_04_While_SquareRoot_NewtonMeth {
	
	public static void main( String[] args ){
		
		Scanner scan = new Scanner( System.in );
		final double smallValue = 1.0E-14 ;
		double N , Guess ; 
		  
		System.out.print( "Enter the number :" );
		N = scan.nextDouble(); 
		
		if  ( N >= 0.0) {
			
			System.out.print( "Enter the Guess number : " );
			Guess = scan.nextDouble();
		
		
			
			while( Math.abs( N/(Guess*Guess) - 1.0 ) > smallValue ) {
			
					Guess = (0.5* (Guess + N/Guess)) ;
		
			}
			
			System.out.print("The square Root of " + N + " = " + Math.abs(Guess));
		}
		
		else
			
			System.out.print( "You should enter a positive number :" );
		}
		
}
