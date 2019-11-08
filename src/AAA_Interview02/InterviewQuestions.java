package a01;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestions {
	/*
	- Palindrome
	- Removing extra spaces
	- Reverse string
	- Factorial
	- SumOfDigits
	- Fibonacci
	- Reverse integer
	- FinraCompanyCodingQuestion 1
    - FinraCompanyCodingQuestion 2
		 
	 */
	/*
	 Factorial:
	 
	 2! = 2*1
	 3! = 3*2*1
	 
	 
	 SumOfDigits
	 
	 12345 ==> 1+2+3+4+5
	 
	 Fibonacci
	 
	 
	 0 1 1 2 3 5 8 13 ...
	 
	 */
	
	/*
	 Given a list of people’s names “Ahmed”,”John”,”Eric” , write a  java operation to remove all the names named “Ahmed”
	 */
	
	public static void main(String[] args) {
//		System.out.println(isPalindrome("civic"));
//		
//		//civic -> civic
//		
//		System.out.println(removeSpaces("I love Java"));
		
//		String str = "I love Java";  //Java love I
//		System.out.println(reverseAStringbySplit(str));
		
		
//		System.out.println(Factorial(5)); //5*4*3*2*1
		
//		System.out.println(sumOfDigits(12345));
		
//		Fibonacci(15);
		
	//	System.out.println(reverseNum(34567));
		
		int [] numbers = {5, 2, 3, 100, 98, 10};
	        sortArrayWithoutArraysSortMethod(numbers);
	      
	        Map<String, Integer> myMap = countLetters("level");
	        System.out.println(myMap);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static String reverseNum(int num){
//		
//		String numStr = "" + num;
//		String reversed = "";
//		
//		for(int i=numStr.length()-1; i>=0; i--) {
//			reversed += numStr.charAt(i);
//		}
//		return reversed;
//	}
	
//-----------------------------------------------------------------	
	
//	public static void Fibonacci(int num) {
//		int num1 = 0;
//		int num2 = 1;
//		
//		int fibonacci = 1;
//		
//		System.out.print(num1 + " " + num2 + " " + fibonacci + " ");
//		
//		for(int i = 0; i < num - 2 ; i++) {
//			
//			num1 = num2;
//			num2 = fibonacci;
//			fibonacci = num1 + num2;
//			
//			System.out.print(fibonacci + " ");  
//		}
//	}
	
//-------------------------------------------------------------
	
//	public static int sumOfDigits(int num) {
//		int sum =0;
//		
//		while(num > 0) {
//			sum += num%10; //for ones
//			num = num/10;
//		}
//		
//		return sum;
//	}
	
//-------------------------------------------------------------
	
//	public static int Factorial(int num) {
//		
//		int factorialNum = 1;
//		
//		for(int i = 1; i<= num; i++) {
//			factorialNum = factorialNum * i;
//		}
//		
//		return factorialNum;
//	}
	
//-------------------------------------------------------------
	
//	public static String reverseAStringbySplit(String str) {
//		String reversed = "";
//		
//		String[] strSpl = str.split(" ");
//		
//		for(int i = strSpl.length-1; i>=0; i--) {
//			reversed += strSpl[i] + " ";
//		}
//		return reversed;
//		
//	}
		
//-------------------------------------------------------------
		
//	public static String reverseAString(String str) {
//		String reversed = "";
//		
//		for(int i = str.length()-1; i>=0; i--) {
//			reversed += str.charAt(i);
//			
//		}
//		return reversed;
//	}
//	
	
//-------------------------------------------------------------
	
//	public static boolean isPalindrome(String str) {
//		String reversed ="";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			reversed += str.charAt(i);
//		}
//		if(reversed.equalsIgnoreCase(str)) {
//			return true;
//		}
//			return false;
//	}
//
//	public static String removeSpaces(String str) {
//		
//		while(str.contains(" ")) {
//			str = str.replace(" ", "");
//		}
//		return str;
//	}
	
//    sort array	
	    public static void sortArrayWithoutArraysSortMethod(int [] nums){
		        int temp;
		        for (int idx = 0; idx < nums.length; idx++){
		            for (int j = 0; j < nums.length-1; j++){
		                if(nums[j] < nums[j+1]){
		                    temp = nums[j+1];
		                    nums[j+1] = nums[j];
		                    nums[j] = temp;
		                }
		            }
		        }
		        System.out.println(Arrays.toString(nums));
		    }

//  Map the string  LATTERS WITH THE REPEATED NUMBERS
 // String name = "Khalili";
 // write a method which explains how many times each letter is repeated?
 // K = 1; , h = 1; a = 1; l = 2; i = 2;
		    public static Map<String, Integer> countLetters(String name){
		        Map<String, Integer> map = new HashMap<String, Integer>();
		        char [] ch = name.toCharArray();
		        for (char c : ch){
		            String result = c+"";
		            if(!map.containsKey(result)){
		                map.put(result, 1);
		            } else {
		                map.put(result, result.length() + 1);
		            }
		        }
		        return map;
		    }

}