package FunctionalInterface;

@FunctionalInterface
interface A{
	void show();
}

public class Regular {
	public static void main(String[] args) {
		A obj = new A() {
							public void show() {
									System.out.println("My name is Simson");
							}
						};
		obj.show(); 			
	}
}

