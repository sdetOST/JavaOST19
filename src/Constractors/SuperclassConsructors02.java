package Constractors;

public class SuperclassConsructors02 {

	public static void main(String[] args) {
		
//		AA obj1 = new AA();
		BB obj2 = new BB(5,10);

	}
}
class AA{
	int integerA = 10;
	
	public AA() {
		System.out.println("Inside A constructor integerA : "+ integerA);
	}
	public AA(int no) {
		integerA = 3*no;
		System.out.println("Inside A constructor which takes \none argument : "+integerA);
	}
}
class BB extends AA {
	int integerB = 20;
	
	public BB() {
		System.out.println("Inside B constructor integerB : "+ integerB);
	}

	public BB(int no1, int no2) {
		super(no1);
		integerB = no2;
		System.out.println("integerA: "+ integerA);
		System.out.println("integerB: "+ integerB);
	}
}


