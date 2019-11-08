package Method_WithParameters;
import java.util.Scanner;

public class orangeMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = sc.next();
		
		orange orangeObject = new orange ();
		orangeObject.simpleMessage(name);	
		
	}

}