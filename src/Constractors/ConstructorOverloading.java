package Constractors;

public class ConstructorOverloading {

	public static void main(String[] args) {
						
		Person4 person = new Person4();									// call default constructor
		Person4 you = new Person4("Lane","Turner",20);					// call 
		Person4 her = new Person4("Lane");
	}
}
class Person4 {
	
	String firstName;
	String lastName;
	int age;

	Person4(){															// default constructor
		System.out.println("Default constructor called here...");
		firstName = null; lastName = null; age = -1;							
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}	
	Person4 (String f, String l, int a) {									// constructor for person 
		System.out.println("Three argument constractor called here...");		
		firstName = f; lastName = l; age = a;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}	
	Person4 (String f) {														// Parameterized constructor called here
		this(f,null,-1);														// <--------!!!!!!!!!!!!
		
		
	}
}