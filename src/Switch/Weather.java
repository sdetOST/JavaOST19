package Switch;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		String weather, weather1, weather2;
		int temperature;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the wether: sunny, windy, rainy, snowy");
		weather = scan.nextLine();
		System.out.println("Enter the temperature");
		temperature = scan.nextInt();
		weather1 = weather.toLowerCase(); // we can make it case insensitive
		weather2 = weather1.trim(); // We can trim it too

		switch (weather2) {
		case "sunny":
			if (temperature >= 80){
				System.out.println("Good day for swimming");
			
			}else 
				System.out.println("Do some BQ at your backyard");
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
