package Method;

import java.util.Scanner;

public class Circle02 {

	public static void main(String[] args) {
		Circle03 circleX = new Circle03();
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Circle radius as a inch: ");
		radius = sc.nextDouble();
		
 		System.out.println("The area of the circle is: \n"+circleX.getArea(radius) +" sqinch");
		System.out.println("The circumference of the circle is: \n"+ circleX.getCircumference(radius) +" inch");
	
		System.out.println("Area= "+ circleX.getArea(40) +" sqinch");
		System.out.println("Circumference= "+ circleX.getCircumference(40) +" inch");
	
	}

}
class Circle03{
	
	
	public static double getArea (double radius) {
		double area = Math.PI * radius * radius;
		return area;
		
	} 
	public static double getCircumference(double radius) {
		double circumference = 2*Math.PI*radius;
		return circumference;
	}
	
	
}
