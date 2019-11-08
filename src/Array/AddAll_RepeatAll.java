package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll_RepeatAll {
	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));

		list.addAll(list);
		System.out.println(list);
		
		repeatAL(list);
	}

	public static void repeatAL(ArrayList<Boolean> list) {

		list.addAll(list);
		System.out.println(list);

	}

}