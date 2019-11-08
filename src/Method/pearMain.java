package Method;
import java.util.Scanner;

public class pearMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of your first gf here: ");
		String input = sc.next();
		
		pearA pAObject = new pearA();
		pAObject.setName(input);
		pAObject.saying();

	}

}
