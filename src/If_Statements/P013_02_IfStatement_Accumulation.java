package If_Statements;
import java.util.Scanner;

public class P013_02_IfStatement_Accumulation {

	public static void main(String[] args) {
		
		final int basePrice  = 20000;   				// base price in dollars
	    final int pinPrice   =   250;   				// pin stripe price
	    final int brakePrice =   800;   				// anti-lock brake price

	    Scanner scan = new Scanner( System.in );
	 
	    int answer;
	    int totalCost = basePrice;
	    
	    System.out.println("Car base price = $" + basePrice);
	    

	    System.out.println("Pin stripe addition = $" + pinPrice + " - Do you want pin stripes (0 or 1)?");
	    answer = scan.nextInt(); 	    
	    if (answer == 1) {
	    	
	    	totalCost = totalCost + pinPrice;
	    }
	    
	    System.out.println("Anti-lock brake addition = $" + brakePrice +" - Do you want anti-lock brakes (0 or 1)?");
	    answer = scan.nextInt(); 
	    if ( answer == 1){
	    	
	    	totalCost = totalCost + brakePrice;
	    }

	    System.out.println("Total cost is: $" + totalCost ); 
	}
}
