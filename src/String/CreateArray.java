package String;
/*
 * Given a number n, create and return a new string array of length n,
 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case
 * just return a length 0 array. Note: String.valueOf(xxx) will make the String
 * form of most types. The syntax to make a new string array is: new
 * String[desired_length]
 * FizzArray2
 */
import java.util.Arrays;

public class CreateArray {

	public static void main(String[] args) {

		
//		fizzArray2(4) --> ["0", "1", "2", "3"]
//		fizzArray2(10) --> ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//		fizzArray2(2) --> ["0", "1"]

	System.out.println(Arrays.toString(fizzArray2(4)));

	}

	public static String[] fizzArray2(int n) {
		
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			//array[i] = String.valueOf(i); 
			//array[i] = new Integer(i).toString();
			//array[i] = String.format("%d", i);
			
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			array[i] = sb.toString();
		}
		return array;
	}
}


