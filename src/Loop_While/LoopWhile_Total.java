package Loop_While;
import java.util.Scanner;

public class LoopWhile_Total {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int total = 0;
		double k = 1.0;
		double average;
		int number;
		
		while ( k >= 1 ) {
		System.out.println("Enter a number");
		number = scn.nextInt();
		total = total + number;
		average = total / k;
		System.out.println("Total: "+ total);
		System.out.println("Average: "+ average);
		k++;	
		}
		
//System.out.println("-----------------------------");
//		int num = -2;
//		do {
//			System.out.print(num+", ");
//			num++;
//		}while(num <= 5);
	}

}
