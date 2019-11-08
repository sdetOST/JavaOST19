package Loop_While;			// Result-controlled Loops //
import java.util.Scanner;
public class P019_01_WhileResultControlled_Interest {
	  public static void main( String[] args )
	  {
		  Scanner scan = new Scanner( System.in );
		  double dollars,GoalMony,interest,ExtraMony ;
		  int year = 1;  
		  
		  System.out.print( "Enter the initial mony on account :" );
		  dollars = scan.nextDouble();
		  
		  System.out.print( "Enter the yearly interest rate as % :" );
		  interest = scan.nextDouble();
		
		  System.out.print( "Enter the goal mony :");
		  GoalMony = scan.nextDouble();
		  
		  System.out.print( "Enter the extra mony you can deposit every year :");
		  ExtraMony = scan.nextDouble();
		  
		  while ( dollars < GoalMony ) { 
			  
			  dollars = dollars + dollars*interest/100; 
			  dollars = dollars + ExtraMony;
			  year    = year + 1;
		  }
		  
		  System.out.println("It took " + year + " years to reach your goal.");
	  }
}