package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A001_Iterator {

	public static void main(String[] args) {
		
		Collection values = new ArrayList();
		values.add(4);
		values.add("Y");
		values.add(9);
		values.add("X");
		
		Iterator it = values.iterator();						// we can 
		while(it.hasNext())  System.out.println(it.next());
	
		for (Object o: values )  System.out.println(o);
		


	}

}
