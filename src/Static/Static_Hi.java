package Static;
import java.util.Scanner;
public class Static_Hi {
	
	public static void main(String[] args) {
		
// to rich to ege which is static field 		
//1 creating object which is not so good
		Hello x = new Hello();
		x.age = 10;
		System.out.println(x.age);
//2 Static way, call from the class name Hello 		
		Hello.age=10;
		
		Hello.DoSomething("Hi youtube");
		Hello.DoSomethingElse("hello world");
			

		
	}
}
