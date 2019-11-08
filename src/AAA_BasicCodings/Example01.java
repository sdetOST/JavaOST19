package AAA_BasicCodings;

class Example01
{
  public static void main ( String[] args )
  {
    long   hoursWorked = 40;    
    double payRate = 12.00, 
           taxRate = 0.08;    

    System.out.println("Hours Worked: " + 
        hoursWorked );
    System.out.println("pay Amount  :$ " +
       (hoursWorked * payRate) );
    System.out.println("tax Amount  :$ " + 
       (hoursWorked * payRate * taxRate) );
  }
}