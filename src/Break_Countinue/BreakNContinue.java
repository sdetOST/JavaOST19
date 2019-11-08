package Break_Countinue;

public class BreakNContinue {

	public static void main(String[] args) {
		// for commenting 
		// Ctr + /  for windows 
		// Cmd + /  for mac 
		
		String str = "CyberTek Java";
		// loop through each character 
		// and if you have character a break out of the loop 
		// use break statement
		//System.out.println( str.charAt(0));
		
		
		for(int i=0;i<str.length() ;i++) {
			
			if(str.charAt(i)=='a') {
				break;
			}
			System.out.print( str.charAt(i) + " " );
		}
		
	}

}
