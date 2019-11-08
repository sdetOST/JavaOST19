package AAA_BasicCodings;

import java.util.Scanner;

public class RestaurantBill010_01 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner( System.in );
		double basicCost, tipPercent;
		
		System.out.print("Enter the basic cost: ");
		basicCost = scan.nextDouble();
		System.out.print("Enter the tip percentage: ");
		tipPercent = scan.nextDouble();

		System.out.println("basic cost: " +  basicCost + " total cost: " + 
         (basicCost + basicCost*0.06 + basicCost*tipPercent) );
  }
}
