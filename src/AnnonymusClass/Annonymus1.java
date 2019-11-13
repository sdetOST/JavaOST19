package AnnonymusClass;
// If you have an intention of creating class for one time use, 
// Instead use Anonymous . (Instead of BB)


class A{
	void show() {
		System.out.println("My name is Homer");
	}
}

public class Annonymus1 {
	public static void main(String[] args) {
		A obj = new A() {
							void show() {
								System.out.println("My name is Simson");
							}
							
						};
		
		obj.show(); 					// My name is Simson
	}
}
