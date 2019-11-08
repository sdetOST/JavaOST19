package LogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
//		System.out.println(true  && true);	// T*	both T --> T, rest are F
//		System.out.println(true  && false);	// F
//		System.out.println(false && true);	// F
//		System.out.println(false && false);	// F
//System.out.println("-------------------");
//
//		System.out.println(true  || true);	// T	both F --> F, rest are T
//		System.out.println(true  || false);	// T
//		System.out.println(false || true);	// T
//		System.out.println(false || false);	// F*
//System.out.println("-------------------");
//
//		System.out.println(true  ^ true);	// F	if same --> F		
//		System.out.println(true  ^ false);	// T	if different --> T
//		System.out.println(false ^ true);	// T
//		System.out.println(false ^ false);	// F
//System.out.println("-------------------");

//		Order and Precedence of Logical Operators
//		1.()
//		2. !
//		3. &&
//		4. ||
		
                                                		
		System.out.println(!false || false && true && !(false || true));
//							-----						-------------
//							  T							!T
//														---		
//							  T	   ||  F   &&  T   && 	 F
//									   -------------------
//							  T	   ||		F	
//							  T											
//		
		
	}
}
