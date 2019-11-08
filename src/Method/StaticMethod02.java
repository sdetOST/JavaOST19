package Method;

public class StaticMethod02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.normalMethod();
//		Test.normalMethod();		// !!->Can't call normal method with class name "Test".Error
		
		t.staticMethod();			// !!-> Shouldn't call static method with object name
		Test.staticMethod();
		
	}
}
class Test{
	
	int normalVariable=1;
	static int staticVariable=5;
		
	public void normalMethod() {
		System.out.println(""+ normalVariable);
		System.out.println(""+ staticVariable);
		staticMethod();								// it is ok but will interfere with line 35 (t2.notmalMethod();)
	}
	
	public static void staticMethod() {
		System.out.println(""+ staticVariable);
		
		
//		System.out.println(""+ normalVariable);		//Can't do normal variables inside static method like that. see below!
		Test t2 = new Test();						// ...now
		System.out.println(""+t2.normalVariable);	// ...it is ok.
		
//		normalMethod();								//Can't do normal method inside static method like that. see below!
		t2.normalMethod();							// ... now it is ok.but it will interfere with line 23 (staticMethod();)
		
	}
}
