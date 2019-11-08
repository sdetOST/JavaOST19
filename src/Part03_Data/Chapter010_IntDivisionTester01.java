package Part03_Data;

import java.util.Scanner;

public class Chapter010_IntDivisionTester01 {
	public static void main (String[] args) { 
		
		Scanner scan = new Scanner( System.in );
	 
	    int dividend, divisor ;                      // int versions of input
	    int quotient, remainder ;                    // results of "/" and "%"

	    System.out.println("Enter the dividend:");   // read the dividend
	    dividend = scan.nextInt();          

	    System.out.println("Enter the divisor:");    // read the divisor
	    divisor  = scan.nextInt();          

	    quotient = dividend / divisor ;              // perform int math
	    remainder= dividend % divisor ;

	    System.out.println( dividend + " / " + divisor + " is " + quotient + " : "+"There are "+quotient+" of "+divisor+" exist in "+dividend);
	    System.out.println( dividend + " % " + divisor + " is " + remainder + ": The reminder of the division is "+ remainder);
	    System.out.println("Therefore :");
	    System.out.println( quotient + " * " + divisor + 
	        " + " + remainder + " is equal to " + (quotient*divisor+remainder) );
	  }
}
