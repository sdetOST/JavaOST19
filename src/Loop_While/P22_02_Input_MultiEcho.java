package Loop_While;
import java.util.Scanner;
public class P22_02_Input_MultiEcho {
	  public static void main ( String[] args ) 
	  {
	    String line;
	    Scanner scan = new Scanner( System.in );
	 
	    int count = 1;
	    while ( count <= 5 )
	    { 
	      System.out.println("Enter line" + count + ": ");
	      line = scan.nextLine();
	      System.out.println( "You typed: " + line );
	      count = count + 1;
	    }
	  }
}