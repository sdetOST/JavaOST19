package Part03_Data;

public class Substring9C01 {
	
	public static void main ( String[] args ) {
		
		String str = new String( "Golf is a good walk spoiled." );		// create the original object

	    String sub = str.substring(16); 								//create a new object from the original
	   	
		CharSequence squ = str.subSequence(1,12);
	    
	    System.out.println( str );							// Golf is a good walk spoiled.
	    System.out.println( str.length());					// 28
	    System.out.println( squ );							// olf is a go									"1st to 11th"
	    System.out.println( sub );							// alk spoiled.									"17st to 28th"
	    System.out.println( str.concat(" Mark Twain"));		// Golf is a good walk spoiled. Mark Twain
	    System.out.println( str.concat((String) squ));		// Golf is a good walk spoiled.olf is a go
	    System.out.println( str.equals(sub));				// false									 		???
	    System.out.println( str.toUpperCase());				// GOLF IS A GOOD WALK SPOILED.
	    System.out.println( str.toLowerCase());				// golf is a good walk spoiled.
	    System.out.println( str.trim());					// Golf is a good walk spoiled.
	   
	  }
}
