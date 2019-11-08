package a01;
/*
 * uijkvnvncnb,jbnv
 */
public class permutation {

	public static void main(String[] args) {

		String s = "abc";
		permutation(s, "");

		int[] a = { 1, 2, 3 };
		permute(0, a);
	}
	
	public static void permutation(String str, String ans) {

		if (str.length() == 0)
			System.out.println(ans);

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			permutation(ros, ans + ch);

		}
	}

	public static void permute(int start, int[] input) {
		if (start == input.length) {
			for (int x : input) {
				System.out.print(x);
			}
			System.out.println("");
		}
		for (int i = start; i < input.length; i++) {
			int temp = input[i];
			input[i] = input[start];
			input[start] = temp;
			permute(start + 1, input);
			int temp2 = input[i];
			input[i] = input[start];
			input[start] = temp2;
		}
	}
	

}
