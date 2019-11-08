package Loop_ForEach;

import java.util.Arrays;

import Array.Array;

public class for_forEch_differances {

	public static void main(String[] args) {
		String[] str = {"for-forEch differances","bb","cafd"};
		
		for(int i = 0; i < str.length; i++) {
			
			System.out.print(str[i]+", ");			// System.out.println(str[i]);
		}			
System.out.println("\n----------------------------------------------");
				
		for (String item : str) {
			
			System.out.print(item+", ");
		}
System.out.println("----------------------------------------------");

		System.out.println(Arrays.toString(str));
		
		
System.out.println("\n----------------------------------------------");
		
		for (int i = 0; i < str.length; i++) {							// as you see that 
																		// str is changed
			System.out.println(str[i] + "  ggg");
		}

System.out.println("----------------------------------------------");

		for (String item : str) {						// for each does not change  
			item = item + "  gggg";						// the main array str
			System.out.println(item);
		}
	}

}
