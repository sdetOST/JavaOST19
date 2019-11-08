package Random;
import java.util.Random;
import java.util.Scanner;
public class P020_02_Random_TwoDieToss {
	
	public static void main ( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
	    Random rand = new Random( );
	    
	    while ( true )
	    {
	      System.out.print("You toss " + (rand.nextInt(6)+1) + " and " + (rand.nextInt(6)+1) );
	      String line = scan.nextLine();
	    }
	} 
}

