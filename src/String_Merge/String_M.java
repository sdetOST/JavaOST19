package String_Merge;
/*
s1 ==> "123"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3cde"


 */
public class String_M {

	public static void main(String[] args) {
		String one = "spoon";
		String two = "java";

		System.out.println(mergeStrings(one, two));
	}
	public static String mergeStrings(String one, String two) {

		int a = one.length();
		int b = two.length();
		int n = (a < b) ? a : b;
		String merg = "";
		for (int i = 0; i < n; i++) {
			merg += "" + one.charAt(i) + two.charAt(i);
		}
		if (a > b) {
			for (int i = n; i < a; i++)	merg += one.charAt(i);
		}
		if (b > a) {
			for (int i = n; i < b; i++)	merg += two.charAt(i);
		}
		return merg;
	}
}
