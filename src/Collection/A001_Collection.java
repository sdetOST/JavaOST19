package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



/*		   					Iterable
								|					              					 									Map
								|  					    	   	 														HashMap(C)				
							Collections 				          	   														|
			|		       		|             				  |           	 	 											SortedMap
			List         	  		Set     	  				Queue 			     										TreeMap(C)
			|			  		HashSet(C)   			PriorityQueue(C)
		ArrayList(C)			|		  				 |
		LinkedList(C) 			SortedSet    			Deque     
								TreeSet(C) 	 		 ArrayDeque(C)
								LinkedList(C)
		
Iterable is an interface the rest are interfaces implements to iterabe;

WHY MAP DOES NOT extend the collection interface??
=>List  stores all elements in order you give
=>Set stores unique named element only
=>Queue provides you whatever element you give first you take first
===>>>Everything above each element stores only ONE element
BUT MAP stores value and key as pair, like a dictinary(word and definition).So one spot stores key and value pair
=>Map  makes pairs, Stores city name with Student names example
===============================================================
*/
public class A001_Collection {

	public static void main(String[] args) {

//========= COLLECTION INTERFACE METHODS==============//

		Collection<Integer> c = new ArrayList<>();
		// Collection<Integer> c1 = new HashSet<>();
		// Collection<Integer> c2 = new Collection<>();
		// Collection<Integer> c3 = new TreeSet<>();

//==>> add(obj)	>>>also returns a boolean	
		c.add(2);
		c.add(9);
		c.add(26);
		System.out.println(c.add(14));				// true
		System.out.println(c);						// [2, 9, 26, 14]

//==>>addAll(Collection<>)	
		c.addAll(Arrays.asList(5, 6, 7, 8, 9));
		System.out.println(c);							// [2, 9, 26, 14, 5, 6, 7, 8, 9]

//==>size()	 returns int	
		System.out.println(c.size());					// 9

//==>isEmpty()	
		System.out.println(c.isEmpty());				// false

//==>remove(obj)  returns boolean	
		c.remove(9);
		System.out.println(c);							// [2, 26, 14, 5, 6, 7, 8, 9]=> removes first appeared item
		System.out.println(c.remove(99));				// false

//==>>contains(obj)	
		System.out.println(c.contains(14));				// true

//containsAll(Collection)
		System.out.println(c.containsAll(Arrays.asList(6, 7, 8)));		// true

//==>>removeAll(collection<>)  returns boolean
		System.out.println(c.removeAll(Arrays.asList(6, 7, 8)));		// true
		System.out.println(c);											// [[2, 26, 14, 5, 9]

//==>>retainsAll()  keep!!!!!
		// System.out.println(c.retainAll(Arrays.asList(26,9)));
		// System.out.println(c);											//[26, 9]

																			//[2, 26, 14, 5, 9]
//removeIf(Predicate...)
		c.removeIf(deniz -> deniz > 14);
		System.out.println(c);												// [2, 14, 5, 9]

//Turning into an array

		Integer[] arr1 = c.toArray(new Integer[3]);						// ==>>>T
		System.out.println(Arrays.toString(arr1));						// [2, 14, 5, 9]

		Integer[] arr2 = c.toArray(new Integer[7]);						// ==>>>T
		System.out.println(Arrays.toString(arr2));						// [2, 14, 5, 9, null, null, null]

		// TODO Auto-generated method stub

	}

}
