package a01;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 8, 3, 5, 9, 1, 2 };
		sortArrayWithoutArraysSortMethod1(nums);
		sortArrayWithoutArraysSortMethod2(nums);

	}

	public static void sortArrayWithoutArraysSortMethod1(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {
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

	public static void sortArrayWithoutArraysSortMethod2(int[] nums) {
		int temp;

		for (int j = 0; j < nums.length - 1; j++) {
			if (nums[j] < nums[j + 1]) {
				temp = nums[j + 1];
				nums[j + 1] = nums[j];
				nums[j] = temp;
			}
		}

		System.out.println(Arrays.toString(nums));
	}

}
