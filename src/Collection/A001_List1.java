package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * List is the only interface that has index
 */
public class A001_List1 {

	public static void main(String[] args) {
		List<Double> lst = new LinkedList<>(Arrays.asList(3d, 4d, 5d, 6d, 7d, 8d, 9d, 10d, 3.0));

		System.out.println(lst);				// [3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 3.0]
		
// get(index)	
		System.out.println(lst.get(0));			// 3.0
// add(index) => returns boolean
		lst.add(11d);							// [3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 3.0, 11.0]
// add(index, obj) =>void
		lst.add(0, 6d);							// [6.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 3.0, 11.0]
// set(index,obj) ==> replace
		lst.set(0, 3.0);						// [3.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 3.0, 11.0]
// indexOf(obj)	
		lst.indexOf(4.0);						// 0
// lastIndexOf(obj)
		lst.lastIndexOf(3.0);					// 8
// remove(index)
		lst.remove(7); 							// index7th (9) removed  [3.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 10.0, 3.0, 11.0]
		lst.remove(7d);							// 7.0 removed  [3.0, 3.0, 4.0, 5.0, 6.0, 8.0, 10.0, 3.0, 11.0]
		lst.remove(3.0);						// first 3.0 removed  [3.0, 4.0, 5.0, 6.0, 8.0, 10.0, 3.0, 11.0]
		lst.removeAll(Arrays.asList(3d));		// aLL 3.0 S removed  [4.0, 5.0, 6.0, 8.0, 10.0,11.0]
		System.out.println(lst);
// addAll(index, Collection<>)
		lst.addAll(4, Arrays.asList(12d, 13d));		// [3.0, 3.0, 4.0, 5.0, 12.0, 13.0, 6.0, 7.0, 8.0, 10.0, 3.0, 11.0]
// replaceAll(Function:unary operator)
		lst.replaceAll(each -> each * 2);			// replace each item new value multipled by 2  // [6.0, 6.0, 8.0, 10.0, 24.0, 26.0, 12.0, 14.0, 16.0, 20.0, 6.0, 22.0]
				

// sort(Collections) 		
		Collections.sort(lst);  System.out.println(lst);
		Collections.reverse(lst); System.out.println(lst);
		Collections.shuffle(lst); System.out.println(lst);
		
// sort(Comparator<>) 		
		lst.sort(null);								// naturaLOrder
		lst.sort(Comparator.naturalOrder());		// [6.0, 6.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 20.0, 22.0, 24.0, 26.0]
		lst.sort(Comparator.reverseOrder());		// [26.0, 24.0, 22.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0, 6.0,]
		lst.sort(Collections.reverseOrder());		// [26.0, 24.0, 22.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0,6.0,]
		
//===============VIEW OF YOUR LIST=============
// getting view out of List
// View is part of original list, not a new object
// Whatever you do with sublist will affect your original list as well!!!!!!

//subList(fromIndex, toIndex) 			--- toIndex excluded
		lst.subList(3, 7);						// [20.0, 16.0, 14.0, 12.0]
		List<Double> partOfListView = lst.subList(2, 5);	// [22.0, 20.0, 16.0]
		partOfListView.set(0, 100d);					// [100.0, 20.0, 16.0]
		System.out.println(lst);					// [26.0, 24.0, 100.0, 20.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 6.0, 6.0]
// ===========LIST ITERATOR====================================================================================
// lst.listIterator()
		ListIterator<Double> iter = lst.listIterator();

// hasNext()		
		System.out.println(iter.hasNext());				// true
// nextIndex() exclusively for List		 
		System.out.println(iter.nextIndex());			// 0

// for each loop also works if you don't update or remove items
		while (iter.hasNext()) {
			Double each = iter.next();
			System.out.print(each+" ");			// 26.0 24.0 22.0 100.0 16.0 14.0 12.0 10.0 8.0 6.0 6.0 6.0

			if (each> 10) iter.remove();
		}
		
		System.out.println();
		System.out.println(lst);					// [10.0, 8.0, 6.0, 6.0, 6.0]
		System.out.println(iter.hasNext());				// false =>> no more item

// hasPrevious() boolean
		System.out.println(iter.hasPrevious());			// true
// previous()		 
		System.out.println(iter.previous()); 			// 6.0
// previousIndex()		
		System.out.println(iter.previousIndex());			// 3
		System.out.println(lst);
		while (iter.hasPrevious()) {
			Double each = iter.previous();
			System.out.print(each + " ");				// 6.0 111.0 6.0 111.0 8.0 10.0  
											// you can remove items in this loop too
			if (each == 6.0) {
				iter.remove();
////				iter.set(100d);
				iter.add(111d);
				
			}
			System.out.print(each + " ");	

		}
		System.out.println();
		System.out.println(lst);

	}
}

