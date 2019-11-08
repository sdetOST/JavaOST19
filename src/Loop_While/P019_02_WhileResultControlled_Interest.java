package Loop_While;
import java.util.Scanner;
public class P019_02_WhileResultControlled_Interest {
	  public static void main( String[] args )
	  {
		  Scanner scan = new Scanner( System.in );
		  double dollars,interestrate,ExtraMony ;
		  int totalyear, year = 1;  
		  
		  System.out.print( "Enter the initial mony on account :" );
		  dollars = scan.nextDouble();
		  
		  System.out.print( "Enter the yearly interest rate as % :" );
		  interestrate = scan.nextDouble()/100.0;
		
		  System.out.print( "Enter the total year :");
		  totalyear = scan.nextInt();
		  
		  System.out.print( "Enter the extra mony you can deposit every year :");
		  ExtraMony = scan.nextDouble();
		  
		  while ( year <= totalyear ) { 
			  
			  dollars = dollars + dollars*interestrate; 
			  dollars = dollars + ExtraMony;
			  year    = year + 1;
		  }
		  
		  System.out.println("After "+totalyear+" years at " + (interestrate*100) + "% interest you will have " 
				  				+ dollars + " dollars on your account" );
	  }
}