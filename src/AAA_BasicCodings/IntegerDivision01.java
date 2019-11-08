package AAA_BasicCodings;

class IntegerDivision01 {
	  public static void main ( String[] args ) {
		  
		  System.out.println("The result is: " + (1/2 + 1/2) );			// 0
		  System.out.println("The result is: " + (1.0/2 + 1/2) );		// 0.5
		  System.out.println("The result is: " + (1/2 + 1/2.0) );		// 0.5
		  System.out.println("The result is: " + (1.0/2.0 + 1.0/2.0));	// 1.0
		  System.out.println("The result is: " + (1.0/2 + 1.0/2) );		// 1.0
		  System.out.println("The result is: " + (1/2.0 + 1/2.0) );		// 1.0
		  System.out.println("The result is: " + (0.5 + 0.5) );			// 1.0
	  }
}