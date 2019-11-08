package Constractors;

public class Constructors02 {

	public static void main(String[] args) {
						
		Personn p1 = new Personn ("Homer","Simson",true);
		
//		System.out.println(p1.firstName);
//		System.out.println(p1.lastName);
//		System.out.println(p1.test);	
		
	
	}
}

class Personn {
	
	String firstName;
	String lastName;
	boolean test;
	
	Personn (String f, String l, boolean t){									// constructor for person 
		
		System.out.println("Constractor called");		
		firstName = f; lastName = l; test = t;
		System.out.println(f +" "+ l +" "+ t);
		
	}


	
}
