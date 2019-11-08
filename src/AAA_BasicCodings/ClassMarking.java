package AAA_BasicCodings;
import java.util.Scanner;

public class ClassMarking {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mark");
        int marks= scan.nextInt();

        if ((marks>=80)&&(marks<=100)){
            System.out.println("well done keep it up");
        }
        else if ((marks>=60)&&(marks<80)){
            System.out.println("need some improvement");
        }
        else {
            System.out.println("need to study very hard");
        }

    }
}

