package Loop_Nested;

import java.util.Scanner;

public class InterestRate_WhileInWhile {
	  public static void main( String[] args ){
		  
		  Scanner scan = new Scanner( System.in );
		  double InnitialMony,dollar=0,rate=0.00,ExtraMony,GoalMony ;
		  int totalyear; 
		  
		  System.out.print( "Enter the initial mony on account :" );
		  InnitialMony = scan.nextDouble();
		  
		  System.out.print( "Enter the Goal mony: " );
		  GoalMony = scan.nextDouble();
		
		  System.out.print( "Enter the total year :");
		  totalyear = scan.nextInt();
		  
		  System.out.print( "Enter the extra mony you can deposit every year :");
		  ExtraMony = scan.nextDouble();
		  
		  while ( dollar <= GoalMony ) { 
			  
			  rate = rate + 0.001;
			  int year = 1;
			  dollar = InnitialMony;
			  
			  while ( year <= totalyear) {
				  
				  dollar = dollar + dollar*rate; 
				  dollar = dollar + ExtraMony;
				  year    = year + 1;
			  }	
			  
		  }
		  
		  System.out.println("After "+totalyear+" years at " + (rate*100) + " % interest you will have " 
				  				+ dollar + " dollars on your account" );
	  }
}
