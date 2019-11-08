package AAA_BasicCodings;
import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 value");
        double[] prices = new double[5];
        prices[0]= in.nextDouble();
        prices[1]= in.nextDouble();
        prices[2]= in.nextDouble();
        prices[3]= in.nextDouble();
        prices[4]= in.nextDouble();
        double total = prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
        System.out.printf("The Total values of all items is $ "+ total);

    }
}

