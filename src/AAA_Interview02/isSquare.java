package akbar;

public class isSquare {
	 public static boolean isSquare(int[][] arr) {    
		    /// CHECK ONE THING THAT DOES NOT MEET THE REQUIREMENT 
		      // IF SO RETURN FALSE 
		    int twoDarrLength = arr.length ; 
		    for (int[] each1DArray : arr) {
		      
		      if( each1DArray.length !=  twoDarrLength )
		        return false ; 
		      
		    }
		    System.out.println(" THIS IS A SQUARE ! DID NOT FIND NO MATCH !!!");
		    return true ; 
		  }
		  
		  public static void main(String[] args) {
		    // two dimensional array store one dimensional array as per item 
		    int[][] data = {  
		              {1,4} , 
		              {8,9}  
		            } ; 
		    System.out.println(isSquare(data) ); 
		  
		  }


}
