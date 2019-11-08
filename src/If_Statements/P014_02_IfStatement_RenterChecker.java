package If_Statements;
import java.util.Scanner;
public class P014_02_IfStatement_RenterChecker {

	public static void main(String[] args) {
	    														
	    Scanner scan = new Scanner( System.in ); 				// Declare a Scanner and two integer variables
	    int age, credit; 

	    System.out.println("How old are you?");					// get the age of the renter
	    age = scan.nextInt() ; 
	    
	    System.out.println("How much credit do you have?");		// get the credit line
	    credit = scan.nextInt() ; 

	    
	    if ( age >= 21 && credit >= 10000)						// check that both qualifications are met
	      System.out.println("Enough to rent this car!" );
	    else
	      System.out.println("Have you considered a bicycle?" );
	}

}