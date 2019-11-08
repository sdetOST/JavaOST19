package akbar;

public class String01 {

	public static void main(String[] args) {
		
		public static void strNew(){

      		String s  = "A";				// 
      		String s1 = "A";				// same
      		String s2 = new String("A");		// new
      		String s3 = new String(s);		// new
      		String s4 = s.concat("");		// same
      		String s5 = s+"";				// new
      
      		System.out.println(s  == s1);   	// T
      		System.out.println(s  == s3);   	// F
      		System.out.println(s1 == s4);		// T
      		System.out.println(s1 == s5);		// F
      		System.out.println(s  == s4);		// T
      		System.out.println(s  == s5);		// F
      		System.out.println(s3 == s4);		// F
      		System.out.println(s3 == s5);		// F
		}
	}

}