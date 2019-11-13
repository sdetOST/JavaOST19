package AnnonymusClass;
// If you have an intention of creating class for one time use, 
// Instead use Anonymous . (Instead of BB)

interface C{
	void show();
}

public class Annonymus2_Interface {
	public static void main(String[] args) {
		C obj = new C() {
							public void show() {
								System.out.println("My name is Simson");
							}
						};
		obj.show(); 					// My name is Simson
	}
}



