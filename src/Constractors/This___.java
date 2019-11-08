package Constractors;

public class This___ {

	public static void main(String[] args) {
		SomeClass objA = new SomeClass();
		objA.display();

		SomeClass objB = new SomeClass();
		objB.a = 10;							// update the inst.varb "a" to 10 not the local a
		objB.display();
		
		OtherClass objC = new OtherClass();
		objC.display(11);						// Update the local var. a to 11 inside the OtherClass method
		
		OtherClass objD = new OtherClass();
		objD.a = 12;							// update the instance varb. a = 1 to 12
		objD.display(22);						// Update the local varb. a to 22
	
		
	}

}
class SomeClass{
	
	int a = 1;
	
	public void display() {
		
		int a = 5;
		System.out.println(a);
		System.out.println("instance variable : "+ this.a);		// "this" is able to call the instance variable of a instead of local a 
	}
	
}
class OtherClass{
	
	int a = 1;
	
	public void display(int a) {
		
		System.out.println(a);
		System.out.println("instance variasle : "+ this.a);		// "this" is able to call the instance variable of a instead of local a 
	}
	
}