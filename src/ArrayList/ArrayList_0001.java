package ArrayList;

import java.util.*;

public class ArrayList_0001 {

	public static void main(String[] args) {

////------------------create ArrayList-------------------------
//
		ArrayList<String> lst = new ArrayList<>();
		
		
//
////-------------------add ArrayList----------------------------
//
		lst.add(new String("Apple"));
		lst.add("Orange");
		lst.add("Banana");
		lst.add("Pear");
		lst.add("Grape");
		lst.add("Peach");
		lst.add("Palm");
		lst.add("Mandarin");			 // [Apple, Orange, Banana, Pear, Grape, Peach, Palm, Mandarin]
		System.out.println(lst);
		lst.remove(1);
		System.out.println(lst);
		lst.set(1, "aaaa");
		lst.add("Aaaa");
		lst.remove("Aaaa");
		lst.remove(0);
		System.out.println(lst);
		
		int  inum= lst.indexOf("Grape");
		boolean b ;
		if (lst.get(inum)=="Grape");	 b = true;
		System.out.println(b);
		if (lst.get(inum).equals("Grape"));	 b = true;
		System.out.println(b);

		lst.remove(0); // [Orange, Banana, Pear, Grape, Peach, Palm, Mandarin]
		lst.remove("Orange"); // [Banana, Pear, Grape, Peach, Palm, Mandarin]
		lst.set(0, "Watermalon"); // [Watermalon, Pear, Grape, Peach, Palm, Mandarin]
		lst.add(1, "Banana");

//		System.out.println(lst); // [Apple, Orange, Banana]
//
////-------------------getting element--------------------------
//		
//		System.out.println(lst.get(0));							// Apple
//		System.out.println(lst.get(2));							// Banana
//		
//		
////------------------getting indexOf----------------------	
//
//		System.out.println(lst.indexOf("Apple"));				// 0
//		System.out.println(lst.indexOf("Banana"));				// -1
//		System.out.println(lst.indexOf("z"));					// -1
//		
//
////------------------- sort ArrayList-------------------------------------
//
////				Collections.sort(lst);
//				System.out.println(lst);
//				
////------------------getting indexOf--------------------------	
//		
		Collections.sort(lst);
		System.out.println(lst);											 //
		int location1 = Collections.binarySearch(lst, "Palm"); 		// first sort
		System.out.println(location1);

		int location2 = Collections.binarySearch(lst, "zzzzz"); 		// first sort
		System.out.println(location2);									//-8
//
////-----------------reverse-----------------------------------
//		System.out.println(lst);
		Collections.reverse(lst);
//		System.out.println(lst);
//
////--------- shuffle items inside the list------------------ 
//		Collections.shuffle(lst);
//		System.out.println(lst);
////-------------------contains or not------------------------	
//		
//		System.out.println(lst.contains("Apple"));		// true
//		System.out.println(lst.contains("Peach"));		// false
//		
////-------------------emty or not------------------------	
//		
//		System.out.println(lst.isEmpty());				// false
//		
//		
////------------------- size of ArrayList-----------------
//		
//		System.out.println(lst.size());					// 3
//
////----------------ArrayList<Integer>------------------------------
//
\\





















































//		priceList.add(2, 10);
//		priceList.add(50);
//		priceList.set(1,60);
//		System.out.println(priceList);
//		
//		
//		priceList.remove(30);
//		priceList.remove(50);
//		System.out.println(priceList);
//		
//		priceList.remove(Integer.valueOf("40"));
//		System.out.println(priceList);
		
//
//		System.out.println(priceList);										// [1, 2, 10, 3, 4, 5, 6]
//		
////------------------- add/remove/replace ArrayList<Integer>------------------------
//
//		priceList.add(Integer.valueOf("20"));						 
//		priceList.add(Integer.parseInt("30"));
//		priceList.add((int) Short.valueOf("40"));
//		priceList.add((int) Short.parseShort("50"));
//
//		System.out.println(priceList);									// [1, 2, 10, 3, 4, 5, 6, 20, 30, 40, 50]
//		System.out.println(priceList.get(0));							// 1
//
//		priceList.remove(Integer.valueOf("50"));
//		priceList.remove(0);
//		priceList.remove(priceList.indexOf(40));
//		
//		System.out.println(priceList);									// [2, 10, 3, 4, 5, 6, 20, 30]
//
//		priceList.set(0, 60);
//		priceList.set(1, 70);
//		
//		System.out.println(priceList);									// [60, 70, 3, 4, 5, 6, 20, 30]
//		
//
//// ----------reverse with Collections-----------------------------------
//		Collections.reverse(priceList);
//		System.out.println(priceList);									// [30, 20, 6, 5, 4, 60, 10, 2]
//
//// ----------reverse with for loop-----------------------------------
//		ArrayList<Integer> pl1 = new ArrayList<>();
//		for (int i = 0, j = priceList.size() - 1; i < priceList.size(); i++, j--) {
//			pl1.add(i, priceList.get(j));
//
//		}
//		System.out.println(pl1);										// [2, 10, 60, 4, 5, 6, 20, 30]
//
//// ----------reverse with for loop-----------------------------------
//		ArrayList<Integer> pl2 = new ArrayList<>();
//		for (int i = priceList.size() - 1; i >= 0; i--) {
//			pl2.add(priceList.get(i));
//
//		}
//		System.out.println(pl2);										// [2, 10, 60, 4, 5, 6, 20, 30]
//
//		
//		
//// ----------reverse original ArrayList with for loop-----------------
//		
//		
//		for (int i = 0; i < priceList.size() / 2; i++) {
//
//			Integer temp1 = priceList.get(i);
//			// updating first item value to last item value
//			priceList.set(i, priceList.get(priceList.size() - 1 - i));
//			// updating last item value to original first item value
//			priceList.set(priceList.size() - 1 - i, temp1);
//
//		}
//		System.out.println(priceList);									// [2, 10, 60, 4, 5, 6, 20, 30]
//
//		
//	
////----------------------sum of ArrayList----------------------------------------		
//		Double sum = 0.0;
//		for (Integer each: priceList ) sum += each; 
//		
//		System.out.println(sum);
//
////------------------- replace of ArrayList---------------------------------------	
//		
//		priceList.add(1,400 );
//		System.out.println(priceList);
//		
//		priceList.set(2,500);
//		System.out.println(priceList);
//
////------------------- replace of ArrayList--------------------------------------
//		
//		lst.set(1,"Pear");
//		lst.set(2,"");
//		System.out.println(lst);					// [Apple, Pear, ]	
//
////---------------------create asList-------------------------------------------
//		ArrayList<Integer> a = new ArrayList<> (Arrays.asList(3, 5, 6, 7, 5, 4, 3));
//
//		// lst.add(100) ; // does not work
//		// lst.remove(0); // does not work
//		// lst.set(0, 100); // work
//		// then we need to copy to new ArrayList
//		System.out.println(a);
//		
//		a.addAll(a);
//		
//		System.out.println(a);
//
//// ------------------combine two list----------------------------------------
//
//
//		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
//
//		System.out.println(list1);
//		System.out.println(list2);
//
//		ArrayList<Integer> combineList = new ArrayList<>(list1);
//		combineList.addAll(list2);
//
//		System.out.println(combineList);
//
//////-------------------clear erase all items in ArrayList-------------------	
//
//		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7));
//		ArrayList<Integer> nums2 = new ArrayList<>();
//
//		for (int i = 0; i < nums.size(); i++) {
//			nums2.add(i, 2 * nums.get(i));
//
//		}
//		System.out.println(nums2);
//
	}

	
}
