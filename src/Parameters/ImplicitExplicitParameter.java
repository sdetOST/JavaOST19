package Parameters;

public class ImplicitExplicitParameter {

	public static void main(String[] args) {

		MyData d1 = new MyData();
		d1.myName = "XYZ";
		d1.w = 3;
		d1.t = true;
		d1.display();									// implicit parameters 
		
		MyData d2 = new MyData();
//		d2.myName = "ABC";
		d2.w = 5;
		d2.display();									// implicit parameters
		
		YourData d3 = new YourData();
		d3.display("Homer",48, true);					// explicit parameters

	}

}
class MyData{
	
	String myName;
	int w;
	boolean t;
	
/*
 * Here The "MyName, w and t" are implicit parameters. They are not specified inside the method display parentheses ()
 * The object on which the method is called is the implicit parameters
 * For Example:| String y ="Home"; y.lenghth() = 4;| The object "y" which the method length call is implicit parameter.
 * The data type of the implicit parameters is the class in which the method is defined.
 * It is called implicit because we doi not mention it when we declare the method. 
 */
	
	public void display() {
		
		System.out.println(myName +" "+ w +" "+ t);
		
	}
}

class YourData {
	
/*Explicit parameters : "String myName, int w, boolean t"
 * Inside the method parentheses : Method specify those parameters inside the parentheses */
	
	public void display(String myName, int w, boolean t) {			
		String k = myName +" "+ w +" "+ t;	
		System.out.println(k);
		
	}
}
