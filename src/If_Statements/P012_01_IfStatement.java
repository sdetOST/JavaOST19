package If_Statements;
import java.util.Scanner;

public class P012_01_IfStatement {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
	    String answer;

	    System.out.print("Is it raining? (Y or N): ");
	    answer =  scan.nextLine();
	    
	    if ( answer.equals("Y"))						// is answer exactly "Y" ?              
	    	System.out.println("Wipers On");			// true branch
	    if ( answer.equals("N"))
	    	System.out.println("Wipers Off");			// true branch
	    else
	    	System.out.println("Be carefull, you suppose to enter capital Y or capital N");	
	    
	  }
}
