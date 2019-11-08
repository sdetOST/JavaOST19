package If_Statements;
/**
 * 
 *    and (&&), or (||) example
 */

public class Travel {
	public static void main(String[] args) {
		
		String name="alice";
		boolean hasMoney = false;
		boolean onVacation = false;
		
		if(hasMoney || onVacation) {		
			System.out.println(name + " can travel.");
		}else {
			System.out.println(name + " stays.");
		}
	}

}
