package Parameters;
import java.math.BigDecimal;
import java.util.Scanner;
public class P01_BigDecimals {

	public static void main(String[] args) {
		
		BigDecimal deci01 = new BigDecimal("10.00");					//Create big decimal
		BigDecimal deci02 = new BigDecimal("5.00");	
					
		BigDecimal sum = deci01.add(deci02);							//basic math operations
		BigDecimal substraction = deci01.subtract(deci02);
		BigDecimal product = deci01.multiply(deci02);
		BigDecimal divide = deci01.divide(deci02);
		
		
		System.out.println("The sum is: " + sum.toString());
		System.out.println("The difference is: " + substraction.toString());
		System.out.println("The product is: " + product.toString());
		System.out.println("The quotient is: " + divide.toString());
			
System.out.println("-----------------------------------------------------------------------------");
		
		deci01 = deci01.add(deci02);									// now dec01 equals initial dec01 plus dec02
		
		System.out.println("Deci01 is: "+ deci01.toString());


		deci01 = deci01.add(new BigDecimal("10.00")); 			//new assignment for deci01 (+9.00)
			System.out.println("Deci01 is: "+ deci01.toString());
		deci01 = deci01.multiply(new BigDecimal("2.00"));		//new assignment for deci01 (x8.00)
			System.out.println("Deci01 is: "+ deci01.toString());
		deci01 = deci01.subtract(new BigDecimal("20.00")); 		//new assignment for deci01 (-7.00)
			System.out.println("Deci01 is: "+ deci01.toString());
		deci01 = deci01.divide(new BigDecimal("5.00"));			//new assignment for deci01 (/6.00)
			System.out.println("Deci01 is: "+ deci01.toString());

		
System.out.println("-----------------------------------------------------------------------------");
		
		double myDouble = deci01.doubleValue();						// convert bigDecimal to double
		
		System.out.printf("The double is:%.2f \n", myDouble);
					
System.out.println("------------------------------------------------------------------------------");

		BigDecimal someDecimal = new BigDecimal("123.455").setScale(2,BigDecimal.ROUND_HALF_UP); //roundingBD
		
		System.out.printf("The rounded \"someDecimal\" is: " + someDecimal.toString());

System.out.println("------------------------------------------------------------------------------");

		Scanner userInput = new Scanner(System.in);				// BigDecimal scanner
		
		System.out.println("Enter a monetary number");
		BigDecimal numberEntered = userInput.nextBigDecimal();
		
		userInput.close();										// close scanner
		
		System.out.println("The value of number entered: "+ numberEntered.toString());
		
		
		
		
	}

}
