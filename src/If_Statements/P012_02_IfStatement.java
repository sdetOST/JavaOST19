package If_Statements;
import java.util.Scanner;

public class P012_02_IfStatement {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
	    double number;

	    System.out.print("Enter a number : ");
	    number =  scan.nextDouble();
	    
	    if (number<0)												             
	    {
	    	System.out.println("The number is negative.");
	    	System.out.println("Negative numbers are less than zero.");		
	    }
	    if (number>0)
	    {	
	    	System.out.println("The number is positive.");
	    	System.out.println("Positive numbers are greater than zero.");		
	    }
	    if (number==0)
	    {
	    	System.out.println("The number is neighter positive nor negative.");
	    	System.out.println("The number is 0");
	    }
	    System.out.println("Goodbye for now");

	    
	  }
}
