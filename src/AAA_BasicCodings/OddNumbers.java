package AAA_BasicCodings;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x =scn.nextInt();
		
		for (int i = 0; i < x; i++) {
			if (i%2!=0) System.out.print(i+",");
			
		}
	}



}
