package Method;

import java.util.Scanner;

public class Circle01 {

	public static void main(String[] args) {
		
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Circle radius as a inch: ");
		radius = sc.nextDouble();
		
		Circle circleX = new Circle();
		circleX.getArea(radius);
		circleX.getCircumference(radius);
		
		
		
// 		System.out.println("The area of the circle is: "+circleX.getArea(radius) +" sqinch");
//		System.out.println("The circumference of the circle is: "+ circleX.getCircumference(radius) +" inch");
//	
//		System.out.println(circleX.getArea(4) +" sqinch");
//		System.out.println(circleX.getCircumference(4) +" inch");
	
	}

}
class Circle{
	
	
	public static double getArea (double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area : "+ area);
		return area;
		
	}
	public static double getCircumference(double radius) {
		double circumference = 2*Math.PI*radius;
		System.out.println("Circumference : "+ circumference);
		return circumference;
		
	}
	
	
}