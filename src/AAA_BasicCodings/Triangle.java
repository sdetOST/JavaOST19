package AAA_BasicCodings;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter the lengths of first side");
        x = scan.nextInt();
        System.out.println("Enter the lengths of second side");
        y = scan.nextInt();
        System.out.println("Enter the lengths of third side");
        z = scan.nextInt();


        if (x==y) {
        	if (y==z) System.out.println("This is the regular triangle");
        	else System.out.println("This is the symmetric triangle");
        } 
        else if (x==z) 
        	System.out.println("This is the symmetric triangle");
  
        else if (y==z) 
        	System.out.println("This is the symmetric triangle");

        else
        	System.out.println("This is the irregular triangle");}

}


