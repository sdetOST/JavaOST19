package Method;

import java.util.Scanner;

public class Circle02_W2 {

	public static void main(String[] args) {
		Circle04 circleX = new Circle04();
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Circle radius as a inch: ");
		radius = sc.nextDouble();
		
// 		System.out.println("The area of the circle is: \n"+circleX.getArea(radius) +" sqinch");
//		System.out.println("The circumference of the circle is: \n"+ circleX.getCircumference(radius) +" inch");
//	
//		System.out.println(circleX.getArea(40) +" sqinch");
//		System.out.println(circleX.getCircumference(40) +" inch");
		
		circleX.getArea(radius);
		circleX.getCircumference(radius);
		circleX.getArea(40);
		circleX.getCircumference(40);
		
	}

}
class Circle04{
	
		public static void getArea (double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("The area of the circle is: \n"+ area +" sqinch");
//		return area;
		
	} 
	public static void getCircumference(double radius) {
		double circumference = 2*Math.PI*radius;
		System.out.println("The circumference of the circle is: \n"+ circumference +" inch");
//		return circumference;
	}
	
}
