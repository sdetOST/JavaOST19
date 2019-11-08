package Break_Countinue;

public class Continue3 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			if(i%2 !=0 ) {
				continue;
			}
				
			System.out.println(i);
		}
		
		
		String str = "CyberTek Java";
		// loop through each character 
		// and if you have character a break out of the loop 
		// use break statement
		//System.out.println( str.charAt(0));
		
		
		for(int i=0;i<str.length() ;i++) {
			
			
			if( (str.charAt(i)=='J') || (str.charAt(i)=='a')  ) {
				continue;
			}
			
//			if(str.charAt(i)=='v') {
//				break;
//			}
				
				
			System.out.print( str.charAt(i) + "  " );
			
		}
		
		

	}

}
