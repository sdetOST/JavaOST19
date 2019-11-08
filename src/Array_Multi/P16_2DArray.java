package Array_Multi;

import java.util.Arrays;

/*
int[][] intArray= new int [7][3];
int intArray1 [][] = new int [7][3];
int[] intArray2 [] = new int [7][3];
import java.util.Arrays;
*/
public class P16_2DArray {

	public static void main(String[] args) {

		String[][] bookArray = new String[][] {
			{"Autor 1","Book1","Book2","Book3","Book4"},
			{"Autor 2","Book1","Book2","Book3","Book4"},
			{"Autor 3","Book1","Book2","Book3","Book4"},
		};
		
		for(int i=0; i<bookArray.length; i++) {
			for(int j=0; j<bookArray[0].length; j++) {
			System.out.print(bookArray[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-----------------------------------------");
		}
		
		
		System.out.println("The array has "+bookArray.length+" rows.");
		System.out.println("The array has "+bookArray[0].length+" colums.");

System.out.println("==========================================================");
		
	    int[][] data = new int[4][2];
	    data[0][0] = 12;
	    data[0][1] = 17;
	    data[1][0] = 13;
	    data[1][1] = 40;
	    data[2][0] = 44;
	    data[2][1] = 27;
	    data[3][0] = 23;
	    data[3][1] = 12;
	    
	    System.out.print( "      | colum 1    |"+ " colum2   |\n");
	    System.out.println("-----------------------------------------");
		for(int i=0; i<data.length; i++) {
			System.out.print("row "+(i+1)+" |   ");
			for(int j=0; j<data[0].length; j++) {
			System.out.print(data[i][j]+"       | ");
			}
			System.out.println();
			System.out.println("-----------------------------------------");
		}
		
		
		System.out.println("The array has "+data.length+" rows.");
		System.out.println("The array has "+data[0].length+" colums.");
System.out.println("==========================================================");
		
		int[][] intArray3 = new int[3][7];

		for(int i=0; i<3; i++) {
			for(int j=0; j<7; j++) {
			System.out.print(intArray3[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-----------------------------------------");
		}

		System.out.println("The array has " + intArray3.length + " rows.");
		System.out.println("The array has " + intArray3[0].length + " colums.");
System.out.println("==========================================================");
	

		int[] nums1 = new int[] { 1, 3, 5 };
		int[] nums2 = new int[] { 1, 13 };

		// 2 dimesional array is an array object that store
		// 1 dimensional array in each slot

		int[][] numsOfnums = new int[2][];
		// length method on an array will always return first dimension length
		System.out.println(numsOfnums.length);

		numsOfnums[0] = nums1;
		numsOfnums[1] = nums2;

		for (int i = 0; i < numsOfnums.length; i++) {

			System.out.println(Arrays.toString(numsOfnums[i]));
			System.out.println(numsOfnums[i].length);

		}

		for (int[] eachRow : numsOfnums) {

			for (int eachCell : eachRow) {

				System.out.print(eachCell + " ");

			}
			System.out.println();

		}

	}

}
