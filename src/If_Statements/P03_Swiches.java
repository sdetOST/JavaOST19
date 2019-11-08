package If_Statements;

import java.util.Scanner;

public class P03_Swiches {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i = 0;
		while( i >=0 ) {
		System.out.println("Enter a number 1 through 7");
		int day = sc.nextInt();
		
		switch (day){
			case 1:
				System.out.println("The corresponded day is Sunday");
				break;
			case 2:
				System.out.println("The corresponded day is Monday");
				break;	
			case 3:
				System.out.println("The corresponded day is Tuesday");
				break;
			case 4:
				System.out.println("The corresponded day is Wednesday");
				break;
			case 5:
				System.out.println("The corresponded day is Thurusday");
				break;
			case 6:
				System.out.println("The corresponded day is Friday");
				break;
			case 7:
				System.out.println("The corresponded day is Saturday");
				break;
			default:
				System.out.println("Please enter a number 1 through 7");
		}
		System.out.println("-------------------------------------");
		i++;
		}
System.out.println("-------------------------------------");
/*
		Scanner scc = new Scanner (System.in);
		int dayy = scc.nextInt();

		switch (dayy){
			case 1: case 2: case 3:
				System.out.println("Sunday - Monday - Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thurusday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Number needs to be 1 thtough 7");
*/		
		}
	}

