package If_Statements;

import java.util.Scanner;

public class P012_03_Ex03_LastChanceGas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int TankCap, MPG;
		double Gaged;
	    System.out.println("Enter Tank capacity: ");
	    TankCap =  scan.nextInt();
	    System.out.println("Enter Gage reading as percent:");
	    Gaged = scan.nextDouble();
	    System.out.println("Enter Miles per gallon: ");
	    MPG = scan.nextInt();
	    
	    double x = (double)TankCap * Gaged * MPG/100;
	    
	    if (x>=200)
	    	System.out.println("Safe Proceed, You have "+x+" miles range.");
	    
	    else {
	    	if (x>=100)
	    		System.out.println("Not bad, get gas before "+x+" miles range.");
	    	else
	    		System.out.println("Get gas immidiately, your range less than "+x+" miles.");
	    }
	 }
}
