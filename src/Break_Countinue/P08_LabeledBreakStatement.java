package Break_Countinue;

public class P08_LabeledBreakStatement {

	public static void main(String[] args) {
		
		Outer: for(int i = 0; i < 4; i++) {					// outer loop
			
			Inner: for(int x = 6; x < 9; x++){				// inner loop
					System.out.println("i: " + i + "  --  x: " + x);
					if(x==7)
						break Inner;
			}
		
		}
	}	
}