package FunctionalInterface;

@FunctionalInterface
interface B{
	void show();
	default void tell() {
		System.out.println("Hi B");
	}
}
@FunctionalInterface
interface C{
	void show(String s);
}

public class WithLambda1 {
	public static void main(String[] args) {
		B objB = () -> 	System.out.println("My name is Simson");			// Creating interface obj wit Lambda - No parameter
		objB.show();
		objB.tell();
		
		C objC = (s) -> 	System.out.println("My name is "+s);			// Creating interface obj wit Lambda - One parameter
		objC.show("Simson");

	}
}

