package Array;

// Print-Copy-Sort-Max Array

//import java.util.Arrays;

public class Array_PrintCopySortMax {

	public static void main(String[] args) {

//		int [] myArray = {1,9,2,8,3,6,5,5,15};
// -----------------------------------------------------------Sort array
//
//		Arrays.sort(myArray);
//		for(int k:myArray) {
//			System.out.print(k + ", ");
//		};
//		
//// ---------------------------------------------------------Array to string
//		String str = Arrays.toString(myArray);
//		System.out.println(str);
//		System.out.println(myArray);		// [I@6a6824be !!!!!!!!!!!!!!!!!!!!!!
//		
//// -----------------------------------------------------------Search item in array. First array needs to be sorted.
//		
//		System.out.print("\n"+Arrays.binarySearch(myArray,5));
//		
//// -----------------------------------------------------------Print array		
//		for (int i=0;i<myArray.length;i++)
//			System.out.print(myArray[i]+", ");
//		
//		System.out.println(" ");
////-----------------------------------------		
//		for(int mA:myArray)
//			System.out.print(mA+", ");
//		
//		System.out.println(" ");
//		int count=0;
//		for (int i=0;i<myArray.length;i++)
//			
//			if(myArray[i]==5) count++;
//		
//		System.out.println(System.out.println(count);
//		
//		
//		
// System.out.print("\r--------------------------\r"); 
//
//// -----------------------------------------------------------Copy array	
//
//		int myArray2[] = new int [3];
//		System.arraycopy(myArray, 1, myArray2, 0, 3);
//
//		for (int mAA : myArray2) {
//			System.out.print(mAA);
//		}
//System.out.print("\r--------------------------\r");
//
//---------------------------------------------------------------Finding Max
//
//		int max = 0;
//
//		for (int i = 0; i < myArray.length; i++) {
//			if(myArray[i]>max)
//				max=myArray[i];
//			
//			System.out.println(max);
//		}
//
//
////----------------------------------------------------------Array Length
//
//		int [] myArray3 = {1,9,2,8,3,6,5,5,15};
//		System.out.println(myArray.length);
//		
//
//
//
// System.out.print("\r--------------------------\r");
//
////----------------------------------------------------------Sort array
//
//		Arrays.sort(myArray);
//		for(int k:myArray) {
//			System.out.print(k + ", ");
//		};
//
////----------- Sort array in a long way ------------------
//		
//		for (int i=0; i < myArray.length; i++) {
//			
//			for (int x=0;  x < myArray.length-1; x++) {
//				if(myArray[x] > myArray[x+1]) {
//					int tempStorage = myArray[x+1];
//					myArray[x+1] = myArray[x];
//					myArray[x] = tempStorage;
//				}			
//			}
//		}		
//		for (int z:myArray) {			
//			System.out.print (z + ", ");
//
//
//	}
////-------------------------------------------------------------String to Array
		String str1 = "abcdefgh 12345";
		char[] array1 = str1.toCharArray();
		for (char c : array1) {
			System.out.print(c + ", ");

		}
	}
}
