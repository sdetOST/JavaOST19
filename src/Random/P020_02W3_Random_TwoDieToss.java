package Random;
import java.util.Random;

public class P020_02W3_Random_TwoDieToss {
	
	public static void main ( String[] args ) {
		
		int Die1,Die2;	
	    Random rand = new Random( );
	    
	    Die1 = rand.nextInt(6)+1;
	    Die2 = rand.nextInt(6)+1;
	    System.out.print("You toss " + Die1 + " and " + Die2 + " which is equal to " + (Die1+Die2) );

	} 
}
