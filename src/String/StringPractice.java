package String;

public class StringPractice {

	public static void main(String[] args) {
					//0123456789
		String str = "JOB hunTER" ; 
//		System.out.println(str.length());
//		System.out.println(str.charAt(4));	
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
		
		//subStr
		//System.out.println( str.substring(6,9) );
		/// get nTE
		
		// task1 : extract "JOb" from the string 
		System.out.println( str.substring(0,2) +  str.substring(2,3).toLowerCase());  // JOb
		
		// task2 : extract "HUNTER" from the String
		System.out.println( str.substring(4,10).toUpperCase());		// HUNTER
		
		System.out.println(str.substring(5));						// unTER
		
		System.out.println(str.substring(5).toLowerCase());			// unter
		
		System.out.println(str.substring(5).toUpperCase());			// UNTER
		
		
		
		
		

	}

}
