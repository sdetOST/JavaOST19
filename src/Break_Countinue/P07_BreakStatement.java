package Break_Countinue;

public class P07_BreakStatement {

	public static void main(String[] args) {
		
		int i = 0;
		while (true) {												// infinite loop if true goes on forever
			i++;
			System.out.println(i);
			if(i == 5) {
				break;												// ANDS LOOP
			}
		}				
	}	
}