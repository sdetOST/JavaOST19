package Array;

import java.util.Arrays;

public class ArraysCountNumbers {

	public static void main(String[] args) {
		int arr[] = new int[50];
		for ( int i = 0; i<50; i++) {
			arr [i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
	
		for (int i = 0; i < 50; i++) {
			arr[i] = (i + 1) * 2;
		}
		System.out.println(Arrays.toString(arr));
	}
}

