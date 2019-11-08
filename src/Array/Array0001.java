package Array;
import java.util.Arrays;
public class Array0001 {

	public static void main(String[] args) {

//		int [] arr1 = {1,4,6,8,9};
//		
////--------------------------------------------------------------------update-change array members 
//		for(int a:arr1) {
//			System.out.print(a + ", ");
//		}
//		System.out.println();
//		arr1[2] *= 2;
//		arr1[3] = arr1[0] + arr1[1];
//		for(int b:arr1) {
//			System.out.print(b + ", ");
//		}
////--------------------------------------------------------------------sum of array members 
//		int sum = 0;
//		for (int i = 0; i< arr1.length; i++) {
//			sum = sum + arr1[i];
//		}
//		System.out.println("\nsum : "+sum);
//		
////---------------------------------------------------------------------swap first and last
//		
//		int temp = arr1 [0];
//		arr1 [0] = arr1 [arr1.length-1];
//		arr1 [arr1.length-1] = temp;
//		
//		for(int b:arr1) {
//			System.out.print(b + ", ");
//		}
//		
////---------------------------------------------------------------------find max
		int [] nums = {1,4,6,8,9,-19,0};
		int max = nums[0] ;
		  
		for (int i = 1; i < nums.length; i++) {
			  if( nums[i] > max ) {
				  max =  nums[i] ;
			  }
			  
		  }
		System.out.println("max : "+ max);
			
			
////---------------------------------------------------------------------find min

		int min = nums[0] ;
			  
		for (int i = 1; i < nums.length; i++) {
				  if( nums[i] < min ) {
					  min =  nums[i] ;
				  }
				  
			  }
				System.out.println("min : "+ min);
//-------------------------------------------------------------------- sort array			
		Arrays.sort(nums);
		for(int k:nums) {
				System.out.print(k + ", ");
		}
		System.out.println();
		
//---------------------------------------------------------------------reverse array
//		int [] nums = {1,4,6,8,9};
		int n = nums.length;
		int start = 0;
		int end = n - 1;

		while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		for(int b:nums) {
			System.out.print(b + ", ");
		}

	}
}
