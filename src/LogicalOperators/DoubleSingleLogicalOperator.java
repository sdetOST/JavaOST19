package LogicalOperators;
/*
 * The result is not different. Just the variable is changing 
 * depends on single or double operation sign.
 */
public class DoubleSingleLogicalOperator {

	public static void main(String[] args) {
		int b = 100;

		if (b > 100 && ++b < 200) {
			System.out.println("both are true");
		}
		System.out.println(b);
		System.out.println("--------------------------------------------");

		if (b > 100 & ++b < 200) {
			System.out.println("both are true");
		}
		System.out.println(b);
		System.out.println("---------------------------------------------");

		if (b == 100 | ++b < 200) {
			System.out.println("both are true");
		}
		System.out.println(b);
		System.out.println("--------------------------------------------");

		if (b == 100 | ++b < 200) {
			System.out.println("both are true");
		}
		System.out.println(b);
		System.out.println("--------------------------------------------");

		System.out.println(true && true); // true
		System.out.println(true &  true); // true
		
		System.out.println(true && false); // false
		System.out.println(true &  false); // false
		
		System.out.println(false && false); // false
		System.out.println(false &  false); // false
		
		System.out.println(true || true); // true
		System.out.println(true |  true); // true
		
		System.out.println(true || false); // true
		System.out.println(true |  false); // true
		
		System.out.println(false || false); // false
		System.out.println(false |  false); // false
	}

}
