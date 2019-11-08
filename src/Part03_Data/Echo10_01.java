package Part03_Data;
import java.util.Scanner;

class Echo10_01 {

	public static Scanner sc;

	public static void main (String[] args){
		String inData;
		sc = new Scanner( System.in );
			
		System.out.println("Enter the data:");
		inData = sc.nextLine();
		
		System.out.println("You entered:" + inData );
  }
}
