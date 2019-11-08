package Class_Object;

public class ObjectReferencePreservation {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		
		A a = new A();
		a.method(b);
	}
}
class B {
	int x = 10;
	String s = "string";
	char c = 'd';
}
class A {
	public void method(B obj) {
		System.out.println(obj.x);
		System.out.println(obj.s);
		System.out.println(obj.c);
	}
}

