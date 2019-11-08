package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 
	for(Integer each : coll) {    			==>> 	you cannot use  a for each loop to remove or update an item!!!!!!!!!!!!!!!
		if (each>10) coll.remove(each);			GIVES CurrentModificationException
	} 									while we modify collection inside the loop   
										coll --> coll.remove(each) 
	Then we need to use iterator
	ITERATOR is an interface,it has 3 methods
	Itearator has 3 methods 
		.hasnext() 						>>boolean
		.next()
		.remove()						>>>void		
	iterator() method  returns an Iterator 
	
	System.out.println(iter);				>> gives hash code: java.util.ArrayList$Itr@65ae6ba4
									iterator is just a tool, helper not hold your  actual object 
 */

public class A001_Iterator {

	public static void main(String[] args) {
		
		Collection<Integer> coll = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9));	//Accepts any collection type
		Iterator<Integer> iter = coll.iterator();								
		System.out.println(coll);		  							// [2, 3, 4, 5, 6, 7, 8, 9]
	
//==>>  hasNext() returns  boolean
		System.out.println(iter.hasNext()); 				//true
//==>>next()
		System.out.println(iter.next());					// 2
		System.out.println(iter.next());					// 3
		System.out.println(iter.next());					// 4
//==>>remove()	
		iter.remove();								//  [2, 3, 5, 6, 7, 8, 9]  => 4 is removed WHY??
//		iter.remove();   -->can't use to remove follow each other -> EXCEPTION we currently deleted 4 since the pointer is still on the 5
		iter.next();								//  to avoid exception  => pointer goes to the next (6)
		iter.remove();								//  [2, 3, 6, 7, 8, 9]  => 5 is removed   
		System.out.println(coll);						//  [2, 3, 6, 7, 8, 9]
		
		while (iter.hasNext()) {						//  [2, 3, 6, 7]							
			if(iter.next()>7)
			iter.remove();
		}System.out.println(coll);						//  [2, 3, 6, 7]

		while (iter.hasNext()) {						//  [2, 3, 6, 7]	did not remove 6 and 7 						
			if(iter.next()>3)							// because the pointer is on 7 and "iter.hasNext()" is false
			iter.remove();
		}System.out.println(coll);
	
//	  System.out.println(iter.hasNext());					//false???? beacouse there is no more item 
		
			


	}
}
