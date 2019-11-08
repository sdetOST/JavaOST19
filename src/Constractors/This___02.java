package Constractors;

public class This___02 {

	public static void main(String[] args) {
		OutherClass objA = new OutherClass();
		objA.a = 11;
		objA.display(11);

		SomeClass objB = new SomeClass();
		objB.a = 10;							//it will update the inst.varb "a" to 10 not the local a
		objB.display();
	}

}
class OutherClass{
	
	int a = 1;
	
	public void display(int a) {
		
		a = 5;
		System.out.println(a);
		System.out.println("instance variasle : "+ this.a);		// "this" is able to call the instance variable of a instead of local a 
	}
	
}
