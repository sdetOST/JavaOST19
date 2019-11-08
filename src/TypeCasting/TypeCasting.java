package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		// IMPLICIT CASTING:		byte > short > int > > long > float > double
		int k = 25;
		double d = 200;			// no problem ( double is larger than int )
		long l = k;					// no problem ( long is larger than int)
		
		
		// EXPLICIT CASTING:
//!		int a = 3.9;				// not ok because (int is smaller than double)
		int i = (int)3.9;			// so 3.9 (double) is casted to int
		System.out.println(i);		//  i = 3 ( lost 0.9)
		
		double d2 = 200.00;
//!		long l1 = d2;				// not ok because (long is smaller than double)
		long l1 = (long)d2;			// now okay because d1 casted 
		System.out.println(d2);		// d2 = 200.00
		
		
		byte b1 = 5;				 
		short sh1 = 400;
//!		b1 = sh1; 
		b1 = (byte)sh1;
		System.out.println(b1);
		
		
		
	}

}
