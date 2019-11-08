package If_Statements;

import java.util.Scanner;

public class P014_03_IfStatement_OR {

	public static void main(String[] args) {
	    														
	    Scanner scan = new Scanner( System.in ); 
	    int cash, credit, total ; 

	    
	    System.out.println("How much cash you have available? ");		// get the cash
	    cash = scan.nextInt() ; 
	   
	    System.out.println("How much credit limit you have? ");		// get the credit line
	    credit = scan.nextInt() ; 
	    
	    total = cash + credit;
	    
	    if ( cash >= 25000  ||  credit >= 25000 || total>=30000)		// check that at least one qualification is met
	      System.out.println("Enough to buy this car!" );
	    else
	      System.out.println("What about a Yugo?" );
	}
}
