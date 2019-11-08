package Class_Object;

import java.util.Scanner;

public class Class_Object02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		System.out.println("Enter the radious one: ");
		double radius = scn.nextDouble();
		
		Circle3 c1 = new Circle3();					//creating object c1
		c1.findArea(radius);
				
		System.out.println("Enter the radious two: ");
		radius = scn.nextDouble();
		
		Circle3 c2 = new Circle3();					//creating object c2
		c2.findArea(radius);

	}
}
													// Creating class named Circle2
class Circle3 {
	
	double radius;
	double area;
	
	public void findArea(double r)
	{
		radius = r;
		area = r*r*3.14;
		System.out.println("The area is: "+area);
		System.out.println("-------------------------");
	}
}

