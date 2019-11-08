package CyberInterviewQ;

import java.util.Arrays;

/*
 * 	Array -- Find Maximum
	Write a method that can find the maximum number from an int Array
 * 
 */
public class arrayMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Solution 1:

	public static int maxValue(int[] n) {

		int max = Integer.MAX_VALUE;

		for (int each : n)

			if (each > max)

				max = each;

		return max;

	}

//		Solution 2:

	public static int maxValue1(int[] n) {

		Arrays.sort(n);

		return n[n.length - 1];

	}

}
