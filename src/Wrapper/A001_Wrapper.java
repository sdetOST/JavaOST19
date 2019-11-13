package Wrapper;


public class A001_Wrapper {
	public static void main(String[] args) {
		
		int a = 5;							// Primitive data type
		Integer b = new Integer(a);			// Boxing - Wrapping
		Integer c = a;						// AutoBoxing
		
		int d = b.intValue();				// unBoxing - unWrapping
		int e = (Integer) b;				// unBoxing - unWrapping
		
	}
	
}


