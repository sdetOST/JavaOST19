package AAA_BasicCodings;

class RemainderExample01 {
	  public static void main ( String[] args )
	  {
	    int quotient, remainder;

	    quotient  =  17 / 3;
	    remainder =  17 % 3;
	    
	    System.out.println("The quotient : " + quotient );						// 5
	    System.out.println("The remainder: " + remainder );						// 2
	    System.out.println("The original : " + (quotient*3 + remainder) );		// 17
	  }
}
