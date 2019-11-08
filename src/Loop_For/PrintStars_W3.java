package Loop_For;

import java.util.Scanner;

public class PrintStars_W3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = 0;
		
		String stars =" * ";

		System.out.print("How many line of stars you would like to have?: ");
		n = sc.nextInt();
		
		for (int y = 1; y <= n; y++) {
			for(int b=n-y; b>0; b--) {
				System.out.print("  ");
			}
			System.out.println(stars);
			stars = " *"+ stars + "* ";
		}
		for (int f=1; f<n; f++) {
			for(int k=0; k<=n; k++) {
				System.out.print(" ");
				}
			for (int h=2; h<n; h++) {
				System.out.print(" *");
				}
			System.out.println("");
			} 			
		}
}


