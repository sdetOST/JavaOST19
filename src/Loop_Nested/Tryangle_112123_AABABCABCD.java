package Loop_Nested;

public class Tryangle_112123_AABABCABCD {

	public static void main(String[] args) {

		String s = "java";

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("java ");
			}
			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		for (int i = 'A'; i <= 90; i++) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		for (int i = 65; i <= 90; i++) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		for (int i = 'A'; i <= 'Z'; i++) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

	}
}