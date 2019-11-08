package AAA_BasicCodings;



public class aaa {

	public static void main(String[] args) {
		
		Computeable	adder = (num1, num2) -> System.out.println("adding result: "+(num1+num2));													// measuring circle step 3.			
		Computeable	multiplyer = (n, m) -> System.out.println("multiplication result: "+(n * m));
		
		adder.compute(3, 5);												// adding result: 8
		multiplyer.compute(3, 5);
		
		Computeable2	differance = (num1, num2) ->   num1-num2;													// measuring circle step 3.			
//		Computeable2	divider = (n, m) -> { double a = n; double b =m; return (a/b);};
		Computeable2	divider = (n, m) -> (double)n/(double)m;
		
		System.out.println(differance.compute(3, 5));												// adding result: 8
		System.out.println(divider.compute(3, 5));
		
		
		
	}	
	// Functional Interface Class	 (Two Parameters)
	@FunctionalInterface
	interface Computeable{
		void compute (int num1, int num2);
	}
		
	// Functional Interface Class	 (Two Parameters)
	@FunctionalInterface
	interface Computeable2{
		double compute (int num1, int num2);
	}

}


