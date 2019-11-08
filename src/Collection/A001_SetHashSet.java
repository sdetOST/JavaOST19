package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class A001_SetHashSet {

	public static void main(String[] args) {

		/*
		 * Collection | Set | HashSet
		 */

		Set<Integer> mynum = new HashSet<>();			// hashset is not a sorted set
// 		Set<Integer> mynum1 = new TreeSet<>();
// 		SortedSet<Integer> mynum2 = new HashSet<>(); 		

		mynum.add(10);							// true
		mynum.add(10);							// false --> can't duplicate
		mynum.add(10);							// false --> can't duplicate
		mynum.add(7);							// false --> can't duplicate
		mynum.add(7);							// false --> can't duplicate
		mynum.add(7);							// true
		mynum.add(7);							// false --> can't duplicate
		mynum.add(7);							// false --> can't duplicate
		
		System.out.println(mynum);					// [7, 10]
		

// write all items with LAMBDA expression works for each loop
		mynum.forEach(deniz -> System.out.println(deniz)); 					// 7 10 no duplication
		
// addAll(Collection<>) ==>>accepst a colection type		
		Set<Integer> mynum1 = new TreeSet<>(Arrays.asList(5,1,4,2,3)); 		// new sortedSet [1, 2, 3, 4, 5]
		System.out.println(mynum1);
		mynum.addAll(mynum1);										// add mynum1 to mynum
		System.out.println(mynum);									// [1, 2, 3, 4, 5, 7, 10]

// addAll(List)
		mynum.addAll(Arrays.asList(13, 11, 11, 12, 11));	// addAll(Collection<>) ONESHOT 
		System.out.println(mynum);					// [1, 2, 3, 4, 5, 7, 10, 11, 12, 13]  only one 11 added

// REMOVE ==>>accepts an ob
System.out.println("===  REMOVE ==>>accepts an ob  ==================");

		mynum.remove(11);
		System.out.println(mynum);					// [1, 2, 3, 4, 5, 7, 10, 12, 13]
		
		System.out.println(mynum.remove(11));			// false
		System.out.println(mynum);					// [1, 2, 3, 4, 5, 7, 10, 12, 13]
		
		
// removeAll(Collection<>) accepts a list
System.out.println("===  removeAll(Collection<>) accepts a list  ==================");

		mynum.removeAll(Arrays.asList(11, 12, 13)); 		// there is no 11 on mynum 
		System.out.println(mynum);					// [1, 2, 3, 4, 5, 7, 10]  ignores 11

		
// UPDATE AN ITEM==>Check whether it already exists
// set(index, obj)  method does not exist in Set interface		
// Why set does not work in here ???

// step 1 Lets add a new item
		mynum.add(null);						// I added item, it is there now
		System.out.println(mynum);				// [null, 1, 2, 3, 4, 5, 7, 10]

// So how do we check whether it already exists?		
// How to check if item is there ???????
// how do we update itmes in the list?? set(index, obj)
// mynum.add(null)) returns false , null is already there
		
		if (!mynum.add(null)) { 				// check if item is there
			mynum.remove(null); 				// remove
			mynum.add(10); 					// add
		}
		System.out.println(mynum);// [1, 2, 3, 4, 20, 5, 7, 10]
		
		
//============ Sorted Set =========================================================================

		SortedSet<Long> sset = new TreeSet<>();
		sset.add(3L);							// true  - added
		sset.add(20L);							// true  - added
		sset.add(39L);							// true  - added
		sset.add(27L);							// true  - added
		sset.add(20L);							// false - duplicated  - can not add
//		sset.add(null);							// null is not allowed to SortedSet
		
		System.out.println(sset);					// [3, 20, 27, 39]   --> sorted
		System.out.println(sset.size());				// 4
// addAll		
		sset.addAll(Arrays.asList(15L, 18L,15L, 18L ));	 	// [3, 15, 18, 20, 27, 39] --> 15L and 18L added ones in to sset. 

// getting view of sset
		sset.subSet (15L, 21L);						// [ 15, 18, 20 ]
		sset.headSet (18L);						// [ 3, 15 ]
		sset.tailSet (18L);						// [ 18, 20, 27, 39]
		
		SortedSet<Long> ssetTailView = sset.tailSet (18L);
		ssetTailView.remove(20L);
		
		System.out.println(ssetTailView);				// [18, 27, 39]         --> 20 removed from ssetTailView
		System.out.println(sset);					// [3, 15, 18, 27, 39]  --> also from sset
		
		
//============ Navigable Set =========================================================================
		
		NavigableSet<Long> nset = new TreeSet<>();
		nset.add(3L);							// true  - added
		nset.add(20L);							// true  - added
		nset.add(39L);							// true  - added
		nset.add(27L);							// true  - added
		nset.add(20L);							// false - duplicated  - can not add
		nset.addAll(Arrays.asList(66L, 55L,44L, 22L ));		// [3, 20, 22, 27, 39, 44, 55, 66]		
		
// lover
		System.out.println(nset.lower(25L));			// 22 -> gives the lover closes one not exact
		System.out.println(nset.lower(44L));			// 39 -> gives the lover closes one not exact
// higher
		System.out.println(nset.higher(25L));			// 27 -> gives the higher closes one not exact
		System.out.println(nset.higher(44L));			// 55 -> gives the higher closes one not exact
// floor	
		System.out.println(nset.floor(25L));			// 22 -> gives the lover closes one or exact
		System.out.println(nset.floor(44L));			// 44 -> gives the lover closes one or exact
// ceiling
		System.out.println(nset.ceiling(25L));			// 27 -> gives the higher closes one or exact
		System.out.println(nset.ceiling(44L));			// 44 -> gives the higher closes one or exact
// pollFirst									//					      [3, 20, 22, 27, 39, 44, 55, 66]
		System.out.println(nset.pollFirst());			// 3  -> poll first item and remove -> [20, 22, 27, 39, 44, 55, 66]	
// pollLast		
		System.out.println(nset.pollLast());			// 66 -> poll last item and remove  -> [20, 22, 27, 39, 44, 55]
// descendingSet
		System.out.println(nset.descendingSet());			// [55, 44, 39, 27, 22, 20] -> do not change the original set
// subset
		System.out.println(nset.subSet(22L, 44L));			// [22, 27, 39] ->    left included,        right excluded  (regularly)
		System.out.println(nset.subSet(22L, false, 44L, true));	// [27, 39, 44] ->  22-false > excluded	44-true > included
// headSet
		System.out.println(nset.headSet(22L,false));			// [20] 	    -> 22-false > excluded
		System.out.println(nset.tailSet(39L,true));			// [39, 44, 55] -> 39-true  > included
		
		Iterator<Long> iter = nset.descendingIterator();
		while(iter.hasNext()) 
			System.out.print(iter.next()+" ");				// 55 44 39 27 22 20 
		
		
	}
	
}