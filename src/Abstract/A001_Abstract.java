package Abstract;

class Printer{
	public void show(Number n) {
		System.out.println(n);
	}
}


public class A001_Abstract {
	public static void main(String[] args) {
		Printer obj = new Printer();
		
		obj.show(5);			// 5
		obj.show(5.55);			// 5.55
		
// 
// we can use 5 or 5.55 both.
// instead of creating two methods, one for Integer and one for Double, 
//	one method with parameter Number can do the job. 
//	This is the beauty of abstract classes. Since Number is abstract class 
//	and parent of both Integer and Double classes.
		
	}

}
