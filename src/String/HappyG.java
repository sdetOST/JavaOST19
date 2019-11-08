package String;

public class HappyG {

	public static void main(String[] args) {

		/*
		 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
		 * immediately to its left or right. Return true if all the g's in the given
		 * string are happy.
		 */

		System.out.println(gHappy("xxggxx")); // true
		System.out.println(gHappy("xxgxx")); // false
		System.out.println(gHappy("xxggyygxx")); // false
	}

	public static boolean gHappy(String str) {
		boolean happy = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g') {
					happy = true;
				} else if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
					happy = true;
				} else {
					happy = false;
				}
			}
		}

		return happy;

	}
}
