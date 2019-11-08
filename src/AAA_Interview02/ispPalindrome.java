package a01;

public class ispPalindrome {

	public static void main(String[] args) {
		String str = "qwerewq";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reversed += str.charAt(i);
		if (reversed.equalsIgnoreCase(str)) return true;
		else return false;
	}

}
