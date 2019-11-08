package Random;
import java.util.Random;
// calculates sin(x) for random angles (in radians) between -10*pi and +10*pi.

public class P020_03_Random_SinTester {
	
	public static void main ( String[] args ) { 
		
		int j=0;
	    Random rand = new Random();
	    
	    System.out.println(" x " + "\t\t\t sin(x)");
	    while ( j<10 )
	    {
	      double x = rand.nextDouble()*(20*Math.PI) - 10*Math.PI;
	      System.out.println( " " + x + "\t" + Math.sin(x));
	      j = j+1;
	    }
	}
}
