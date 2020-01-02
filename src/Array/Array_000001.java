package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_000001 {

	public static void main(String[] args) {
		
		String [] array1 = new String [4];
		array1[0]="c ccc c"; array1[1]="a a a"; array1[2]="d dddd d"; array1[3]="b bb b"; 
//		
		int [] array2 = {1,9,2,8,3,6,5,5,15,5,8,-4};
//		int [] array3= new int [0];
		
		String[] ar = {"abg"};
		
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		
//		Collections.sort(new ArrayList<Integer>(Arrays.asList(array2)));
		
		array2.
		
		
//		array3 = array2 ;
//		
//		System.out.println(array3.length);
//		System.out.println(Arrays.toString(array3));
//		
//System.out.println("\n\n==============\n---Print array---\n--------------------------------------"); 		
//			
//		for (int i=0;i<array1.length;i++) System.out.print(array1[i]+", ");
//		
//System.out.println();
//		
//		for (int b: array2) System.out.print(b+", ");
//		
//System.out.println();
//		
//		System.out.println(Arrays.toString(array1));				//.....Array to string.....
//			
//=================  2D Array printing  ------------------------------
//				
//		int[][] num= {{1,2},{3,4}};
//		
// 1 -----------------------------------------------------------------------		
//		System.out.println(Arrays.deepToString(num));
// 2 -------------------------------------------------------------------------		
//		for(int[] q: num) {
//			for(int r : q ) {
//				System.out.print(r +", ");
//			}
//			System.out.println();
//		}
// 3 ----------------------------------------------------------------------
//		for(int i=0; i< num.length; i++) {
//			for(int j=0; j< num[i].length; j++) {
//				System.out.print(num[i][j]+", ");
//			}
//			System.out.println();
//		}
//		
//=======================\n---Sort array---\n--------------------------------------		
//
//		Arrays.sort(array1);
//		System.out.println(Arrays.toString(array1));
//		
//		Arrays.sort(array2);
//		for (int b: array2) System.out.print(b+", ");
//		
//			
//======================\n---Count Item---\n--------------------------------------	
//		
//		int count=0;
//		for (int i=0;i<array2.length;i++) {
//			if(array2[i]==5) count++;
//		}
//		
//		System.out.println("Item 5 is repeted "+count+" times in array2");
//		
//		
//		
//======================\n---Arrays Length---\n--------------------------------------	
//
//		System.out.println("array1  length  is:  " + array1.length;			// number of total members
//		System.out.println("array1[0] length is: " + array1[0].length());		//	number of char include spaces
//		System.out.println("array1[1] length is: " + array1[1].length());
//		System.out.println("array1[2] length is: " + array1[2].length());
//		System.out.println("array1[3] length is: " + array1[3].length());
//		
//		
//		
//		
//==================   Finding Min in IntArrays   ----------------------------------	
//
//		int min1 = array2[0];
//		int index1 = 0;
//		for (int i = 0; i < array2.length; i++) {
//			if(array2[i] < min1) {
//				min1=array2[i];
//				index1 = i;
//			}
//		}
//			
//		System.out.println("The min-number is: "+ min1);
//		System.out.println("The min-number index number is: "+ index1);
//
//===================  Finding Min Length in StringArrays  -------------------------
//
//		int min2 = array1[0].length();
//		int index2 = 0;
//		for (int i = 1; i < array1.length; i++) {
//			if(array1[i].length() < min2) {
//				min2 = array1[i].length();
//				index2 = i;
//			}
//		}
//		System.out.println("The min array is: "+ array1[index2]);
//		System.out.println("The min lengh is: "+ min2);
//		
//==================   Finding Max in IntArrays  ----------------------------------	
//
//		int max1 = array2[0];
//		int index3 = 0;
//		for (int i = 0; i < array2.length; i++) {
//			if(array2[i] > max1) {
//				max1=array2[i];
//				index3 = i;
//			}
//		}
//			
//		System.out.println("The max-number is: "+ max1);
//		System.out.println("The max-number index number is: "+ index3);
//
//==================  Finding MaxLength in StringArrays  ------------------------------	
//
//		int max2 = array1[0].length();
//		int index4 = 0;
//		for (int i = 1; i < array1.length; i++) {
//			if(array1[i].length() > max2) {
//				max2 = array1[i].length();
//				index4 = i;
//			}
//		}
//		System.out.println("The max array is: "+ array1[index4]);
//		System.out.println("The max lengh is: "+ max2);
//		
//	
//
//================  String to charArray   --------------------------------------	
//
//		String str1 = "abcd 12345";
//		char[] array5 = str1.toCharArray();
//		System.out.println(Arrays.toString(array5));		//	[a, b, c, d,  , 1, 2, 3, 4, 5]
//		
//================  charArray to String   --------------------------------------
//		
//		String str11 = new String (array5);
//		System.out.println(str11);
//
//---------------   Old Fashion : charArray to string  ---------------------------------
//
// 
//  		String str11="";
//		for (int i=0; i<array5.length; i++) {
//			str11 = str11 + array5[i];
//		}
//		System.out.println(str11);
//		
//		
//		
//=================  Split Sentences to Array ---\n------------------------------	
//		
//		String sentence = "I love java, i love testing too";
//		
//		char[] array6 = sentence.toCharArray();				//  1	string.toCharArray();	
//		System.out.println(Arrays.toString(array6));		// [I,  , l, o, v, e,  , j, a, v, a, ,,  , i,  , l, o, v, e,  , t, e, s, t, i, n, g,  , t, o, o]
//		System.out.println(array6[0]);						// I
//		
//		String[] array7 = sentence.split("");				// 2	string.split("");
//		System.out.println(Arrays.toString(array7));		//	[I,  , l, o, v, e,  , j, a, v, a, ,,  , i,  , l, o, v, e,  , t, e, s, t, i, n, g,  , t, o, o]
//		System.out.println(array7[0]);						//	I
//		

//---------------------------------------------------------------------------------------------------
//Note :  System.out.println(Arrays.toString(array6));	==	System.out.println(array6);	
//		[I,  , l, o, v, e,  , j, a, v, a, ,,  , i,  , l, o, v, e,  , t, e, s, t, i, n, g,  , t, o, o]  =  I love java, i love testing too
//---------------------------------------------------------------------------------------------------
//
//Regular: 
//		int size = sentence.length();
//		char[] myChars = new char[size];
//		for (int i=0; i<myChars.length;i++) {
//			myChars[i] = sentence.charAt(i);
//		}
//		System.out.println(Arrays.toString(myChars));
//		
//
//Example: Split method
//
//		String[] array6 = sentence.split(" ");
//		System.out.println(Arrays.toString(array6));		//	[I, love, java,, i, love, testing, too]
//		System.out.println(array6[1]);						//	love		
//
//		String[] array7 = sentence.split(",");
//		System.out.println(Arrays.toString(array7));		//	[I love java,  i love testing too]
//		System.out.println(array7[0]);						//	I love java
//
//
//		
//=======================  Copy array  ------------------------------------------------
//		
// 		int copyArray [] = new int [length]; 
//		System.arraycopy(src, srcPos, dest, destPos, length);
// 		Arrays.copyOfRange(original, from, to);

		int [] array = {1,2,3,4,5};
		int array3[] = new int [8];							// 8 : new Arr length
		                   									// 0 : where to start on sourcesArr
		System.arraycopy(array, 0, array3, 1, 4);			// 1 : where to start to put in destinationArr
		System.out.println(Arrays.toString(array3));		// 4 : where to end in destinationArr
			
		int [] array33 = Arrays.copyOfRange(array, 1, 4);
		System.out.println(Arrays.toString(array33));
		
//		Arrays.copyOfRange(original, from, to);
//		
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		
//
//===================  Count Numbers   -------------------------------------	
//		
//		int array8[] = new int[50];
//		for ( int i = 0; i<50; i++) {
//			array8 [i]=i+1;
//		}
//		System.out.println(Arrays.toString(array8));
//		
//		
//==================  Count Even Numbers   --------------------------------------
//
//		int array9[] = new int[50];
//		for (int i = 0; i < 50; i++) {
//			array9[i] = (i + 1) * 2;
//		}
//		System.out.println(Arrays.toString(array9));	
//		
//		
//====================  Count Odd Numbers  --------------------------------------	
//
//		int array10[] = new int[50];
//		for (int i = 0; i < 50; i++) {
//			array10[i] = i*2 + 1;
//		}
//		System.out.println(Arrays.toString(array10));
//
//		
//======================  Sum of array members    -----------------------------------	
//
//			int sum = 0;
//			for (int i = 0; i< array2.length; i++) {
//				sum = sum + array2[i];
//			}
//			System.out.println("sum : "+sum);		
//		
//		
//===================  Reverse Int Arrays  --------------------------------------	
//		
//
//		int [] array4 = {1,2,3,4,5};
//		
//		int n = array4.length;
//		int start = 0;
//		int end = n - 1;
//
//		while (start < end) {
//
//			int temp = array4[start];
//			array4[start] = array4[end];
//			array4[end] = temp;
//			start++;
//			end--;
//		}
//		System.out.println(Arrays.toString(array4));
//		
//		
//		
//------------    Traditional approach	------------------------------------------
//		
//	    int count1 = array4.length ; 
//	    int lastIndex = count1 -1 ; 
//	    
//	    for (int i = 0; i < count1/2; i++) {
//	      
//	       int temp = array4[i] ; 
//	       array4[i] =  array4[lastIndex - i] ; 
//	       array4[lastIndex-i] = temp ;  
//	    }
//	    System.out.println( Arrays.toString(array4) );
//	    
//--------------- Traditional approach - without temp ( x=x+y; y=x-y;  x=x-y; )  --------------
//	    
//	    int count2 = array4.length ; 
//	    int lastIndex2 = count2 -1 ; 
//	    
//	    for (int i = 0; i < count2/2; i++) {
//	      
//	    	array4[i] 			= array4[i] + array4[lastIndex2 - i]; 
//	    	array4[lastIndex2 - i] 	= array4[i] - array4[lastIndex2 - i]; 
//	    	array4[i] 			= array4[i] - array4[lastIndex2 - i]; 
//	    }
//	    System.out.println( Arrays.toString(array4) );
//	    
//==================  Reverse String  by words  -------------------------------------
//	    
//		String str = "Sunday Perfect Day for start coding";
//		
//		String[] words = str.split(" ");
//		System.out.println(Arrays.toString(words));
//		int l = words.length;
//		
//Rerverse array without STORING just print	
//		
//		for (int i =l-1; i>-0; i-- ) {
//			
//			System.out.print(words[i] + "-");
//		}
//		
// Reverse array itself		
//		
//		String temp = "";
//		for (int i = 0; i < l/2; i++) {
//			temp = words[i]+"";
//			words[i] = words[l-1-i];
//			words[l-1-i]= temp;
//		}
//		System.out.println(Arrays.toString(words));	
//		
//----------------Reverse array itself		
//		
//		String reverse = "";
//		for (int i =l-1; i>-0; i-- ) {
//			reverse = reverse +" "+ words[i];
//		}
//		String reverse2 = reverse.substring(1);
//		System.out.println(reverse2);	
//
//================  Search item in array  -ARRAYs SHOULD BE SORTED-  ---------------------------------
//		
//		int [] arrays20 = {1,-2,-3,0,-1,2,3,3,3};
//		
//		Arrays.sort(arrays20);
//		System.out.println(Arrays.toString(arrays20));
//		System.out.println(Arrays.binarySearch(arrays20,3));			// 6	yes
//		System.out.println(Arrays.binarySearch(arrays20,(-1)));		// 2	yes
//		System.out.println(Arrays.binarySearch(arrays20,(-5)));		// -1	no
//		System.out.println(Arrays.binarySearch(arrays20,(5)));		// -1	no
//		System.out.println(Arrays.binarySearch(arrays20,(0)));		// 3	yes
//		System.out.println(Arrays.binarySearch(arrays20,(4)));		// -10	no
//		
//==================  Arrays Equal--Arrays   ------------------------------------- 		
//		
//		String[] strArr1 = {"one", "two", "three"};
//		String[] strArr2 = {"one", "two", "three"};
//				
//		boolean match = Arrays.equals(strArr1, strArr2);
//		
//		System.out.println("match:" + match);	// System.out.println(Arrays.equals(strArr1, strArr2));
//		
//		
//==================                      -------------------------------------		
	
	}	
}
