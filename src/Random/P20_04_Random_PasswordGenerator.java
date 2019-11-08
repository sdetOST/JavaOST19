package Random;
import java.util.Scanner;
import java.util.Random;
public class P20_04_Random_PasswordGenerator {
	
	public static void main(String[] args) {    
		
//		Scanner scan = new Scanner( System.in );
//		Random rand = new Random();    
//		int digits = 0;
//    
//		while ( digits < 5 )	{
//			System.out.println("Your password must have at least 5 characters.");
//			System.out.print("How many characters do you want in your password? ");
//			digits = scan.nextInt();
//		}
///		String choices = "abcdefghijklmnopqrstuvwxyz" ;
//		choices = choices + choices.toUpperCase() ;
//		choices = choices + "1234567890" ;
///		String password = "";
//		int j = 0;
//    
//		while ( j<digits ) { 
//    		password = password + choices.charAt( rand.nextInt( choices.length() ) );
//			j = j + 1;
//		}
//  		System.out.println("Here is your password: " + password );
		
		String Name = P20_04_Random_PasswordGenerator.rendomName(4);
		String LastName = P20_04_Random_PasswordGenerator.rendomLastName(5);
		String Revenue = P20_04_Random_PasswordGenerator.rendomRevenue(6);
		
		System.out.println(Name  +" "+LastName+" - "+Revenue );
		
	}
	
	public static String rendomName(int numberOfCharacter) {
		Random rand = new Random();   
		String choices2 = "abcdefghijklmnopqrstuvwxyz" ;
		String choices1 = choices2.toUpperCase();
		int i = 0;
		String name = choices1.charAt( rand.nextInt( choices1.length()))+ "";
		while ( i<numberOfCharacter ) { 
		    	
			name = name + choices2.charAt( rand.nextInt( choices2.length() ) );
			i= i + 1;
		}
		return name;
	}
	
	public static String rendomLastName(int numberOfCharacter) {
		Random rand = new Random();   
		String choices2 = "abcdefghijklmnopqrstuvwxyz" ;
		String choices1 = choices2.toUpperCase();
		int i = 0;
		String name = choices1.charAt( rand.nextInt( choices1.length()))+ "";
		while ( i<numberOfCharacter -1) { 
		    	
			name = name + choices2.charAt( rand.nextInt( choices2.length() ) );
			i= i + 1;
		}
		return name;
	}
// numberes before point  x x x . __  whole number  parts
	public static String rendomRevenue(int numberOfDigit) {
		Random rand = new Random();   
		String choices1 = "123456789" ;
		String choices2= "1234567890" ;
		int i = 0;
		String number1 = choices1.charAt( rand.nextInt( choices1.length()))+ "";
		while ( i<numberOfDigit-1 ) { 
		    	
			number1 = number1 + choices2.charAt( rand.nextInt( choices2.length() ) );
			i= i + 1;
			
		}
// decimal parts	
		String number2="";
		i= 0;
		while ( i<2 ) { 
		    	
			number2 = number2+ choices2.charAt( rand.nextInt( choices2.length() ) );
			i= i + 1;
			
		}
		String number = number1+"."+number2;
		return number;
	}
	
	
}

