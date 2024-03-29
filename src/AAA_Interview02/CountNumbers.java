package CyberInterviewQ;
/*
 * TASK:
� Read 10 numbers from the console entered by the user and print
the sum of those numbers.
� Create a Scanner
� Use the hasNextInt() method from the scanner to check if the user
has entered an int value.
� If hasNextInt() returns false, print the message Invalid Number.
Continue reading until you have read 10 numbers.
� Use the nextInt() method to get the number and add it to the sum.
� Before the user enters each number, print the message "Enter
number #x:" where x represents the count,
i.e. 1, 2, 3, 4, etc.
� For example, the first message printed to the user would be "Enter
number #1:", the next "Enter number #2: ", and so on.
Hint:
� Use a while loop.
� Use a counter variable for counting valid numbers.
� Close the scanner after you don't need it anymore.
 */
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System . in );
		int sum = 0 ;
		int counter = 1 ;
		
		while (counter < 11 ) {
			System . out . println ( "Enter your number"+ counter);
			boolean bool = scanner . hasNextInt ();
			if (bool) {
				int number = scanner.nextInt();
				sum = sum + number;
				counter ++ ;
			} else {
				System.out.println( "Invalid Number" );
				
			}
			scanner . nextLine ();
		}
		System.out.println ( "Your total is: " + sum);
		scanner.close ();
		
		countNumbers();
		int[] a = new int[] {1,1,1,1,1,1,1,2,1,1};
		countNumbersArrayList(a);
		
		
	}
	
	public static void countNumbers() {
		Scanner scanner = new Scanner ( System . in );
		int sum = 0 ;
		int counter = 1 ;
		
		while (counter < 11 ) {
			System . out . println ( "Enter your number"+ counter);
			boolean bool = scanner . hasNextInt ();
			if (bool) {
				int number = scanner.nextInt();
				sum = sum + number;
				counter ++ ;
			} else {
				System.out.println( "Invalid Number" );
				
			}
			scanner . nextLine ();
		}
		System.out.println ( "Your total is: " + sum);
		scanner.close ();
	}
	
	public static int countNumbersArrayList(int[] numbers) {
		
		int sum = 0 ;
		for( int i =0; i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		System.out.println ( "Your total is: " + sum);
		return sum;
	}

	
		
	

}
