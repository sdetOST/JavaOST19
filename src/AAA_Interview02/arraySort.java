package CyberInterviewQ;

import java.util.ArrayList;

/*
  	Array -- Sort Ascending
	Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

	Ex:    int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);        		 ==>{ 7, 8, 9, 10};
             
      Ex:  	int[] arr = {10,20,7, 8, 90};
            arr = Sort(arr);  			==>  {90, 20, 10, 8, 7};
 */
public class arraySort {

	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7};
		arr = SortAscending(arr);
		System.out.println(arr);

	}

//	Solution:

	public static int[] SortAscending(int[] a) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int each : a)

			list.add(each);

		for (int i = 0; i < a.length; i++) {

			a[i] = findMin(list);

			list.remove(Integer.valueOf(a[i]));

		}

		return a;

	}

	public static int findMin(ArrayList<Integer> a) {

		int min = Integer.MAX_VALUE;

		for (int each : a)

			min = Math.min(min, each);

		return min;

	}

	public static int[] SortDescending(int[] a) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int each : a)

			list.add(each);

		for (int i = 0; i < a.length; i++) {

			a[i] = findMax(list);

			list.remove(Integer.valueOf(a[i]));

		}

		return a;

	}

	public static int findMax(ArrayList<Integer> a) {

		int max = Integer.MIN_VALUE;

		for (int each : a)

			max = Math.max(max, each);

		return max;

	}

}
