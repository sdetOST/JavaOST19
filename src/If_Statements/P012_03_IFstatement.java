package If_Statements;
import java.util.Scanner;

public class P012_03_IFstatement {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
	    double number;

	    System.out.println("Enter a number : ");
	    number =  scan.nextDouble();
	    
	    if (number<0) {																// true-branch
	    	System.out.println("The number is negative.");
	    	System.out.println("Negative numbers are less than zero.");		
	    }
	    else {																		// false-branch
	    	
	    	if (number>0) {																	// nested true-branch
	    		System.out.println("The number is positive.");
	    		System.out.println("Positive numbers are greater than zero.");
	    	}
	    	else {																			// nested false-branch
	    		System.out.println("The number is neighter positive nor negative.");
	    		System.out.println("The number is 0");
	    	}
	    		
	    }
	}
}

