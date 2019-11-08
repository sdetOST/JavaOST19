package CyberInterviewQ;

/*
 * 	String -- Reverse
	Write a return method that can reverse  String

	Ex: Reverse("ABCD"); ==> DCBA
 */
public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Solution 1

	public static String StrReverse2(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--)

			reverse += str.toCharArray()[i];

		return reverse;

	}

//	Solution 2

	public  static String  Reverse(String str) {

	return new StringBuffer(str).reverse().toString();

	}

}
