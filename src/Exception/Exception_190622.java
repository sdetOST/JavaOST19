package Exception;

import java.util.Scanner;

public class Exception_190622 {

	public static void main(String[] args) throws InterruptedException {
	
		int[] arr = {1,2,3};
		
		try {
			int c = arr[1]/0;
			System.out.println(arr[100]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("first catch");
			
		}catch(Exception a) {
			System.out.println("second catch");
		}
//--------------------------------------------------------		

		Exception_190622.method();      
		
		// if I call the method which has throws exception I have to throws exception here too
		
	}
	
	public static void method() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hello");
	}

}
