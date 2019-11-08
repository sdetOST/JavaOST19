package Array;
import java.util.*;

public class aaa {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));
		
		int [] a = new  int[] {1,2,3};
		Integer[] b = new Integer [] {1,2,3};
		
		int[] c= new int [5];
		Integer [] d = new Integer [5];
		
		a=c;
		b=d;

		System.out.println(a[0]+" - "+a[4]);
		System.out.println(b[0]+" - "+b[4]);
		
//		c=a;
//		d=b;
//		
//		System.out.println(c.length);
//		System.out.println(d.length);
		
		
	}
}




