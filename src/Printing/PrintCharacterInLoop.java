package Printing;

public class PrintCharacterInLoop {

	public static void main(String[] args) {

		char a = 'a';
		System.out.println(a + 1);
		System.out.println((char) (a + 1));
//------------------------------------------------------

		for (int i = 'a'; i <= 'z'; i++) {
			System.out.print((char) i);
		}
		System.out.println();

//---------------------------------------------------------
		String straz = "";
		for (int i = 'a'; i <= 'z'; i++) {
			straz += (char)i;
		}
		System.out.println(straz);

	}

}

