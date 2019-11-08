package If_Statements;

public class P02_IfElsee {

	public static void main(String[] args) {
		int age = 49;
		boolean isMale = true;
		char hairColor = 'R';			// B: brown, R: red, L: blond hair
		
		// Check to see if they are a male, over the age 30  or if they have blond hair
		
		if((isMale && age >= 30) || hairColor == 'L') {
			System.out.println("The user is male over age 30 AND/OR they have blond hair color ");
		}
		else if(hairColor == 'R') {
			System.out.println("The user is not a male over age 30 and their hair color is Red");
		}				
		

	}

}
