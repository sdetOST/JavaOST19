package a01;

import java.util.ArrayList;
import java.util.Arrays;

public class sumOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(list);
		System.out.println(sumOfList(list));

	}

	public static int sumOfList(ArrayList<Integer> list) {
		int sum = 0;
		for (int each : list)
			sum += each;

		return sum;
	}

}
