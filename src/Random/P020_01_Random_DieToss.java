package Random;

import java.util.Random;
import java.util.Scanner;

public class P020_01_Random_DieToss {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//
//		while (true) {
//			System.out.print("You toss a " + (rand.nextInt(6) + 1));
//			String line = scan.nextLine();
//		}
		
		System.out.print(random(10));
		System.out.print(randomNum(10));
		System.out.print(randomDecimal(99));
	
	}
	
	public static int randomInt(int max) {
		Random rand = new Random();
		return (rand.nextInt(max) + 1);

	}
	
	public static double randomDecimal(int max) {
		Random rand = new Random();
		return max*(rand.nextDouble());
	}
	
	public static int  randomInt(int min, int max) {

		Random rand = new Random();
		return (rand.nextInt(max) + 1);

	}
		return d;

	}

}
