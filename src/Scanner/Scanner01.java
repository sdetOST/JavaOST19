package Scanner;
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
//		String name;
//		int age;
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the person title: ");
//		name = sc.nextLine();
//		
//		System.out.print("Enter the person age: ");
//		age = sc.nextInt();
//		
//		System.out.println("Name : "+ name);
//		System.out.println("Age : "+ age);
		
System.out.println("----------------------------------------");	

		int age2;		
		String name2;
			
		System.out.print("Enter the person age: ");
		age2 = sc.nextInt();
//		sc.nextLine();										// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("Enter the person title: ");
		name2 = sc.nextLine();
	
		System.out.println("Age : "+ age2);
		System.out.println("Name : "+ name2);

	}
}

