/**
 * 	Print the number between 1 and 10 and their squares
 * 
 * Example:
 * 
 * 1      1
 * 2      4    2 * 2
 * 3      9    3 * 3
 * 4      16
 * ...
 * 10     100
 */
package AAA_BasicCodings;

public class SquareTable {
	public static void main(String[] args) {
		/*
		 * start with for loop
		 */
		//for( ( part 1) ;  (part 2)   ; (part 3)  ){
			//body
		//}
		/*
		 * this is how for loop works
		 * part 1. initialize. It will execute only once
		 * 
		 * part 2: is a condition. guard. it is boolean expression==> it evaluates to true/false
		 * 
		 * if part 2 is true, it executes the body. 
		 * after it finishes the body, it executes part 3. ( inc/dec)
		 * 
		 * it will start from part 2.
		 * 
		 * 
		 */
		
		//while(true);  //infinite loop
		int i;
		System.out.println("Square Table");
		System.out.println("N\tSquare");
		
		// for(int j; j<= 10; j++){
		
		//}
		//j is out of scope here
		
		for(i = 1; i <= 10; i++ ){
			int square = i * i;
			System.out.println(i + "\t" + square);
			
		}
		/**
		 * same code with a while loop
		 */
		System.out.println("While loop starts here");
		int k = 1;
		while(k <= 10) {
			System.out.println(k + "\t" + k *k);
			k = k + 1;
		}
		
		/**
		 * do it again with do while
		 */
		System.out.println("Do while starts here");
		int m = 1;
		do {
			System.out.println(m +"\t" + m * m);
			m++;
		}while(m <= 10);
	}
}

