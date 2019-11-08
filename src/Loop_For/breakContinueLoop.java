package Loop_For;

public class breakContinueLoop {

	public static void main(String[] args) {
System.out.println("---------------break---------------");		
		int i;
		for( i=0; i<10; i++){
			if( i == 3) break;
			
			System.out.println("Number "+i);
		}
		
		for( i=0; i<10; i++){
			if( i%2 != 0) 
			System.out.println("Odd number "+i);
		}		
		
//System.out.println("---------------continue---------------");
//
//		for( i=0; i<10; i++){
//			if( i%2 == 0) continue;
//			
//			System.out.println("Odd number "+i);
//		}
//		
//		for( i=0; i<10; i++){
//			if( i%2 != 0)
//			System.out.println("Odd number "+i);
//		}
	}
}
