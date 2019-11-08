package Method;

import java.math.BigDecimal;

public class P04_CompareToMethod {

	public static void main(String[] args) {
		
		BigDecimal aDecimal = new BigDecimal("4.00");
		BigDecimal bDecimal = new BigDecimal("4.00");
		
		if (aDecimal.compareTo(bDecimal) == 0)
			System.out.println("They are equal"); 
		
		else if (aDecimal.compareTo(bDecimal) > 0)		
			System.out.println("eDecimal is greater than fDecimal ");
		
		else
			System.out.println("aDecimal is less than bDecimal"); 
		
	}					
}
