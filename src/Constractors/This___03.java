package Constractors;

public class This___03 {

	public static void main(String[] args) {
		SomClass objA = new SomClass();
		objA.display(4, "x");					// update the local variables to 4x

		SomClass objB = new SomClass();
		objB.a = 10;							// update the instance variable 1 to 10
		objB.s = "m";							// update the instance variable s to m
		objB.display(5,"y");					// update the local variables to 5y
		
	}

}
class SomClass{
	
	int a = 1;
	String s = "s";
	
	public void display(int a,String s) {
		
		System.out.println(a+s);
		System.out.println("instance variables : "+ this.a + this.s);		// "this" is able to call the instance variable of a instead of local a 
	}
	
}

