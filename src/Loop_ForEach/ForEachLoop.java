package Loop_ForEach;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] numArray= {1,2,3,4,5,6,7,11};
	
		for(int item: numArray) {
			
			if(item %2 ==0)		System.out.printf("Even numbers of numArray: %d\r",item);
			
		}
		String [] strArray= {"breakContinueLoop","bb","cc","ab","ac","bc","abc"};
		
		for(String itemm: strArray) {
			
			if(itemm.contains("c")) {		
				
				System.out.printf("Found %s getting out \r",itemm);
				break;
			}
		}
	}
}

