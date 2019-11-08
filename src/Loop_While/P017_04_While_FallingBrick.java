package Loop_While;
import java.util.Scanner;

public class P017_04_While_FallingBrick {
	  public static void main (String[] args )  {
		  final double G = 9.80665;  					// constant of gravitational acceleration
		  int t, limit;            					// time in seconds; ending value of time
		  double distance;            					// the distance the brick has fallen
		  Scanner scan = new Scanner( System.in );

		  System.out.print( "Enter limit value: " );
		  limit = scan.nextInt();
	    												// Print a table heading
		  System.out.println( "seconds\tDistance"  );  	// '\t' is tab
		  System.out.println( "-------\t--------"  ); 

		  t = 0 ;
		  while (  t <= limit )    
		  {
			  distance = (G * t * t)/2 ;
			  System.out.println( t + "\t" + distance );

			  t = t + 1 ;
		  }
	  }
}
