package Loop_While;
import java.util.Scanner;

public class P016_02_While_fload {
	  public static void main (String[] args )  
	  {
	    Scanner scan = new Scanner( System.in );
	    float count, limit, increment;

	    System.out.println( "Enter initial value: " );
	    count = scan.nextFloat();

	    System.out.println( "Enter limit value: " );
	    limit = scan.nextFloat();
	    
	    System.out.println( "Enter increment value: " );
	    increment =  scan.nextFloat();

	    while ( count <= limit )   // less-than-or-equal operator
	    {
	      System.out.println( "count is: " + count );
	      count = count + increment;
	    }
	    System.out.println( "Done with the loop" );
	    System.out.println( "Because when count was " + count 
	    	    + ", it failed the test.");
	  }
}
