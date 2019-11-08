package If_Statements;
import java.util.Scanner;

public class Odd{
    public static void main(String[] args){

	int n = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number:");
	n = in.nextInt();
	if(n % 2 != 0){
	    System.out.println(n +" is an odd number");
	}else{
	    System.out.println(n +" is an even number");
	}

    }
}
