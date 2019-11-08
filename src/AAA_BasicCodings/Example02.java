package AAA_BasicCodings;

class Example02 {
	  public static void main ( String[] args )
	  {
	    long   hoursWorked;			// hoursWorked is declared without an initial value    	
	    double payRate, taxRate;    // payRate and taxRate are declared without an initial value
	    
	    hoursWorked = 40; payRate = 12.00; taxRate = 0.08;  // The assignment statements  

	    System.out.println("Hours Worked: " + 
	        hoursWorked );
	    System.out.println("pay Amount  :$ " +
	       (hoursWorked * payRate) );
	    System.out.println("tax Amount  :$ " + 
	       (hoursWorked * payRate * taxRate) );
	  }
}
