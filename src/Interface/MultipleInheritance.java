package Interface;
/*
 *   from  cava 8 and up we can have default and static method in interface
 *   Being able to Functional Interface 
 *   there must be only one abstract method
 *   
 *   interface A and interfac B both has the method show This is AMBIGUITY issue - error
 *   How we handle that problem: 
 *   Option 1 : Override the method show in impl class and redifine
 *   Option 2 : Use super keyword and define which interface method-show you will use. 
 */

@FunctionalInterface       
interface A{
	
	void abc();
	default void show() {
		System.out.println("in A show");
	}
	static void tell(){
		System.out.println("Tell me I am static");
	}
	
}

interface B{
	int NUM = 8;								// whenever create variable in interface it become final by default.
	default void show() {
		System.out.println("in B show");
	}
}

class ABimp implements A, B {
	public void abc() {
		System.out.println("in A abc and NUM is "+NUM);
	}
//===========================================
// option 1: Override & redefine
//-------------------------------------------	
//	@Override
//	public void show() {
//		System.out.println("I solved the ambiguity problem");
//	}
//===========================================	
// option 2:  Override & ParentName.super.methodName();
//--------------------------------------------
	@Override
	public void show() {
		B.super.show();				//	or -->	A.super.show();	
	}
//--------------------------------------------	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		A obj = new ABimp();
		obj.abc();					// in A abc and NUM is 8
		obj.show();					// in B show			
		
		B ob = new ABimp();
		ob.show();					// in B show
//		ob.abc();					// compiler error: B does not have method abc
		
		A.tell();					// Tell me I am static This is how to call static. className.methodName();
		
		System.out.println(ob.NUM);		// 8
	}	



}
