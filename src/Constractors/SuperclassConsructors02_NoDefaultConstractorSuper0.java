package Constractors;

public class SuperclassConsructors02_NoDefaultConstractorSuper0 {

	public static void main(String[] args) {
		
		BBB obj2 = new BBB(5,10);

	}
}
class AAA{
	int integerA = 10;
// No default constructor "public AAA() eliminated" 	
//	public AAA() {
//		System.out.println("Inside A constructor integerA : "+ integerA);
//	}
	public AAA(int no) {
		integerA = 3*no;
		System.out.println("Inside A constructor which takes \none argument : "+integerA);
	}
}
class BBB extends AAA {
	
	int integerB = 20;
	
	public BBB() {						// super(0) construct some default value constructor classAAA
		super(0);						// it calls method AAA without constructor am give initial value 0
		System.out.println("Inside B constructor integerB : "+ integerB);
	}

	public BBB(int no1, int no2) {
		super(no1);
		integerB = no2;
		System.out.println("integerA: "+ integerA);
		System.out.println("integerB: "+ integerB);
	}
}
