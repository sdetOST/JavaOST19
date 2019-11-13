package inheritance;

class A {
	String x = "a";
	String A = "aa";
	void show(){
		System.out.println("show A");
	}
	void immit(){
		System.out.println("immit A");
	}
}
class B extends A {
	String x = "b";
	String B = "bb";
	@Override
	void show(){
		System.out.println("show B");
	}
	void tell(){
		System.out.println("tell B");
	}
}
public class A001_Inheritance {
	public static void main(String[] args) {
		A obj1 = new A();						
		System.out.println(obj1.x);				//  a
		System.out.println(obj1.A);				//  aa
		obj1.show();							//  show A
		obj1.immit();							//  immit A
		
//==============================================================================================================
//	Since B is subclass (child) of A, object B has all the attributes of A plus its own attributes 	 
//---------------------------------------------------------------------------------------------------------------		
		B obj2 = new B();
		System.out.println(obj2.x);				//  b
		System.out.println(obj2.B);				//  bb
		System.out.println(obj2.A);				//  aa			--> inherit from A
		obj2.show();							//  show B
		obj2.tell();							// 	tell B
		obj2.immit();							// 	immit A		--> inherit from A
		
//==============================================================================================================
//	Compiler time polymorphism: All attributes are coming from A - Not B (except the override version of the methods)		
//----------------------------------------------------------------------------------------------------------------	

		A obj3 = new B();
		System.out.println(obj3.x);				//  a				--> coming from A (reference - compiler time polymorphism
		System.out.println(obj3.A);				//  aa				--> coming from A (reference - compiler time polymorphism
//		System.out.println(obj3.B);				//  compiler error	--> CAN NOT reach B
		obj3.show();							//  show B			--> coming from A but *** OVERRIDE VERSION OF method show *** 
		obj3.immit();							//  immit A			--> coming from A (reference - compiler time polymorphism
//		obj3.tell();							//  compiler error	--> CAN NOT reach B
		
	}	

}


