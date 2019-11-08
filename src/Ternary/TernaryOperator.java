package Ternary;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		int mark;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student mark: ");
		mark = sc.nextInt();
		if (mark>=79) {
			grade = mark>=89?'A':'B';
		}
		else if(mark>=59){
			grade = mark>=69?'C':'D';
		}
		else {
			grade ='F';
		}
		
		System.out.println("Grade: "+grade);
		
		
	}
}

