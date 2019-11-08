package CyberInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 	ArrayList -- Remove some values
	Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
public class ArrayListRemoveValues {

	public static void main(String[] args) {


//	Solution 1:

		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

		ArrayList<Integer> list2 = new ArrayList<>();

		for (int each : list1)

			if (each < 100)

				list2.add(each);

		list1 = list2;

		System.out.println(list1);

//	Solution 2:

		List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

		Iterator<Integer> it = list3.iterator();

		while (it.hasNext())

			if (it.next() > 100)

				it.remove();

		System.out.println(list3);

//	Solution 3:

		List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

		for (ListIterator<Integer> il = list4.listIterator(); il.hasNext();)

			if (il.next() > 100)

				il.remove();

		System.out.println(list4);

//	Solution 4:

		ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

		list5.removeIf(p -> p > 5);

		System.out.println(list5);
	}
}
