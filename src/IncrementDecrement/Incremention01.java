package IncrementDecrement;

public class Incremention01 {

	public static void main(String[] args) {
		
        int x=1;
        System.out.println(++x);		//	2
        System.out.println(++x);		//	3 
        System.out.println(++x);		//	4
        System.out.println(x++);		//	4
        System.out.println(x);			//	5
        System.out.println(x++);		//	5
        System.out.println(++x);		//	7
        System.out.println(x++);		//	7
        System.out.println(++x);		//	9
        System.out.println("The value of x become  " + x);
    }
}