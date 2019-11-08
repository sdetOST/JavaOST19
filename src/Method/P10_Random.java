package Method;
import java.util.Random;

public class P10_Random {

	public static void main(String[] args) {
		
		Random xRnGen = new Random();
		int randomNumber = xRnGen.nextInt (6);
		System.out.print("You toss:  " + randomNumber);
	}

}
