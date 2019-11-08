package Part03_Data;
import java.util.Scanner;

public class Trigonometry9B_Exs_0203 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        double xd, xr, yd, yr,sinxd, cosyd, sum;
        System.out.println("Enter the x value as radians :");
        xd = scan.nextDouble();
        xr = xd * Math.PI/180;
        System.out.println("Enter the y value as radians :");
        yd = scan.nextDouble();
        yr = yd * Math.PI/180;
        sinxd = Math.sin(xr);
        cosyd = Math.cos(yr);
        sum = sinxd + cosyd;
        
        System.out.println("sin x :" + '\t' + sinxd);
        System.out.println("cos y :" + '\t' + cosyd);
        System.out.println("sum   :" + '\t' + sum);

    }
        
}
