package ArrayList;
import java.util.ArrayList;

public class P17_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> myAList = new ArrayList<Integer>();		// create new array list
																	// "add" some values to list 
		myAList.add(5); myAList.add(10); myAList.add(15); myAList.add(20);			
		
		System.out.println(myAList);
System.out.println("---------------------------------");

		System.out.println("5 is at index: " + myAList.indexOf(5));		// search for index
		System.out.println("15 is at index: " + myAList.indexOf(15));
System.out.println("---------------------------------");

		System.out.println("The value of index 0: "+myAList.get(0));	// "get" method
		System.out.println("The value of index 1: "+myAList.get(1));
System.out.println("---------------------------------");

		if(myAList.contains(30)) {									// contains
			System.out.println("Found 30");			
		}
		else {
			System.out.println("Did not find 30");
		}
System.out.println("---------------------------------");

		myAList.remove(2);										// "remove" an element on index 2
		System.out.println(myAList);							// which is 10
System.out.println("---------------------------------");

		System.out.println(myAList.size());						// determine the "size"
System.out.println("---------------------------------");

		for(int x=0; x < myAList.size(); x++) {					// "set":add 7 to each value 
			myAList.set(x,myAList.get(x)+7);
		}
		System.out.println(myAList);
System.out.println("---------------------------------");

	//	ArrayList<String> stringArList = new ArrayList<String>();	// create string array list
	//	strind
		
	}
}
