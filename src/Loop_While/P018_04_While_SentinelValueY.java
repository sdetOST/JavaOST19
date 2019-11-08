package Loop_While;
import java.util.Scanner;

public class P018_04_While_SentinelValueY {
	
	public static void main (String[] args )  {
		
		Scanner scan = new Scanner( System.in );
		int x, y, z;
		String response = "y";
		
		while (response.equals ("y") ) {
			
			System.out.print( "Enter the x value :" );
			x = scan.nextInt();
		
			System.out.print( "Enter the y value :" );
			y = scan.nextInt();
		
			System.out.println( "Sum of x,y : " + (x+y) +"\n" );
			
			System.out.println("\rcontinue (y or n)?");
		    response = scan.next();
		}
	}
}
