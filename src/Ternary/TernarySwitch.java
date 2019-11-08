package Ternary;

import java.util.Scanner;

public class TernarySwitch {

	public static void main(String[] args) {
		String weather,weather1,weather2;
		int temperature;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the wether: sunny, windy, rainy, snowy");
		weather = scan.nextLine();
		System.out.println("Enter the temperature");
		temperature = scan.nextInt();
		weather1 = weather.toLowerCase(); 				// we can make case insensitive
		weather2 = weather1.trim(); 					// We can trim it too

		switch (weather2) {
		case "sunny":
			String temp = (temperature >= 80) ? "Good day for swimming" : "Do some BQ at your backyard";
			System.out.println(temp);
			break;
		case "windy":
			System.out.println("Go fly a kite or plane");
			break;
		case "rainy":
			System.out.println("Stay home");
			break;
		case "snowy":
			System.out.println("How about snowboarding");
			break;
		default:
			System.out.println("Invalid weather entery!");
			break;
		}
	}
}
