package MultipleClases02;

public class fishRestauran {

	public static void main(String[] args) {
		
		tuna tunaObject= new tuna();				// creation of tunaObject to use here
		tunaObject.simpleMessage();					// execution of tunaObject. you can run now
													// "This is tuna dish"
		salmon salmonObject= new salmon();			// creation of salmonObject to use here
		salmonObject.simpleMessage2();				// execution of salmonObject. you can run now

System.out.println("------------------------------------------------------");			
		
		tunaSalmon tsObject= new tunaSalmon();
		tsObject.menu1();
		tsObject.menu2();
	}

}
