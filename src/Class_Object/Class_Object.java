package Class_Object;

public class Class_Object {

	public static void main(String[] args) {

		Circle1 c1 = new Circle1();					//creating object c1
		c1.radius = 2;
		c1.area = 3.14 * c1.radius * c1.radius;
		System.out.println(c1.area);

		
		Circle2 c2 = new Circle2();				//creating object c2
		c2.findArea(3);							// finding area for r=3 (object c2) with using ... 
												// ...the method inside class Circle2 (findAre(3))

	}
}

// Creating class named Circle
class Circle1 {
	double radius;
	double area;
	}

	
class Circle2 {										// Creating class named Circle2
	double radius;
	double area;

	public void findArea(double radius)
	{
		double area;
		area = radius*radius*3.14;
		System.out.println(area);
	}
}

