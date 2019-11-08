package If_Statements;

/**
 *  If-else statement example. 
 * 
 *   0 < grades < 60: fail
 *   60 <= grades < 80   pass
 *   80 <= grades: A+ 
 * 
 */

import java.util.Scanner;

public class Grades02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade = 0.0;
		System.out.print("Enter your grade:");
		grade = sc.nextDouble();	//read a double value from console
		
		if( (grade >= 60) ) {
			if(grade >= 80) {
				System.out.println("A+");
			}else {
				System.out.println("pass");
			}
			
			System.out.println("Good Job");
			
		}else { 
			System.out.println("fail");
		}
		sc.close();
	}
	
}
