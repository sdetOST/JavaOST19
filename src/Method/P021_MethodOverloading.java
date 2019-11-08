package Method;

import java.util.Scanner;

public class P021_MethodOverloading {

	public static void main(String[] args) {
		int a,b,MaxI;
		double c,d,MaxD;

		Scanner input = new Scanner (System.in);
		System.out.println("Please enter two number to find out max ");
//		String message = "Please enter two number to find out max ";
//		prompt (message);
//		String line = null;
//		while (line == null) {
//			line = input.nextLine();
//			try {
//				a = Integer.valueOf(line);
//				break;
//			}			
//			catch (NumberFormatException e) {
//				System.out.println("Expected numeric value! Please try again.");
//				prompt ("Expected numeric value! Please try again.");
//				line = null;
//				prompt(message);
//			}
//		}		
		
		if (input.hasNextInt()) {
			a = input.nextInt();
			if (input.hasNextInt()) {
				b = input.nextInt();
				MaxI  = max (a,b);
				System.out.println("Maxsimum: "+ MaxI);				
			}
			else {	
				d = input.nextDouble();
				c = a;
				MaxD = max(c,d);
				System.out.println("Maxsimum: "+ MaxD);
				}
		}
		else if (input.hasNextDouble()) {
			c = input.nextDouble();
			d = input.nextDouble();
			MaxD = max(c,d);
			System.out.println("Maxsimum: "+ MaxD);

		}
		else {
			System.out.println("Please enter digital form of numbers! ");
		}

	}
	private static void prompt(String message) {
		// TODO Auto-generated method stub
		
	}
	public static int max(int x,int y) {				// max method for integer variables
	int max;
	if(x>y) max = x;
	else max = y;
	return max;	
	}
	public static double max(double x,double y) {		// max method for double variables
	double max;
	if(x>y) max = x;
	else max = y;
	return max;	
	}
}


