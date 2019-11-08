package Part03_Data;
import java.util.Scanner;

public class SquareRoot010_01 {
	
	public static Scanner scan;
	public static void main (String[] args) { 
				
	    scan = new Scanner( System.in );
	    
	    double x,y;	 
	    System.out.print("Enter number1:");
	    x = scan.nextDouble();
	    System.out.print("Enter number2:");
	    y = scan.nextDouble();

	    System.out.println("Square root of (Number1/Number2) = " + Math.sqrt(x/y));
	    
	  }
}
