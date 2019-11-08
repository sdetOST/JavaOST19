package Loop_ForEach;
import java.util.Arrays;

public class LoopForEach {

	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,4,5,11,6,123,-89,-90};
//		for(int item : nums) {
//			System.out.print(item+", ");				// 1,2,3,4,5,11,6,123,
//		}
//
//System.out.println("\n\nEven numbers within the numbs :");		
//		
//		for(int item : nums) {
//			if(item %2 == 0)
//				System.out.print(item+", ");				
//		}
//
//System.out.println("\n\nOdd numbers within the numbs :");
//		
//		for(int item : nums) {
//			if(item %2 != 0)
//				System.out.print(item+", ");				
//		}
//System.out.println("\n---------------------------");
//System.out.println("Counting String Array with forEach loop :");

		String[] elemans = {"breakContinueLoop","bbb","ccc","abc","ab"};
				
		for(String strX : elemans) {
			System.out.print(strX+", ");
		}
System.out.println("\n\nCounting String Array with for loop :");
	
		for(int i=0; i<elemans.length; i++) {
			System.out.print(elemans[i]+", ");
		}
		System.out.println("\n\nPrint Arrays.toString");
		System.out.println(Arrays.toString(elemans)+"\n");
		
System.out.println("Coppy Array elemans to new Array xxxx");	
		
		String xxxx[] = new String[5];
		System.arraycopy(elemans, 0, xxxx, 0, 5);
		for(int k=0; k<elemans.length; k++) {
			System.out.print(xxxx[k]+", ");
		}
		
//System.out.println("\n\nCounting String Array with forEach loop contains \"b\":");
//
//		for(String letters : elemans) {
//			if(letters.contains("b")) {
//			System.out.print(letters+", ");
//			}
//		}
//System.out.println("\n\nCounting String Array with forEach loop break at  \"b\":");
//
//		for(String letters : elemans) {
//			if(letters.contains("b")) {
//				break;
//			}
//			System.out.print(letters+", ");
//			}

	}
}



