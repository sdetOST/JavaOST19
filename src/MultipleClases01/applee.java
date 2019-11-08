package MultipleClases01;
import java.util.Scanner;

class applee {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		tunaa tunaObject = new tunaa();
		System.out.println("Enter the name of your first gf here:");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		
	}

}
