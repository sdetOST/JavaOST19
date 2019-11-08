package Method;

import java.util.Scanner;

public class P020_MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(Add(1,36));
		System.out.println(Add(1.48,36.45));
		System.out.println(Add("Hello ","world"));
	}
		
		public static int Add (int x, int y){
			return(x+y);
		}
		public static double Add (double x, double y){
			return(x+y);
		}
		public static String Add (String x, String y){
			return(x+y);
		}
		
		
		
//		double c,d,MaxDouble;
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Please enter two number to find out max ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc. nextDouble();
//		d = sc.nextDouble();
//		Max = max (a,b);
//		MaxDouble = max(c,d);				// calling method max
//							
//
//	System.out.println("Maxsimum: "+ Max);
//	System.out.println("Maxsimum: "+ MaxDouble);
//
//	}
//	public int max(int x,int y) {				// max method for integer variables
//	int max;
//	if(x>y) max = x;
//	else max = y;
//	return max;	
//	}
//	public double max(double x,double y) {		// max method for double variables
//	double max;
//	if(x>y) max = x;
//	else max = y;
//	return max;	
//	}

}
