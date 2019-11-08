package Loop_While;

public class P015_02_While {

	public static void main(String[] args) {
	    
	    int count = 1;									// start count out at one   
	    int y;
	          
	    while ( count++ <= 3 ) {						// count++ = 1 <= 3 ,  count++ = 2 <= 3 ,   count++ = 3 <= 3
	    	
	    	y = count - 1;								// y =(count=2)-1 = 1 , y=(count=3)-1 = 2 ,  y=(count=4)-1 = 3
	    	
	    	System.out.println( "count is:" + y );
	    }
	    
	    System.out.println( "Done with the loop" );
	}

}
