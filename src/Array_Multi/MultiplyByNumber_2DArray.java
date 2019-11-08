package Array_Multi;

import java.util.Arrays;

public class MultiplyByNumber_2DArray {

	public static int[][] scalar(int[][] matrix, int n) {
		
		for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            	matrix[row][column] = n*matrix[row][column];
            }
		}
		return matrix;

	}

	public static void main(String[] args) {

		int[][] i = new int[][] { { 1, 1, }, { 1, 1, 1, 2 } };
		System.out.println(Arrays.deepToString(i));
		
		i = scalar(i, 5);
		System.out.println(Arrays.deepToString(i));

	}
}
