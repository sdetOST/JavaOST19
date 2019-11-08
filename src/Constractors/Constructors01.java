package Constractors;

public class Constructors01 {

	public static void main(String[] args) {
						
		Person p1 = new Person();
		
		System.out.println(p1.firstName);
		System.out.println(p1.lastName);
		System.out.println(p1.test);
		
	
	}
}

class Person {
	
	String firstName;
	String lastName;
	boolean test;
	
	Person(){										// constructor for person 
		
		System.out.println("Constractor called");		
		firstName = "Homer"; lastName = "Simson"; test = true;
		
	}
}
	
