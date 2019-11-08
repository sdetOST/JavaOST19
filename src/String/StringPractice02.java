package String;

import java.util.Scanner;

public class StringPractice02 {

	public static void main(String[] args) {
		
		// for loop 
		// nested loop 
		// if statement inside loop 
		// break , continue 
		// String methods , subStr 
		// Mathh methods 
		// while loop --> for loop 
		// switch statement 
		
		// for loop 
		Scanner sc = new Scanner(System.in);		
		String name = sc.next();
//		System.out.println(name.length());		
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
		
		//// get the input from user as String 
		//// loop through the string to print out each and every character 
		//// these characters should be in one line and seperated by , 
		
		//commenting 
		// Ctr + /  for windows 
		// Cmd + /  for mac 
		
		for(int c=0 ; c< name.length(); c++) {
			
			char eachChar = name.charAt(c);
			//String strToPrint = "";
			System.out.print(eachChar);
			if(c!=name.length()-1) {
				System.out.print(",");
			}
			
			//System.out.print(  + "," );
			//System.out.println(c);
			
		}
		
		
//		for(int k=1 ; k<=10 ; k++) {
//			System.out.print(k + " ");
//			if(k==5) {
//				break;
//			}
//		}
		//System.out.println(k);

//		// while loop 
//		System.out.println("while loop counting : ");
//		int i = 1 ; 
//		while(i<=10) {
//			System.out.print(i + " ");
//			i++ ; 
//		}
//		System.out.println();
//		System.out.println("do while loop counting : ");
//		
//		// do while 
//		int j = 1 ; 
//		do {
//			System.out.print(j+ " ");
//			j++;
//		}while(j<=10) ; 
		
		
		
		
		

	}

}
