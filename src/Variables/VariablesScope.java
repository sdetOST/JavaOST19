package Variables;

public class VariablesScope {

	public static void main(String[] args) {
		
		int x = 0;							// x: local variable (inside the method) needs to be initialized.
		Person p = new Person();
		p.display(x);						// it will show: null null false  ---- 
		System.out.println(p);									// because initial assignment for instant variables
		
		
	}
	int y;									// y is instant variable (inside the class outside the method)
}											// no need to be initialized.
class Person {
	
	String firstName;						// instant variables:  firstName, lastName and test.
	String lastName;						// They have initial assignment for null, null and false
	boolean test;
	
	
	
	public void display(int p) {			// p is parameter variable. Can not recognize inside the method 
		int n = 0 ; 						// n is local variables need to assign for some value. int n;-->ERRORS
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(test);
		System.out.println(n);
	}
	public void test() {
		
		System.out.println(firstName);
	

		
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", test=" + test + "]";
	}
	
	
}