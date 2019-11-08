package Exception;

import java.util.Scanner;

public class Exception_190622 {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number one:");
		int a = scn.nextInt();
		System.out.println("Enter number two:");
		int b = scn.nextInt();
		
			
			double c = arr[a]/b;
			System.out.println(c);
		
		

	}// a=4 :   ArithmeticException: / by zero     b=0: ArrayIndexOutOfBoundsException

}
