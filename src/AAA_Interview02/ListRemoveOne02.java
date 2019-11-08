package a01;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveOne02 {
	/*
	 Given a list of integers 1,2,3,4,5,6,... 
	 remove all values greater than 100 and smaller than 1

	 negative test  0 and 150
	 positive test    1< num <=99
	 boundary analysis 1 and 100
	 
	 */
	public static void main(String[] args) {
		
	List<Integer> myList = new ArrayList<>();
	myList.add(0);
	myList.add(1);
	myList.add(5);
	myList.add(115);
	myList.add(100);
	myList.add(26);
	myList.add(5555);
	myList.add(-12);
	
	System.out.println(myList);
	
	for(int i = 0; i<myList.size(); i++) {
		if(myList.get(i) > 100 || myList.get(i) < 1) {
			myList.remove(i);
			i--;
		}
	}
	
	System.out.println(myList);
	
	
	
	
	
	}

}
