package Loop_While;
import java.util.Scanner;
public class P018_01_While_AddNumbers {
	
	public static void main (String[] args ) 
	{
		Scanner scan = new Scanner( System.in );
	    int value;             													// data entered by the user
	    int sum = 0;           													// initialize the sum
	    																		// get the first value
	    System.out.print( "Enter first integer (enter 0 to quit): ");
	    value = scan.nextInt();

	    while ( value != 0 )    
	    {
	    	sum = sum + value;													//add value to sum
	    		    	
	    	System.out.print( "Enter the next integer (enter 0 to quit) : ");
	    	value = scan.nextInt();      										 //get the next value from the user
	    }
	    
	    System.out.println( "\rSum of the integers = " + sum );
	}
}
