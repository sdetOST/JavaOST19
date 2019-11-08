package Array;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
System.out.println("int Array & printing with for");		
		int[] xxx = new int[3];
		xxx[0] = 11;
		xxx[1] = 21;
		xxx[2] = 31;
		for(int i=0; i<xxx.length;i++)
			System.out.println("xxx["+i+"]: "+ xxx[i]);
System.out.println("-------------------------------------");
System.out.println("int Array & printing with for-each");		
		int[] xxxx = {11,21,31};
		for(int jjj: xxxx)
			System.out.print(jjj+", ");
		
System.out.println("\n-------------------------------------");
System.out.println("String Array & printing with while");		
		String[] zzz = new String[3];
		zzz[0] = "john";
		zzz[1] = "Adam";
		zzz[2] = "Don";
		int k = 0;
		while(k<zzz.length) {
			System.out.print(zzz[k]+", ");
			k++;
		}
System.out.println("\n-------------------------------------");
System.out.println("String Array & printing with Arrays.toString(zzzz)");
		String [] zzzz = {"john","Adam","Don"};
		System.out.println(Arrays.toString(zzzz));
		
System.out.println("-------------------------------------");
System.out.println("Sorting int-Array & printing with Arrays.toString(...)");

		int[] num = {1,9,7,4,-7,-2,5,6};
		Arrays.sort(num);								// become--> num={-7,-2,1,4,5,6,7,9}
		System.out.println(Arrays.toString(num));		// 				   0  1 2 3 4 5 6 7	

System.out.println("-------------------------------------");
System.out.println("Array.binarySearch(.....,x);  ---> Array binary (index) search");
		
		System.out.println("the index number of 7 is "+Arrays.binarySearch(num,7));
		System.out.println("num ["+Arrays.binarySearch(num,7)+"] = 7");

		}

	
	}
	
//	System.out.println(a+1);
//	System.out.println((char)(a+1));
	

