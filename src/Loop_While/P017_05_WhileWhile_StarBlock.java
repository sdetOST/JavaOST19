package Loop_While;
import java.util.Scanner;
public class P017_05_WhileWhile_StarBlock { 
	
	public static void main (String[] args ) {
		
		Scanner scan = new Scanner( System.in );
	    int numRows;      // the number of Rows
	    int numStars;     // the number of stars per row
	    int row;          // current row number

	    // collect input data from user
	    System.out.print( "How many Rows? " );
	    numRows = scan.nextInt() ;

	    System.out.print( "How many Stars per Row? " );
	    numStars = scan.nextInt() ;

	    row  =  1;
	    while ( row <= numRows )    
	    {
	      int star = 1;
	      while ( star <= numStars )
	      {
	        System.out.print(" * ");
	        star = star + 1;
	      }
	      System.out.println( row + ". row ");         // do this to end each line

	      row = row + 1;
	    }
	  }
}

