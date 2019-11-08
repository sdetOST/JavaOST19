package Constractors;

public class SuperclassConsructors01 {

	public static void main(String[] args) {
		
//		A obj = new A();
//		B obj = new B();
		C obj = new C();
		
	}

}
class A{
	
	public A() {
		System.out.println("Inside A constructor ");
		
	}
}
class B extends A {
	
	public B() {
		System.out.println("Inside B constructor ");
		
	}
}
class C extends B {
	
	public C() {
		System.out.println("Inside C constructor ");

	}
}