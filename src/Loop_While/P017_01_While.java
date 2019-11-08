package Loop_While;

import java.util.Scanner;

public class P017_01_While {
	  public static void main (String[] args ) {
		  
		  Scanner scan = new Scanner( System.in );
		  
		  int sums = 0;
		  int i ;
		  int N ;
		  int x ;
		  
		  System.out.println( "Enter initial value: " );
		  i = scan.nextInt();
		  x = i;
		  
		  System.out.println( "Enter the limit value; N : " );
		  N = scan.nextInt();
		  
		  while ( i <= N )  {
			  sums = sums + i;
			  i = i + 1;
		 					  
		  }
		  
		  System.out.println( "Sums from "+ x + " to "+ N + " is  : "+ sums);
	  }
}
