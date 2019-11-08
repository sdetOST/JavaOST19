package Method;

/* how you can use super keyword in the simplest way to call methods and variables 
 * that belongs to superclass.
 */

public class SuperclassMethod01 {

	public static void main(String[] args) {
		Student std = new Student();
		std.print();						// called sub class method Personn.
											// Since the method has super.print, at the same ti
	}										// time it calls super class method too

}
class Personn{								// super class
	
	String name="Homer";
	
	public void print() {
		System.out.println(name);
	}
	
}
class Student extends Personn{				// sub class
	
	
	String name = "Simson";
	int mark = 100;
	
	public void print() {
		System.out.println(mark);
		System.out.println(name);
		super.print();						// it will call superclass method print
		super.name = "xxx";
		name = "yyy";
		System.out.println(name);
		super.print();
		System.out.println(this.name);
		System.out.println(super.name);
	
	}

}