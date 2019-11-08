package IncrementDecrement;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int pears = 3;
		
		           //  4             4 (->3)     2   = 7
		int basket = ++pears * 5 / pears-- + --pears;
		
		System.out.println(basket);						// 7
		System.out.println(pears);						// 2
		
		
		int x = 0;
		int y = 0;
		
		System.out.println("x = 0, x++: "+ x++);	
		System.out.println("y = 0, ++y: "+ ++y);
		
		
		
		
	}

}
