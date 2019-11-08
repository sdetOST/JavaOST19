package Switch;
import java.util.Scanner;
public class SwichWithString01 {

	private static Scanner scan;

	public static void main(String[] args) {

        scan = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String name = scan.next ();
        switch (name) {
            case "homer":
                System.out.println("Homar Akin");
                break;
            case "adam":
                System.out.println("Adam Turner");
                break;
            case "alex":
                System.out.println("Alex Sunders");
                break;
            default:
                System.out.println("The person doesn't exist");

        }
    }
}