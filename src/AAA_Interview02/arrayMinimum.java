package CyberInterviewQ;

import java.util.Arrays;

/*
 * 	Array -- Find Minimum
	Write a method that can find the maximum number from an int Array
 */
public class arrayMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Solution 1:

	public static int maxValue(int[] n) {

		int min = Integer.MAX_VALUE;

		for (int each : n)

			if (each < min)

				min = each;

		return min;

	}

//		Solution 2:

	public static int maxValue1(int[] n) {

		Arrays.sort(n);

		return n[0];

	}

}
