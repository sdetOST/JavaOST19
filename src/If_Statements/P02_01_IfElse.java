package If_Statements;

public class P02_01_IfElse {

	public static void main(String[] args) {
/*		int a = 6;
		if(a==9) {
			System.out.println("a is  nine");
		}
		else {
			System.out.println("it is something else");
		}
*/		
		int boy, girl;
		boy = 18;
		girl = 18;
		
		if(boy < 18 && girl < 18) {
			System.out.println("You can not enter");
		}
		else {
			if (boy > 18 || girl > 18) {
				System.out.println("You can enter");
			}
			else {
			System.out.println("You will wailt for the assistent");
			}
		}
	}
}
