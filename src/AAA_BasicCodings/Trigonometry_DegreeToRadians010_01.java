package AAA_BasicCodings;
import java.util.Scanner;

public class Trigonometry_DegreeToRadians010_01 {
	static Scanner scan;
	public static void main(String[] args) {
				
		scan = new Scanner(System.in);
	    double x,y;
	    System.out.println("Enter x as of Radiant :");
	    x = scan.nextDouble();
	    System.out.println("Enter y as of Degree :");
        y = scan.nextDouble(); 
        System.out.println("Cos (x) =" + Math.cos(x));
        System.out.print("Cos (y) =" + Math.cos(Math.toRadians(y)));

	}
}
