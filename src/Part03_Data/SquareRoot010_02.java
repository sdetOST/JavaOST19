package Part03_Data;
import java.util.Scanner;

public class SquareRoot010_02 {
	
	public static Scanner scan;
	public static void main (String[] args) { 
				
	    scan = new Scanner( System.in );
	    int a = 1;
	    int b = 2;
	    System.out.println("The formula of :");
	    System.out.println("Mathh.sqrt((double)x/y) gives correct result when {x,y integers and |x|<|y|}, Forexample sqrt(1/2)= " + Math.sqrt((double)a/b));
	    System.out.println("But ;");
	    System.out.println("Mathh.sqrt(x/y)] gives always 0 as a result when {x,y integers and |x|<|y|}, Forexample sqrt(1/2) != " + Math.sqrt(a/b) );
	    System.out.println(" ");
	    System.out.println("You try it yourself");
	    int x,y;	 
	    System.out.print("Enter number1:");
	    x = scan.nextInt();
	    System.out.print("Enter number2:");
	    y = scan.nextInt();

	    System.out.println("Square root of (" +x+")/("+y+") = " + Math.sqrt((double)x/y) + "  -> using the double correction in the formula");
	    System.out.println("Square root of (" +x+")/("+y+") =? " + Math.sqrt(x/y) + "  -> not using the double correction in the formula");
	  }
}
