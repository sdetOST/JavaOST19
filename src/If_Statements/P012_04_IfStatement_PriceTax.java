package If_Statements;

import java.util.Scanner;

public class P012_04_IfStatement_PriceTax {
	
	public static void main (String[] args) {
	
	final double taxRate = 0.05;
    double price;
    double tax ;
    
    Scanner scan = new Scanner( System.in );
    
    System.out.println("Enter the price:");
    price  = scan.nextDouble();     

    if ( price >= 100.0  )
      tax = price * taxRate;   
    else
      tax = 0.0;

    System.out.println("Item cost: " + price + " , Tax: " + tax + " , Total: " + (price+tax) );    
  }
}
