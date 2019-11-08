package Loop_While;

import java.util.Scanner;

public class P016_01_While {
	  public static void main (String[] args )  
	  {
	    Scanner scan = new Scanner( System.in );
	    int count, limit, increment;

	    System.out.println( "Enter initial value: " );
	    count = scan.nextInt();

	    System.out.println( "Enter limit value: " );
	    limit = scan.nextInt();
	    
	    System.out.println( "Enter increment value: " );
	    increment = scan.nextInt();

	    while ( count >= limit )   
	    {
	      System.out.println( "count is: " + count );
	      count = count + increment;
	    }
	    System.out.println( "Done with the loop" );
	    System.out.println( "Because when count was " + count 
	    	    + ", it failed the test.");
	  }
}