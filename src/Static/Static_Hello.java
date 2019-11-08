package Static;
import java.util.Scanner;
public class Static_Hello {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.age = 10;
		System.out.println(Hello.age);
		
		//Hello.DoSomething("Hi youtube");
		//hello.DoSomethingElse("hello world");
			
		Hello hello1 = new Hello();
		hello1.age = 50;
		System.out.println(hello1.age);
		
	}
//	public static void main(String[] args) {
//		Hi x = new Hi();
//		x.age = 10;
//		System.out.println(x.age);
//		
//		//Hello.DoSomething("Hi youtube");
//		//hello.DoSomethingElse("hello world");
//			
//		X x1 = new X();
//		x1.age = 50;
//		System.out.println(x1.age);
//		
//	}
	
}