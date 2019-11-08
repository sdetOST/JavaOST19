package Loop_For;

import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
		String stars =" * ";
		System.out.print("How many line of stars you would like to have?: ");
		n = sc.nextInt();
		
		while ( i < n) {
			
			System.out.println(stars);			
			stars = stars + " * ";
			i++;
	 	
	}
  }
}