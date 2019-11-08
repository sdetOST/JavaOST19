package a001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class A_mathProblems001 {

	public static void main(String[] args) {
		String[][] money = { { "mark", "5", "1" }, { "shekel", "30.5", "0.5" }};
		
//		System.out.println(convertTo$(money));
//		System.out.println(factorial(1));
//		System.out.println(intToString(25));
//		System.out.println(doubleToString(25.56));
//		System.out.println(stringToInt("25"));
//		System.out.println(stringToDouble("25.56"));
		permutation("AB");
//		permutation(12);
	}
	
//====================================================================================
//1. Totol Integers with Scanner ( scanner.hasNextInt() )
//------------------------------------------------------------------------------------
	public static void totalWithScanner(int num){
		Scanner scanner = new Scanner ( System . in );
		int sum = 0 ;	int counter = 1 ;
		while (counter < num ) {
			System . out . println ( "Enter your number"+ counter);
			if (scanner . hasNextInt ()) {
				int number = scanner.nextInt();
				sum = sum + number;	counter ++ ;
			} else   System.out.println( "Invalid Number" );
			scanner . nextLine ();
		}System.out.println ( "Your total is: " + sum);
		scanner.close ();
	}
//====================================================================================
//2. Swap numbers
//------------------------------------------------------------------------------------
	public static void swap( int  a, int b ) {
		int t = a;   a = b;   b = t;    System.out.println("a="+a+" - b="+b);
		}
	public static void swap2( int  a, int b ) {
		a = a+b;   b = a-b;    a = a-b;    System.out.println("a="+a+" - b="+b);
		}
	public static void swap3( int  a, int b ) {
		a = a^b;   b = a^b;    a = a^b;    System.out.println("a="+a+" - b="+b);
		}
	
	
//====================================================================================
//3. Numbers Odd or Even
//------------------------------------------------------------------------------------	
	public  static  String  identifyOddEven( int  n ) {
		return  n%2==0 ? "Even" : "odd" ; 
		}
	public  static void  printEvenNumbers( int  n ) {
		for (int i = 0; i <= n; i++) 
			if(i%2 == 0 ) System.out.println(i);
		}
	public  static void  printOddNumbers( int  n ) {
		for (int i = 0; i <= n; i++) 
			if(i%2 != 0 ) System.out.println(i);
		}
	
//====================================================================================
//4. Is Prime Number?
//------------------------------------------------------------------------------------	
	public static void isPrimeNum1(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if ( num%i == 0) count++;
		} System.out.println(count != 0 || num<=1? false : true);
	}
//------------------------------------------------------------------------------------	
	 public static boolean isPrimeNum2(int n) { 
	       if (n <= 1)     return false; 
	       
	       for (int i = 2; i < n; i++) 
	            if (n % i == 0) return false; 
	       return true; 
	    } 
//====================================================================================
//5. Print Prime Numbers
//------------------------------------------------------------------------------------	 
	 public static void primeNums2(int num) {
		 for (int j = 2; j <= num; j++) {
			int count = 0;
			for (int i = 2; i < j; i++) {
				if ( j%i == 0) count++;
			} if (count == 0 && num>1) System.out.println(j);
		}
	 }
		
//====================================================================================
//6. Random Number Gen
//------------------------------------------------------------------------------------
	public static int  randomInt(int max) {
		Random rand = new Random();
		return (rand.nextInt(max) + 1);
	}
	public static int  randomInt(int min, int max) {
		Random rand = new Random();
		return (rand.nextInt(max-min+1) +min);
	}
	
//====================================================================================
//7. Sum Of Digits
//------------------------------------------------------------------------------------	
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10; 
			num = num / 10;
		}return sum;
	}
	
//====================================================================================
//8. Count Numbers (Sum of ArrayList)
//------------------------------------------------------------------------------------	
	public static int countNumbersArrayList(int[] numbers) {
		
		int sum = 0 ;
		for( int i =0; i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		System.out.println ( "Your total is: " + sum);
		return sum;
	}

//====================================================================================
//9. Divide Integers without division
//------------------------------------------------------------------------------------	
	public static void devides(int num1, int num2) {

		if (num2 == 0) {
			System.out.println("Invalid Number");	return;
		}
		int count = 0;
		while (num1 >= num2) {
			num1 -= num2; 	count++;
		}
		System.out.println("result is: "+count + " and remainder is " + num1);
	} 

//====================================================================================
//10. Array MaxValue
//------------------------------------------------------------------------------------		
	public static int maxValue(int[] n) {

		int max = Integer.MAX_VALUE;
		for (int each : n)
			if (each > max)	max = each;
		return max;
	}
//-----------------------------------------------------------------------------------	
	public static int maxValue1(int[] n) {
		Arrays.sort(n); 	return n[n.length - 1];
	}
	
//====================================================================================
//11. Array MinValue
//------------------------------------------------------------------------------------
	public static int minValue(int[] n) {

		int min = Integer.MIN_VALUE;
		for (int each : n)
			if (each < min)	min = each;
		return min;
	}
//-----------------------------------------------------------------------------------	
	public static int minValue1(int[] n) {
		Arrays.sort(n);	return n[0];
	}

//====================================================================================
//12. Sort Array Without (Arrays.sort(arr)) Method 
//------------------------------------------------------------------------------------
         public static void sortArrayWithoutArraysSortMethod(int [] nums){
  	        int temp;
	        for (int i = 0; i < nums.length; i++){
	            for (int j = 0; j < nums.length-1; j++){
	                if(nums[j] > nums[j+1]){
	                    temp = nums[j+1];   nums[j+1] = nums[j];    nums[j] = temp;
	                }
	            }
	        }   System.out.println(Arrays.toString(nums));
	    }

//====================================================================================
//13.Sort ArrayList 
//------------------------------------------------------------------------------------		
         public static void sortArrayListBySecondChar(ArrayList<String> names) {
		Comparator<String> secondChar = Comparator.comparing( str -> str.charAt(1) );
		names.sort(secondChar);
		System.out.println(names);
         }
         
         public static void sortArrayListByLaSTChar(ArrayList<String> names) {
   		Comparator<String> lastChar = Comparator.comparing( str -> str.substring(str.length()-1) );
   		names.sort(lastChar);
   		System.out.println(names);
   	}

	
//====================================================================================
//14.Money conversion to $ - String[][] money = {{"mark","5","1"},{"pound","30.5","0.5"}};
//---------------------------------------------------------------------------------------	
	public static String convertTo$(String[][] money) {
		double total = 0;
		for (int i = 0; i < money.length; i++) {
			double x = Double.parseDouble(money[i][1]) * Double.parseDouble(money[i][2]);
			total += x ;
		} return ("$"+String.valueOf(total));
	}

//====================================================================================
//15.Fibonacci 1
//------------------------------------------------------------------------------------	
	public static void fibonacci1(int num) {
		int n1 = 0;
		int n2 = 1;
		int fib = 1;
		System.out.print(n1 + " " + n2 + " " + fib + " ");
		for (int i = 0; i < num - 3; i++) {
			n1 = n2;
			n2 = fib;
			fib = n1 + n2;
			System.out.print(fib + " ");
		}
	}
//====================================================================================
//16.Fibonacci 2  -  returns ArrayList
//------------------------------------------------------------------------------------	
	public static ArrayList<Integer> fibonacci4(int num) {

		ArrayList<Integer> f = new ArrayList<>(Arrays.asList(0, 1));
		for (int i = 0; i < num - 2; i++) {
			f.add(f.get(i) + f.get(i + 1));
		}
		return f;
	}

//====================================================================================
//17.Factorial  
//------------------------------------------------------------------------------------	
	public static int factorial(int num) {

		int factorialNum = 1;
		for (int i = 1; i <= num; i++) {
			factorialNum *=  i;
		}
		return factorialNum;
	}

//====================================================================================
//18.FINRA
//------------------------------------------------------------------------------------	
	public static void FINRA1() {
		String result = "";
		for (int i = 1; i <= 30; i++) {
			result += (i%5 == 0 && i%3 == 0) ? "FINRA "
					: (i%5 == 0) ? "RA " : (i%3 == 0) ? "FIN " : i + " ";
		}
		System.out.println(result);
	}
	
	public static void FINRA2(int num) {
		String[] myarr = new String[num];
		for (int i = 1; i <= 30; i++) {
			if (i % 5 == 0 && i % 3 == 0) 	myarr[i-1] = "FINRA";
			else if (i % 5 == 0)			myarr[i-1] = "RA";
			else if (i % 3 == 0)			myarr[i-1] = "FIN";
			else						myarr[i-1] = String.valueOf(i);
		}
		System.out.println(Arrays.toString(myarr));
	}

//====================================================================================
//19.Integer to String    
//------------------------------------------------------------------------------------	
	public static String intToString(int num) {
      	String s1 = Integer.toString(num);
      	String s2 = String.valueOf(num);
      	return s2;  
      // 	return s2;
	}
//====================================================================================
//20.Double to String    
//------------------------------------------------------------------------------------	
	public static String doubleToString(double num) {
      	String s1 = Double.toString(num);
      	String s2 = String.valueOf(num);
      	return s2;  
      // 	return s2;
	}
//====================================================================================
//21. String to Integer 
//------------------------------------------------------------------------------------	
	public static int stringToInt(String str) {
		int n1 = Integer.parseInt(str);
		int n2 = Integer.valueOf(str);
		int n3 = new Integer(str).intValue();
		return n3;
	}
//====================================================================================
//22. String to Double 
//------------------------------------------------------------------------------------	
	public static Double stringToDouble(String str) {
		Double n1 = Double.parseDouble(str);
		Double n2 = Double.valueOf(str);
		Double n3 = new Double(str).doubleValue();
		return n3;
	}

//====================================================================================
//23. Permutation
//------------------------------------------------------------------------------------	
	public static void permutation(String str) {
//		if (str == null || str.length() == 0)
//			System.out.println("You must provide a string of length > 0." );
		permutation ( str, "");
	}
	public static void permutation(int num) {
		String str = String.valueOf(num);
//		if (str == null || str.length() == 0)
//			System.out.println("You must provide a string of length > 0." );
		permutation ( str, "");
	}
	public static void permutation(String remaining, String ans) {
		if (remaining.length() == 0) 
			System.out.println(ans);

		for (int i = 0; i < remaining.length(); i++) {

			permutation(remaining.substring(0,i) + remaining.substring(i+1),
								ans + remaining.charAt(i) );
		}
	}

//====================================================================================
//24.New String
//------------------------------------------------------------------------------------		
	public static void strNew(){

		String s  = "A";				// s 
		String s1 = "A";				// same
		String s2 = s.concat("");		// same
		String s3 = new String("A");		// new
		String s4 = new String(s);		// new
		String s5 = s+"";				// new
/*		
		s  != s3   	 -	s  == s1   	 
		s  != s4	 -	s  == s2	 
		s  != s5	 -		 
*/
	}	
//====================================================================================
//25. Find max and min on int[]
//------------------------------------------------------------------------------------
         public static void findMax(int[] nums){
      	   int max = nums[0];
      	   for (int i : nums) {
			if (i>max) max = i;
		}
		System.out.println(max);
	    }	
         
         public static void findMin(int[] nums){ 
         	int min = nums[0];
		for (int i : nums) {
			if (i<min) min = i;
		}
		System.out.println(min);
         }
         
//====================================================================================
//25. Password Validation
//------------------------------------------------------------------------------------   
//       Write a return method that can verify if a password is valid or not.
//	   requirements:
//     	   1. Password MUST be at least have 6 characters and should not contain space
//     	   2. PassWord should at least contain one upper case letter
//   		   3. PassWord should at least contain one lowercase letter
//   		   4. Password should at least contain one special characters
//   		   5. Password should at least contain a digit
//      if all requirements above are met, the method returns true, otherwise returns  false   
//----------------------------------------------------------------------------------------	         
         
         public static boolean PasswordValidation(String password) {

      	   String lowercase="(.*[a-z].*)";
      	   String uppercase="(.*[A-Z].*)";
      	   String numbers="(.*[0-9].*)";
      	   String specialchars="(.*[ -/, :-@].*)";  

      	   boolean HasLower = password.matches(lowercase),
      	   boolean HasUpper = password.matches(uppercase),
      	   boolean HasDigits = password.matches(numbers),
      	   boolean HasSpecial = password.matches(specialchars),

      	   boolean Valid = false;
      	   if(password.length() >= 6 && !password.contains(" ") && 
      			   HasLower && HasUpper && HasDigits && HasSpecial) 
      	          Valid = true;
      	   return Valid;
	  }
         
         
         
         
         
}
