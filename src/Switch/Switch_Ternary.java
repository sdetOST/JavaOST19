package Switch;

import java.util.Scanner;

public class Switch_Ternary {

	public static void main(String[] args) {
		String weather, weather1, weather2;
		int temperature;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the wether: sunny, cloudy, rainy");
		weather = scan.nextLine();
		System.out.println("Enter the temperature");
		temperature = scan.nextInt();
		weather1 = weather.toLowerCase(); // we can make not case sensitive
		weather2 = weather1.trim(); // We can trim it too

		switch (weather2) {
		case "sunny":
			String x = (temperature >= 80) ? "Good day for swimming" : "Do some BQ at your backyard";
			System.out.println(x);
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
