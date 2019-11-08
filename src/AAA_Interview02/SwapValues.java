package a01;

public class SwapValues {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		
// a = b + (b=a) - a; best choice 
		
		int c=a^b;  //  2^5=7
		int d=b^a;  //  5^2=7
		
		System.out.println(c+ "-" + d);
				//      a b
//		a = a^b;    //  a = 2^5 
//		b = a^b;	//  b = 2^5^5 
//		a = a^b;	//  a = 2^5^2^5^5 

//			//#3
//			a = b + (b=a) - a;
//		////5 = 5 + (b=2) - 2;

//			//#1
//			int temp;
//			
//			temp=a;
//			a=b;
//			b=temp;

		// #2
//			a = a+b;
//			b = a-b;
//			a = a-b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

//			
//			//a += b - (b-a);
//			a = b+ (b=a) - a;
//		////5 = 5+ (b=2) - 2;
//			System.out.println(a);
//			System.out.println(b);
//			
	//

}


