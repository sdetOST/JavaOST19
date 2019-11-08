package Loop_While;
import  java.util.Scanner;
public class P017_02_AdUpIntagers_WhileAndIf {
	public static void main (String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		int N, sumAll = 0, sumEven = 0, sumOdd = 0, count = 1;

		System.out.println( "Enter limit value: " );
		N = scan.nextInt();

		
		while (  count <= N ) {
			
			sumAll = sumAll + count ;
   
			if ( count % 2 == 0  )
				sumEven = sumEven + count ;

			else
				sumOdd  = sumOdd  + count ;

			count = count + 1 ;
		}
				
		System.out.println  ( "Sum of even: " + sumEven );
		System.out.println ( "Sum of odd : " + sumOdd  );
		System.out.println  ( "\tSum of all : " + sumAll  );
		
	}
}
