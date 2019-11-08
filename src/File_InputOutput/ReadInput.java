package File_InputOutput;
import java.util.Scanner;

public class ReadInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name ="";
		System.out.print("Enter your name:");
		name = sc.nextLine();
		System.out.println("Your name:" + name);
		sc.close();
	}

}
