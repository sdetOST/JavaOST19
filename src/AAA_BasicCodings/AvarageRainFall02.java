package AAA_BasicCodings;
import java.util.Scanner;

public class AvarageRainFall02 {
	
	public static void main ( String[] args )
	{
		int April, May, June;
		System.out.println("Enter the Rainfall for April :");
		Scanner scane = new Scanner(System.in);
		April = scane.nextInt();
        System.out.println("Enter the Rainfall for May :");
        May = scane.nextInt();
        System.out.println("Enter the Rainfall for June :");
        June = scane.nextInt();
        double AverageRainfall = (double)(April + May + June ) / 3 ;
        System.out.println("Rainfall for April:"+'\t'+ April);
        System.out.println("Rainfall for May:"+'\t'+ May);
        System.out.println("Rainfall for June:"+'\t'+ June);
        System.out.println("Average Rainfall:"+'\t'+ AverageRainfall);

	}
}
