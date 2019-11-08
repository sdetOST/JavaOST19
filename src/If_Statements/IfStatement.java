package If_Statements;
import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
//		String validUserName = "john21";
//		String userName; 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter user name:");
//		userName = scan.next();
//		
//		if(userName.equals(validUserName)) {
//			System.out.println("Access granted. \nWelcome agent "+ validUserName);
//		}else 
//			System.out.println("Mismatch user name!");
//System.out.println("-------------------------------");
		
		String validUserName = "john";
		String validPswd = "123";
		String userName;
		String password;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name and password:");
		userName = scan.next();
		password = scan.next();
		
		if(userName.equals(validUserName) && password.contentEquals(validPswd)) {
			System.out.println("Access granted. \nWelcome agent "+ validUserName);
		}else 
			System.out.println("Access denied. \nMismatch user name or password!");
System.out.println("-------------------------------");
		
//		boolean hot = true;
//				
//		if(hot) {										// if(hot == true) ---> same
//			System.out.println("Ask for some ice. \nDo not burn yourself!");
//		}else
//			System.out.println("Encoy it ");
//System.out.println("---------------------------------------------");			
			
//			String answer;
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Is your coffee hot? ");
//			System.out.println("Please write \"y\" for yes, \"n\" for no.");
//
//			answer = scan.next();
//						
//			if(answer.equals("y")) {						
//				System.out.println("Ask for some ice.\nDo not burn yourself!");
//			}else
//				System.out.println("Enjoy it. ");
//System.out.println("---------------------------------------------");
		}
}		


