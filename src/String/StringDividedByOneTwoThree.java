package String;

/*
TASK 1 : 
loop through each character using subString 
and print them out with - in between 
	    
OPTIONALLY : avoid the dash in last character 
	    
Task 2
Print 2 letter at a time compared to one from previous tasks
ABCDEFGHI --> AB CD EF GH I

Print 2 letter at a time compared to one from previous tasks
ABCDEFGH  --> ABc DEF GH
		    
 * 
 */
public class StringDividedByOneTwoThree {

	public static void main(String[] args) {
	    String str = "ABCAA" ;
	    
	    //TASK 1 : 


	    for (int i = 0; i < str.length(); i++) {
	      
	      String eachChar = str.substring(i, i+1) ;
	      
	      if(i!= str.length()-1)
	        System.out.print( eachChar  + "-" );
	      else
	        System.out.print( eachChar) ; 
//	      System.out.print( eachChar + ( (i!= str.length()-1)? "-" : "") ) ;
	      
	      
	    }
	    System.out.println( " ") ; 

// Task 2
// 					  01234567890
		str = "ABCDEFGHIJK";

		for (int i = 0; i < str.length(); i += 2) {

			if (i != str.length() - 1)
				System.out.print(str.substring(i, i + 2) + " ");
			else
				System.out.println(str.substring(i));				//	AB CD EF GH IJ K
		}
		System.out.println();

		for (int i = 0; i < str.length(); i += 3) {

			if (i != str.length() - 2)
				System.out.print(str.substring(i, i + 3) + " ");
			else
				System.out.println(str.substring(i));				//	ABC DEF GHI JK
		}

	}

}