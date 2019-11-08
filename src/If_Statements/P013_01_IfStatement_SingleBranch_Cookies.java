package If_Statements;

import java.util.Scanner;

public class P013_01_IfStatement_SingleBranch_Cookies {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
	    int hunger, look, smell;

	    System.out.println("How hungry are you? Select 1 to 10:");
	    hunger =  scan.nextInt();
	    System.out.println("How nice do the cookies look? Select 1 to 10:");
	    look = scan.nextInt();
	    System.out.println("How nice do the cookies smell? Select 1 to 10:");
	    smell = scan.nextInt();
	    
	    if ( (hunger + look + smell ) > 18 )
	        
	    	System.out.println("Buy cookies!"  );

	    System.out.println("Than continue down the Mall.");
	}
}

