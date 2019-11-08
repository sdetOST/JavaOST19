package AAA_BasicCodings;
import java.util.Scanner;
public class Log010_01 {
	  
	static Scanner scan;
    public static void main (String[] args) {
    	
    	scan = new Scanner( System.in );
    	int x;
    	double y;	 
    	
    	System.out.print("Enter a integer number1:");    	
		x = scan.nextInt();
    	
		System.out.print("Enter a double number2:");
    	y = scan.nextDouble();

    	System.out.println("Natural Log of number1= " + Math.log(x));
    	System.out.println("Natural Log of number2= " + Math.log(y));
    
  }
}
