package Random;
import java.util.Random;
import java.util.Scanner;
public class P020_02W2_Random_TwoDieToss {
	
	public static void main ( String[] args ) {
		
		int Die1,Die2;
		Scanner scan = new Scanner( System.in );
	    Random rand = new Random( );
	    
	    Die1 = rand.nextInt(6)+1;
	    Die2 = rand.nextInt(6)+1;
	    
	    while ( true )
	    {
	      System.out.print("You toss " + Die1 + " and " + Die2 + " which is equal to " + (Die1+Die2) );
	      String line = scan.nextLine();
	    }
	} 
}
