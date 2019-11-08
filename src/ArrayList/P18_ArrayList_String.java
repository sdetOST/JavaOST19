package ArrayList;
import java.util.ArrayList;

public class P18_ArrayList_String {

	public static void main(String[] args) {
		
		ArrayList<String> myAList = new ArrayList<String>();		// create new array list
																	// "add" some values to list 
		myAList.add("Hello"); myAList.add("world"); myAList.add("my"); 
		myAList.add("name"); myAList.add("is");	myAList.add("Homer");	
		
		System.out.println(myAList);
System.out.println("---------------------------------");

		System.out.println("Homer is at index: " + myAList.indexOf("Homer"));	// search for index
		System.out.println("world is at index: " + myAList.indexOf("world"));
System.out.println("---------------------------------");

		System.out.println("The string of index 0: "+myAList.get(0));	// "get" method
		System.out.println("The string of index 1: "+myAList.get(1));
System.out.println("---------------------------------");

		if(myAList.contains("Bill")) {									// contains
			System.out.println("Found Bill");			
		}
		else {
			System.out.println("Did not find Bill.");
		}
System.out.println("---------------------------------");

		myAList.remove(1);										// "remove" an element
		System.out.println(myAList);
System.out.println("---------------------------------");

		System.out.println(myAList.size());						// determine the "size"
System.out.println("---------------------------------");

		for(int x=0; x < myAList.size(); x++) {					// "set":add 7 to each value 
			myAList.set(x,myAList.get(x) + " dude");
		}
		System.out.println(myAList);
System.out.println("---------------------------------");


	}
}
