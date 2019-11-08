package String;
/*
 * String is an object and it will created in HEAP not in STAC
 * 
 * 
 */
public class StringPool {

	public static void main(String[] args) {
		
		String x = "a";								// in pool	
		String y = x.concat("b");					// out of the pool
		String z = "ab";							// in pool
		
		System.out.println(z==y);					// false
						
//--------------------------------------------------------------------------------	
		String s1 = "Hello";						// in pool		
		String s2 = "Hel"+"lo";						// in pool	
		
		String s = "lo";
		String s3 = new String ("Hello");
		String s4= "Hel"+ s;
		 
//		System.out.println(s1==s2);						// true
//
//		System.out.println(s1==s3);						// false
//		System.out.println(s1==s4);						// false
//		System.out.println(s2==s3);						// false
//		System.out.println(s2==s4);						// false
//		
//		System.out.println(s3==s4);						// false
//---------------------------------------------------------------------------------		
		System.out.println(z.equals(y));				// true
		
		System.out.println(s1.equals(s2));				// true
		
		System.out.println(s1.equals(s3));				// true
		System.out.println(s1.equals(s4));				// true
		System.out.println(s2.equals(s3));				// true
		System.out.println(s2.equals(s4));				// true

		System.out.println(s3.equals(s4));				// true
		//---------------------------------------------------------------------------------			
	}

}
