package akbar;

public class Array2D_SumOfRows {

	public static void main(String[] args) {

		int[][] data = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };

		int itemCount = data.length;
		int lastIndex = itemCount - 1;

		System.out.println(isMagic(data));
		System.out.println(data[0][0] + data[1][0] + data[2][0] );

		 System.out.println(data[0][0] + data[1][1] + data[2][2] );
		 System.out.println(data[0][2] + data[1][1] + data[2][0] );

		 System.out.println(data[0][lastIndex-0] + data[1][lastIndex-1] +
		 data[2][lastIndex-2] );

//		 objective find the sum of first row -- first item
//		 int targetSum = 0;
//		 for (int eachItem : data[0]) {
//		      targetSum += eachItem;
//		 }
//		System.out.println(data[0][0] + data[0][1] + data[0][2] );
//		
//		 int itemCount = data.length;
//		 for (int row = 0; row < itemCount; row++) {
//		
//		      int rowSum = 0;
//
//		      for (int col = 0; col < itemCount; col++) {
//		        rowSum += data[row][col];
//		      }
//		      System.out.println((row + 1) + " row result " + rowSum);
//		      if (targetSum != rowSum) {
//
//		      }
//		
//		 }
//
//		int rowSum1 = 0;
//		for (int col = 0; col < itemCount; col++) {
//			rowSum1 += data[0][col];
//		}
//		System.out.println("first row sum is : " + rowSum1);
//
//		// ---------------------------------------------
//
//		int rowSum2 = 0;
//		for (int col = 0; col < itemCount; col++) {
//			rowSum2 += data[1][col];
//		}
//		System.out.println("second row sum is : " + rowSum2);
//
//		int rowSum3 = 0;
//		for (int col = 0; col < itemCount; col++) {
//			rowSum3 += data[2][col];
//		}
//		System.out.println("third row sum is : " + rowSum3);
//
//	}

	/*
	 * A 2D array is considered “magic” if the following are true: The array is
	 * square (N rows and N columns) The sums of each row, the sums of each column,
	 * and the sums of each diagonal are all equal. Complete the isMagic method so
	 * that it will determine whether a given array is magic.
	 */
	public static boolean isMagic(int[][] twoDArr) {

		// check whether it's a square or not
		/*
		 * if not square return false ;
		 * 
		 */
		int itemCount = twoDArr.length;
		int lastIndex = itemCount - 1;

		for (int[] each1DArray : twoDArr) {

			if (each1DArray.length != itemCount)
				return false;

		}
		System.out.println(" THIS IS A SQUARE !!!");

		/*
		 * // find the sum of any above requirement // then use it as reference point
		 * 
		 * // find sum of first row --- easiest /// now compare this sum to the rest of
		 * the sum requirement
		 */
		int targetSum = 0;
		for (int eachItem : twoDArr[0]) {
			targetSum += eachItem;
		}
		/*
		 * // take this number and compare with row sum result of each rows // as long
		 * as one row sum does not match the number // RETRUN FALSE
		 */
		for (int row = 0; row < itemCount; row++) {

			int rowSum = 0;
			for (int col = 0; col < itemCount; col++) {
				rowSum += twoDArr[row][col];
			}
			System.out.println((row + 1) + " row result " + rowSum);
			if (targetSum != rowSum) {
				return false;
			}
		}
		System.out.println("EACH AND EVERY ROW SUM THE SAME AT THIS POINT");

		/*
		 * // take this number and compare with COLUMN sum result of each column // as
		 * long as one column sum does not match the number // RETRUN FALSE
		 */

		for (int col = 0; col < twoDArr.length; col++) {

			int colSum = 0;
			for (int row = 0; row < itemCount; row++) {
				colSum += twoDArr[row][col];
			}
			System.out.println((col + 1) + " column sum is " + colSum);

			if (targetSum != colSum) {
				return false;
			}

		}

		System.out.println("EACH AND EVERY column SUM THE SAME AT THIS POINT");

		/*
		 * // take this number and compare with diagnol sum result of each column // as
		 * long as one diagnol sum does not match the number // RETRUN FALSE
		 */

		int diagnalSum = 0;
		int diagnalSumR = 0;

		for (int x = 0; x < itemCount; x++) {

			diagnalSum += twoDArr[x][x];
			diagnalSumR += twoDArr[x][lastIndex - x];

		}
		System.out.println("diagnal Sum 1 " + diagnalSum);
		System.out.println("diagnal Sum 2 " + diagnalSumR);

		if (targetSum != diagnalSum || targetSum != diagnalSumR) {
			return false;
		}
		System.out.println("EACH AND EVERY DIAGNAL SUM THE SAME AT THIS POINT");

		return true;
	}

}
