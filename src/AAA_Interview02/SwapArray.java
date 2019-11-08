package a01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SwapArray {

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 3, 100, 98, 10 };

		sortArrayWithoutArraysSortMethod(numbers);

//	        Map<Character, Integer> myMap = countLetters("aaaabbbccd ");
//	        System.out.println(myMap);
//
//	        Map<String, Integer> myMap2 = countLettersb("aaaabbbccd ");
//	        System.out.println(myMap2);
//	        
//	        Map<String, Integer> myMap3 = countLetters2("aaaabbbccd ");
//	        System.out.println(myMap3);

	}

//-----------------------------------------------------------------------
//	   How do you sort an Array without using Arrays.sort(); method
//	   int [] nums = {5, 6, 7, 2, 333, 66};

	public static void sortArrayWithoutArraysSortMethod(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int temp;
		for (int idx = 0; idx < nums.length; idx++) {
			for (int j = 0; j < nums.length - 1; j++) {

				if (nums[j] < nums[j + 1]) {
					temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));

	}

//--------------------------------------------------------------------------------------
	// String name = "Khalili";
	// write a method which explains how many times each letter is repeated?
	// K = 1; , h = 1; a = 1; l = 2; i = 2;

	public static Map<Character, Integer> countLetters(String name) {

		Map<Character, Integer> map = new HashMap<>();
		char[] ch = name.toCharArray();

		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public static Map<String, Integer> countLettersb(String name) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] ch = name.toCharArray();

		for (char c : ch) {
			String result = c + "";

			if (map.containsKey(c)) {
				map.put(result, result.length() + 1);
			} else {
				map.put(result, 1);
			}
		}
		return map;
	}

	public static Map<String, Integer> countLetters2(String name) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		// char [] ch = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			String result = name.charAt(i) + "";

			if (!map.containsKey(result)) {
				map.put(result, 1);
			} else {
				map.put(result, result.length() + 1);
			}
		}
		return map;
	}

}