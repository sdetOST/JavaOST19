package Loop_For;

public class LoopFor {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++ ) {			// for(initialization;condition;updates){
			if(i==3 || i==4) 							// exclude 3 and 4
			continue;									// continue !!!
			System.out.print(i+", ");
		}
//System.out.println("----------------------------");	
		
		// Odd numbers
//		for (int r = 0; r < 100; r++) {
//			if (r %2 !=0) {					
//				System.out.print(r +", ");
//			}
//		}
//System.out.println("----------------------------");
		
//		String[] fruits = new String[4];	// String[] fruits={"apples","orange","banana","mandarin"};
//		fruits[0]= "apple";					// you can write such a form like above too
//		fruits[1]= "orange";
//		fruits[2]= "banana";	
//		fruits[3]= "mandarin";
//		
//		for(int k=0; k<=3;k++) {
//			System.out.print(fruits[k]+"\t");
//		}
//System.out.println("----------------------------");
}}
			
			
