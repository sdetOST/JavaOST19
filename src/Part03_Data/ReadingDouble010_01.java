package Part03_Data;
import java.util.Scanner;

public class ReadingDouble010_01 {
	public static Scanner scan;
	public static void main (String[] args) { 
				
	    scan = new Scanner( System.in );
	    
	    double x,y;	
	    int a,b;
	    System.out.print("Enter number1:");
	    x = scan.nextDouble();
	    System.out.print("Enter number2:");
	    y = scan.nextDouble();
	    a = (int) x;
	    b = (int) y;
	    
	    System.out.println("as of double numbers (Number1/Number2) = " + (x/y));	// Exmp: (Number1=1)/(Number2=2) = 0.5
	    System.out.println("as of Integers (Number1/Number2) = " + (a/b));			// Exmp: (Number1=1)/(Number2=2) = 0
	    
	    /*
	    double sqrRoot_x = Mathh.sqrt( x );
	    double log_x = Mathh.log(x);
	    

	    System.out.println("Number= " + x +", Square Root of " + x + " = " + sqrRoot_x + ", Square of " + x + " = "+ x*x );
	    System.out.println("Natural Logarithm of " + x + " = " + log_x ); 
	    
	    */
	    
	    
	  }
}
