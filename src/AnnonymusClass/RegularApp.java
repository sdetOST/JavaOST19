package AnnonymusClass;
//  We need classs B only for override method show
// Instead of that we can use Anonymous class 

class AA{
	void show() {
		System.out.println("My name is Homer");
	}
}

class BB extends AA{
	void show() {
		System.out.println("My name is Simson");
	}
}

public class RegularApp {
	public static void main(String[] args) {

		AA obj = new BB();
		obj.show(); 					// My name is Simson

	}

}
