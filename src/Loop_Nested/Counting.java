package Loop_Nested;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		
		int start,end;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number: ");
		start = sc.nextInt();
		System.out.print("Enter the end number: ");
		end = sc.nextInt();
		
		if (start>end) {
			System.out.println("Please change the range");
			
		}
		System.out.println("The range from "+start+" to "+end+" is: ");
		while (start <= end ) {
			System.out.print(start+", ");
			start++;
			
		}
			while (!sc.hasNextInt()) {
				System.out.println("Enter a whole number idiot:");
				sc.next();
			}
	}
}