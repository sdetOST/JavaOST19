package Method;
/* 
 * there are generally three types of methods: 
 * dump: very simple calculation, no variable changes and no return 
 * clever: can change-update variables but no return.
 * smart: can update variables and able to make return call. 
 */
import java.util.Scanner;

public class P010_MaxMin {

	public static void main(String[] args) {
		int a,b,Max,Min; 
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter two integer to find max an min ");
		a = sc.nextInt();
		b = sc.nextInt();		
		Max = max (a,b);						// calling method max
		Min = min (a,b);						// calling method min

	System.out.println("Maxsimum: "+ Max);
	System.out.println("Minimum: "+ Min);

	}
	public static int max(int x,int y) {
	int max;

	if(x>y) {max = x;}
	else {max = y;}
	return max;
	
	}
	public static int min(int z,int k) {
	int min;

	if(z<k) {min = z;}
	else {min = k;}
	return min;
	}

}
/*
 * Code for current Method call stack : (current method execution order).
 * System.out.println("");
 * StackTraceElement[] stackTraceElement=Thread.currentThread().getStackTrace();
 * for(int i = 1; i<stackTraceElement.length;i++);{
 * System.out.println(stackTraceElement[i].toString() );
 * }
 * System.out.println("");
 */



