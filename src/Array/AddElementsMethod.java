package Array;

import java.util.Arrays;

public class AddElementsMethod {

	public static void main(String[] args) {
		int[] ints1 = { 10, 40, 50, 3, 1 };
		int[] ints2 = { 11, 0, 500, 44, 1101 };

		System.out.println(Arrays.toString(addElements(ints1, ints2)));

	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] result = new int[5];
		for (int i = 0; i < 5; i++) {

			result[i] = ints1[i] + ints2[i];

		}

		return result;

	}
}
