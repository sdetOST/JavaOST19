package inheritance;

class Parent {

	private int m = addNum();  //optional assignment with method
	public static int n = addStaticNum();  //optional assignment with method
	public static final int CONSTANT = 15 ; 
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	private int addNum() {
		System.out.println("Parent addNum() to assign val to instance field");
		return 0;
	}
	private static int addStaticNum() {
		System.out.println("Parent addStaticNum() to assign val to static field");
		return 0;
	}
	
	{System.out.println("Parent instance block 1");}								// instance block
																					//
	{System.out.println("Parent instance block 2");}								//								
	
	static {System.out.println("Parent static  block 1");}							// static block
																					//
	static {System.out.println("Parent static  block 2");}							//
}
