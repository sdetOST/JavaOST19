package Method;

public class Inheritance_Overriding {

	public static void main(String[] args) {
		Cycle cyc = new Cycle();
		cyc.printInfo();						// superclass and subclass has the same method named printInfo no problem
		
		Bicycle bcyc = new Bicycle();
		bcyc.printInfo();						// even the superclass (Cycle) has the same method (printInfo()) 
												// the sub class uses the printInfo method which belongs to itself
	}

}
class Cycle {
	
	int weight=10;
	
	public void printInfo() {
		

		System.out.println("Superclass  "+ weight);
//		System.out.println("Subclass  "+ brand);		// can't do that (error because brand is unknown)
//		printInfo();									// can't do that it will be execute cycling and it will lead to memory problem  
		
	}
}
class Bicycle extends Cycle {						// inherit of class Cycle (creating subclass of class Cycle)
	
	String brand="Hero";
	
	public void printInfo() {
		
		super.printInfo();							// supercall to execute superclass method printInfo
		
		System.out.println("Subclass  "+ brand);
		System.out.println("Superclass  "+ weight);
		
//		printInfo();									// can't do that it will be execute cycling and it will lead to memory problem
	}
}