package a01;

public class reverseInt {
	public static void main(String[] args) {
		System.out.println(reverseNum1(1023));
		System.out.println(reverseNum2(1023));
		System.out.println(reverseNum3(1023));
	}

	public static int reverseNum1(int num) {
		int reversed = 0;
		int remainder = 0;

		do {
			remainder = num % 10; // ones
			reversed = reversed * 10 + remainder;
			num = num / 10;
		} while (num > 0);

		return reversed;

	}

	public static String reverseNum2(int num) {

		String numStr = "" + num;
		String reversed = "";

		for (int i = numStr.length() - 1; i >= 0; i--) {
			reversed += numStr.charAt(i);
		}
		return reversed;
	}
	public static int reverseNum3(int num) {

		String numStr = "" + num;
		String reversed = "";

		for (int i = numStr.length() - 1; i >= 0; i--) {
			reversed += numStr.charAt(i);
		}
		return (Integer.parseInt(reversed));
	}

}